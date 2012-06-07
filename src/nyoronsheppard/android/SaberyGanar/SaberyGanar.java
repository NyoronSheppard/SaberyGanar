package nyoronsheppard.android.SaberyGanar;


//Paquetes Android
import android.app.Activity;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;


/**
 * Clase Principal del programa
 * @author nyoronsheppard
 * @date   29/03/2012
 * @version 0.1.7
 */
public class SaberyGanar extends Activity 
{
	//Constantes
	public final int KMAX = 22;
	
	
	//Variables	
	private ListButtons frases = new ListButtons();  	
	private ButtonSound[] buttons = new ButtonSound[KMAX];
	
	//Back Button

	
	OnClickListener buttonClick;

	SoundManager snd;
	OnSeekBarChangeListener barChange;
	
	TextView seleccionado;
	ListView lstOpciones;
	
	//Métodos de la clase
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
        AdaptadorButtons adaptador = new AdaptadorButtons(this);
        
        lstOpciones = (ListView)findViewById(R.id.LstOpciones);
        seleccionado = (TextView)findViewById(R.id.seleccionado);
        
        snd = new SoundManager(getApplicationContext());
        
        lstOpciones.setAdapter(adaptador); 
           
        
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        
        
        frases.setButtons();       
        
        for(int i = 0; i < KMAX; i++)
        {
        	buttons[i] = frases.getPosition(i);
        	buttons[i].setId(snd.load(frases.getId(i)));
        }
        
        lstOpciones.setTextFilterEnabled(true);
        
    }
    

    /**
     * Clase que nos guarda IDs de layouts para ahorrar memoria
     */
    static class ViewHolder 
    {
        Button titlesound;
    }
    
  
    /**
     * Adaptador para Incorporar los botones de Clase ButtonSound
     */
    class AdaptadorButtons extends ArrayAdapter  implements OnClickListener
    {
    	 
        Activity context;
        
        	/**
        	 * Constructor de la clase
        	 * @param context Contexto donde vamos a crear el constructor
        	 */
            @SuppressWarnings("unchecked")
			AdaptadorButtons(Activity context) 
            {
            	super(context, R.layout.buttonsound, buttons);
                this.context = context;
            }
     
            //Métodos
            
            /**
             * Metodo getView utilizado para mostrar la lista
             */
            public View getView(int position, View convertView, ViewGroup parent)
            {
                View item = convertView;
                ViewHolder holder;
             
                //Con esto ahorramos CPU (no hay que generar los items que no aparecen en la pantalla
                if(item == null)
                {
                    LayoutInflater inflater = context.getLayoutInflater();
                    item = inflater.inflate(R.layout.buttonsound, null);
             
                    //Creamos el ViewHolder y guardamos los ID del Objeto
                    holder = new ViewHolder();
                    holder.titlesound = (Button)item.findViewById(R.id.LblTitulo);

                    item.setTag(holder);
                }
                else
                {
                    holder = (ViewHolder)item.getTag();
                }
             
                //Metodos set de la clase Titulo (Se utilizan para rellenar los botones)
                holder.titlesound.setText(buttons[position].getTitleSound());                       
               	holder.titlesound.setTag(position);
                holder.titlesound.setOnClickListener(this);

                
                return(item);
            }
            
            /**
             * Metodo onClick para seleccionar el sonido
             * del arrayAdapter
             */
            public void onClick(View v) 
            {           	
            	int position = (Integer)v.getTag();  
            	           	                      	
            	seleccionado.setText("Has seleccionado: \n" + buttons[position].getTitleSound());
            	
            	snd.play(buttons[position].getId()); 

            }
                       
    }   
    
    /**
     * Metodo para liberar memoria y parar la aplicacion
     * cuando utilizamos el boton "Back"
     * @param keyCode Codigo del boton
     * @param event Evento que se quiere hacer
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if ((keyCode == KeyEvent.KEYCODE_BACK))
        {
        	snd.unloadAll(); //Eliminamos de la memoria todas las canciones
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }
    
}


package nyoronsheppard.android.SaberyGanar;


//Paquetes Android
import android.app.Activity;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.TextView;


/**
 * Clase Principal del programa
 * @author nyoronsheppard
 * @date   29/03/2012
 * @version 0.0.6
 */
public class SaberyGanar extends Activity 
{
	//Constantes
	public final int KMAX = 22;
	
	
	//Variables	
	private ListButtons frases = new ListButtons();  	
	private ButtonSound[] buttons = new ButtonSound[KMAX];
	
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
        
        lstOpciones.setOnItemClickListener(new OnItemClickListener() 
        {
        	
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
            	seleccionado.setText("Has seleccionado: " + buttons[position].getTitleSound());
            	snd.play(buttons[position].getId());
            }
         });
        
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
    class AdaptadorButtons extends ArrayAdapter
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
             
                //Metodos get de la clase Titulo
                holder.titlesound.setText(buttons[position].getTitleSound());
                                          
                return(item);
            }

    }
    
  
    
    
}


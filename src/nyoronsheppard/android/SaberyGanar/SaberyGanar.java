package nyoronsheppard.android.SaberyGanar;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Clase Principal del programa
 * @author nyoronsheppard
 *
 */
public class SaberyGanar extends Activity 
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    

    //Clase que nos guarda IDs de layouts para ahorrar memoria
    static class ViewHolder 
    {
        TextView titlesound;
    }
    
    //Adaptador para Incorporar los botones de Clase Titular
    class AdaptadorTitulares extends ArrayAdapter 
    {
    	 
        Activity context;
     
        	//Constructor de la clase
            @SuppressWarnings("unchecked")
			AdaptadorTitulares(Activity context) 
            {
                super(context, R.layout.buttonsound, datos); //Datos es el array, hay que cambiarlo
                this.context = context;
            }
     
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
                    holder.titlesound = (TextView)item.findViewById(R.id.LblTitulo);
             
                    item.setTag(holder);
                }
                else
                {
                    holder = (ViewHolder)item.getTag();
                }
             
                //Metodos get de la clase Titulo
                holder.titlesound.setText(datos[position].getTitulo());
             
                return(item);
            }
    }
    
}


package nyoronsheppard.android.SaberyGanar;

//Paquetes Android
import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

/**
 * Clase encargada de administrar el sonido
 * @author nyoronsheppard
 * @date   30/03/2012
 * @version 0.1
 */
public class SoundManager {

	//Variables
	private Context pContext;
	private SoundPool sndPool;
	private float rate = 1.0f;
	private float masterVolume = 1.0f;
	private float leftVolume = 1.0f;
	private float rightVolume = 1.0f;
    private float balance = 0.5f;
 
    //Constructor
    
    /**
     * Constructor de SoundManager
     * @param appContext Contexto donde lo situamos
     */
    public SoundManager(Context appContext)
    {
  	  sndPool = new SoundPool(16, AudioManager.STREAM_MUSIC, 100);
   	  pContext = appContext;
    }
    

    /**
     * Cargar sonido
     * @param sound_id Identificador del sonido
     * @return sndPool.load(pContext, sound_id, 1)
     */
    public int load(int sound_id)
    {
    	return sndPool.load(pContext, sound_id, 1);
    }
     

    /**
     * Reproducir sonido
     * @param sound_id Identificador del sonido
     */
    public void play(int sound_id)
    {
    	sndPool.play(sound_id, leftVolume, rightVolume, 1, 0, rate);
    }
    
    //Metodos de las SeekBar
    

    /**
     * Metodo para controlar el volumen
     * @param vol Volumen
     */
    public void setVolume(float vol)
    {
        masterVolume = vol;
 
        if(balance < 1.0f)
        {
        	leftVolume = masterVolume;
        	rightVolume = masterVolume * balance;
        }
        else
        {
			rightVolume = masterVolume;
			leftVolume = masterVolume * ( 2.0f - balance );
        }
 
    }
    
    /**
     * Metodo para controlar la velocidad
     * @param speed velocidad
     */
    public void setSpeed(float speed)
    {
    	rate = speed;
    	if(rate < 0.01f)
                 rate = 0.01f;
            if(rate > 2.0f)
    		rate = 2.0f;
    }
     

    /**
     * Metodo para controlar el balance
     * @param balVal
     */
    public void setBalance(float balVal)
    {
    	balance = balVal;
    	setVolume(masterVolume);
    }
    

    /**
     * Metodo para liberar memoria cuando cerremos la aplicacion
     */
    public void unloadAll()
    {
    	sndPool.release();
    }

}

package nyoronsheppard.android.SaberyGanar;

//Paquetes java
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//Paquetes android
import android.app.Activity;
import android.util.Log;

/**
* Clase para extraer los .mp3
* @author nyoronsheppard
* @date 09/06/2012
* @version 0.1.0
*/
public class ExternalStorage 
{

	//Constantes
	public final int KMAX = 22;

	//Variables
	private ButtonSound[] buttonList = new ButtonSound[KMAX];

	Activity context;

	/**
	 * Constructor de la clase
	 * @param soundId Posicion en el vector del sonido
	 */
	public ExternalStorage(Activity context)
	{
		this.context = context;
	}

	/**
	 * Metodo get que devuelve la Actividad
	 * @return
	 */
	public Activity getExternalStorageActivity()
	{
		return(context);
	}

	/**
	 * Metodo set para cambiar la Actividad
	 * @param context Actividad de la aplicacion
	 */
	public void setExternalStorageActivity(Activity context)
	{
		this.context = context;
	}	

	/**
	 * Metodo para extraer de la aplicacion al movil
	 * los archivos de sonido
	 */
	public void createExternalStoragePublicSound(int soundId)
	{

		File path = new File("/sdcard/media/audio/notifications/");
		File file = new File(path, buttonList[soundId].getNameSound() + ".mp3");

		try {
			// Crea el directorio que le pasamos por path
			path.mkdirs();

			InputStream is = context.getResources().openRawResource(buttonList[soundId].getId());
			OutputStream os = new FileOutputStream(file);
			byte[] data = new byte[is.available()];

			//Leemos el fichero para luego escribirlo en el Directorio de path
			is.read(data);
			os.write(data);

			//Cerramos lectura/escritura
			is.close();
			os.close();

		} catch (IOException e) {
			Log.w("ExternalStorage", "Error de escritura" + file, e);
		}
	}

	/**
	 * Metodo para borrar los archivos .mp3 del movil
	 */
	public void deleteExternalStoragePublicSound(int soundId)
	{
		File path = new File("/sdcard/media/audio/notifications/");
		File file = new File(path, buttonList[soundId].getNameSound() + ".mp3");

		file.delete();
	}

	/**
	 * Metodo para ver si el fichero existe
	 * @return file.exists()
	 */
	public boolean hasExternalStoragePublicSound(int soundId)
	{	

		File path = new File("/sdcard/media/audio/notifications/");
		File file = new File(path, buttonList[soundId].getNameSound() + ".mp3");

		return file.exists();
	}

}

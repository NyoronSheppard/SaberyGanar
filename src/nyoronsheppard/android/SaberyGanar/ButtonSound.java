package nyoronsheppard.android.SaberyGanar;

/**
 * Clase Button
 * @author nyoronsheppard
 * @date   29/03/2012 
 * @version 0.0.1
 */
public class ButtonSound {
	
	//Variables

	private String titlesound;
	
	
	//Constructores
	
	/**
	 * Constructor parametizado
	 * @param titlesound Titulo del sonido
	 */
	public ButtonSound(String titlesound)
	{
		this.titlesound = new String(titlesound);
	}
	
	
	//Métodos
	
	/**
	 * Metodo get de la Clase
	 * @return titlesound String con el titulo del sonido
	 */
	public String getTitleSound()
	{
		return (titlesound);
	}
	

}

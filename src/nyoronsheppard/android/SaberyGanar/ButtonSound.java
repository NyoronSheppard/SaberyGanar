package nyoronsheppard.android.SaberyGanar;

/**
 * Clase Button
 * @author nyoronsheppard
 * @date   29/03/2012 
 * @version 0.0.5
 */
public class ButtonSound {
	
	//Variables

	private String titlesound;
	private int id;
	
	
	//Constructor
	
	/**
	 * Constructor parametizado
	 * @param titlesound Titulo del sonido
	 */
	public ButtonSound(String titlesound)
	{
		this.titlesound = new String(titlesound);
		this.id = -1;
	}
	
	
	/**
	 * Metodo get de la Clase
	 * @return titlesound String con el titulo del sonido
	 */
	public String getTitleSound()
	{
		return (titlesound);
	}
	
	/**
	 * Metodo para obtener la Id
	 * @return id Identificador
	 */
	public int getId()
	{
		return (id);
	}
	
	/**
	 * Metodo para cambiar la id
	 * @param id Identificador
	 */
	public void setId(int id)
	{
		this.id = id;
	}
	

}

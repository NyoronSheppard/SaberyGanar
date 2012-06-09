package nyoronsheppard.android.SaberyGanar;

/**
* Clase Button
* @author nyoronsheppard
* @date 29/03/2012
* @version 0.0.9
*/
public class ButtonSound 
{

	//Variables

	private String titlesound;
	private String namesound;
	private int id;


	//Constructor

	/**
	 * Constructor parametizado
	 * @param titlesound Titulo del sonido
	 */
	public ButtonSound(String titlesound, String namesound)
	{
		this.titlesound = new String(titlesound);
		this.namesound = new String(namesound);
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
	 * Metodo para obtener el nombre del sonido
	 * @return namesound Nombre del Sonido
	 */
	public String getNameSound()
	{
		return (namesound);
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

	/**
	 * Metodo para cambiar el nombre del sounid
	 * @param namesound Nombre del sonido
	 */
	public void setNameSound(String namesound)
	{
		this.namesound = namesound;
	}

}
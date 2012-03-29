package nyoronsheppard.android.SaberyGanar;


/**
 * Clase ListButtons
 * @author nyoronsheppard
 * @date   29/03/2012 
 * @version 0.0.5
 */
public class ListButtons {
	
	//Constantes
	private final int KMAX = 2;
	
	
	//Variables
	private ButtonSound[] buttonlist;
	
	
	//Constructor
	/**
	 * Constructor de la clase
	 */
	public ListButtons()
	{
		this.buttonlist = new ButtonSound[KMAX];
	}
	
	//Métodos get
	
	/**
	 * Metodo que dada una posicion, te devuelve el objeto
	 * @param position Posicion en la lista de frases
	 * @return
	 */
	public ButtonSound getPosition(int position)
	{		
		return (buttonlist[position]);
	}

	/**
	 * Metodo que devuelve el tamaño maximo de la lista
	 * @return KMAX
	 */
	public int getSize()
	{
		return (KMAX);
	}
	
	//Métodos set
	
	/**
	 * Metodo que añade los nombres de los sonidos
	 */
	public void setButtons()
	{
	
		for(int i = 0; i < KMAX; i++)
		{
			buttonlist[i] = new ButtonSound("Titulo "+String.valueOf(i+1));
		}

	}
	

}

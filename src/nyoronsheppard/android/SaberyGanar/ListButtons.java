package nyoronsheppard.android.SaberyGanar;


/**
 * Clase ListButtons
 * @author nyoronsheppard
 * @date   29/03/2012 
 * @version 0.0.5
 */
public class ListButtons {
	
	//Constantes
	private final int KMAX = 22;
	
	
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
	
		buttonlist[0]  = new ButtonSound("Bravo bravo bravo bravo");
		buttonlist[1]  = new ButtonSound("Cambiamos la luz compañeros");
		buttonlist[2]  = new ButtonSound("Lo dijo justo cuando iba a sonar la campana");
		buttonlist[3]  = new ButtonSound("El cerebro hay que alimentarlo");
		buttonlist[4]  = new ButtonSound("Pero que cuerpo");
		buttonlist[5]  = new ButtonSound("De saber y ganar");
		buttonlist[6]  = new ButtonSound("Que se celebra en alcoy");
		buttonlist[7]  = new ButtonSound("Ha ha ha ha");
		buttonlist[8]  = new ButtonSound("Juanjo, tiempo");
		buttonlist[9]  = new ButtonSound("Lo ha conseguido, lo ha conseguido!");
		buttonlist[10] = new ButtonSound("La magia de la television");
		buttonlist[11] = new ButtonSound("Hay que ver menudo lio");
		buttonlist[12] = new ButtonSound("Con el micrófono en la mano");
		buttonlist[13] = new ButtonSound("Aqui les esperamos cada dia");
		buttonlist[14] = new ButtonSound("No pasa nada");
		buttonlist[15] = new ButtonSound("Soy un tipo duro, duro de verdad");
		buttonlist[16] = new ButtonSound("Como diria Eduard Punset");
		buttonlist[17] = new ButtonSound("Que será que será");
		buttonlist[18] = new ButtonSound("Que valiente verdad");
		buttonlist[19] = new ButtonSound("Saber y Ganar");
		buttonlist[20] = new ButtonSound("Hay que ver como se ha quedado");
		buttonlist[21] = new ButtonSound("Déjeme empezar el programa con un silogismo");
		
	}
	

}

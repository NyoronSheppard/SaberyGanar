package nyoronsheppard.android.SaberyGanar;


	/**
	 * Clase ListButtons
	 * @author nyoronsheppard
	 * @date 29/03/2012
	 * @version 0.0.9
	 */
public class ListButtons 
{

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
	 * Metodo para pasarle la id que cargaremos en load
	 * @param position Posicion en la lista
	 * @return id Valor del identificador
	 */
	public int getId(int position)
	{
		return (buttonlist[position].getId());
	}

	/**
	 * Metodo que devuelve el tamaño maximo de la lista
	 * @return KMAX
	 */
	public int getSize()
	{
		return (KMAX);
	}


	/**
	 * Metodo que añade los nombres de los sonidos y el Id de los ficheros.raw
	 */
	public void setButtons()
	{

		buttonlist[0] = new ButtonSound("Bravo bravo bravo bravo", "bravobravo");
		buttonlist[0].setId(R.raw.bravobravo);

		buttonlist[1] = new ButtonSound("Cambiamos la luz compañeros", "cambialuz");
		buttonlist[1].setId(R.raw.cambialuz);

		buttonlist[2] = new ButtonSound("Lo dijo justo cuando iba a sonar la campana", "campana");
		buttonlist[2].setId(R.raw.campana);

		buttonlist[3] = new ButtonSound("El cerebro hay que alimentarlo", "cerebro");
		buttonlist[3].setId(R.raw.cerebro);

		buttonlist[4] = new ButtonSound("Pero que cuerpo", "cuerposerrano");
		buttonlist[4].setId(R.raw.cuerposerrano);

		buttonlist[5] = new ButtonSound("De saber y ganar", "desaberyganar");
		buttonlist[5].setId(R.raw.desaberyganar);

		buttonlist[6] = new ButtonSound("Que se celebra en alcoy", "enalcoy");
		buttonlist[6].setId(R.raw.enalcoy);

		buttonlist[7] = new ButtonSound("Ha ha ha ha", "hahaha");
		buttonlist[7].setId(R.raw.hahaha);

		buttonlist[8] = new ButtonSound("Juanjo, tiempo", "juanjo");
		buttonlist[8].setId(R.raw.juanjo);

		buttonlist[9] = new ButtonSound("Lo ha conseguido, lo ha conseguido!", "lohaconseguido");
		buttonlist[9].setId(R.raw.lohaconseguido);

		buttonlist[10] = new ButtonSound("La magia de la television", "magia");
		buttonlist[10].setId(R.raw.magia);

		buttonlist[11] = new ButtonSound("Hay que ver menudo lio", "menudolio");
		buttonlist[11].setId(R.raw.menudolio);

		buttonlist[12] = new ButtonSound("Con el micrófono en la mano", "microfono");
		buttonlist[12].setId(R.raw.microfono);

		buttonlist[13] = new ButtonSound("Aqui les esperamos cada dia", "nofalten");
		buttonlist[13].setId(R.raw.nofalten);

		buttonlist[14] = new ButtonSound("No pasa nada", "nopasanada");
		buttonlist[14].setId(R.raw.nopasanada);

		buttonlist[15] = new ButtonSound("Soy un tipo duro, duro de verdad", "proteina");
		buttonlist[15].setId(R.raw.proteina);

		buttonlist[16] = new ButtonSound("Como diria Eduard Punset", "punset");
		buttonlist[16].setId(R.raw.punset);

		buttonlist[17] = new ButtonSound("Que será que será", "quesera");
		buttonlist[17].setId(R.raw.quesera);

		buttonlist[18] = new ButtonSound("Que valiente verdad", "quevaliente");
		buttonlist[18].setId(R.raw.quevaliente);

		buttonlist[19] = new ButtonSound("Saber y Ganar", "saberyganar");
		buttonlist[19].setId(R.raw.saberyganar);

		buttonlist[20] = new ButtonSound("Hay que ver como se ha quedado", "sehaquedado");
		buttonlist[20].setId(R.raw.sehaquedado);

		buttonlist[21] = new ButtonSound("Déjeme empezar el programa con un silogismo", "silogismo");
		buttonlist[21].setId(R.raw.silogismo);

	}

}
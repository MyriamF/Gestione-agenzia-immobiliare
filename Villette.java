
public class Villette extends Annunci{
	
	private int dimensioneGiardino;
	
	public Villette (Date dataPubblicazione, String ubicazione, int superficie,int annoCostruzione,String classeEnergetica,int numeroStanze,boolean doppiServizi,int prezzo,int dimensioneGiardino) {
		super(dataPubblicazione, ubicazione, superficie, annoCostruzione, classeEnergetica, numeroStanze, doppiServizi, prezzo);
		this.dimensioneGiardino = dimensioneGiardino;
		
	}
	
	@Override
	public String stampaCompleta(){
		super.stampaCompleta ();
		return super.stampaCompleta() + "\n" + getDimensioneGiardino() "\n";
	}

	public int  getDimensioneGiardino() {
		return dimensioneGiardino;
	}
	
	public void setDimensioneGiardino(int dimensione) {
		this.dimensioneGiardino = dimensione;
	}
}
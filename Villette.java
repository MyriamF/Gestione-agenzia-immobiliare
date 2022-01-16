import java.util.*;

public class Villette extends Annunci{
	
	private int dimensioneGiardino;
	
	public Villette (Date data, String ubicazione, int superficie,int annoCostruzione,String classeEnergetica,int numeroStanze,boolean doppiServizi,int prezzo,String tipologia,int dimensioneGiardino) {
		super(data, ubicazione, superficie, annoCostruzione, classeEnergetica, numeroStanze, doppiServizi, prezzo, tipologia);
		this.dimensioneGiardino = dimensioneGiardino;	
	}

	@Override
	public String stampaCompleta(){
		super.stampaCompleta ();
		return super.stampaCompleta() + "\n" + getDimensioneGiardino();
	}

	public int  getDimensioneGiardino() {
		return dimensioneGiardino;
	}
	
	public void setDimensioneGiardino(int dimensione) {
		this.dimensioneGiardino = dimensione;
	}
}

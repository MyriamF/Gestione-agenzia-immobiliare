import java.util.*;

//(sotto)classe di Annunci per la gestione degli immobili di tipo Villette
public class Villette extends Annunci{
	
	private int dimensioneGiardino;
	
	//costruttore
	public Villette (int codice,Date data, String ubicazione, int superficie,int annoCostruzione,String classeEnergetica,int numeroStanze,boolean doppiServizi,int prezzo,String tipologia,int dimensioneGiardino) {
		super(codice,data, ubicazione, superficie, annoCostruzione, classeEnergetica, numeroStanze, doppiServizi, prezzo, tipologia);
		this.dimensioneGiardino = dimensioneGiardino;	
	}

	//si effetua l'overriding per aggiungere al metodo stampaCompleta() anche gli attributi specifici della classe Villette
	@Override
	public String stampaCompleta(){
		System.out.println(super.stampaCompleta());
		return "Giardino: " + getDimensioneGiardino();
	}

	//metodo get
	public int  getDimensioneGiardino() {
		return dimensioneGiardino;
	}
	
	//metodo set
	public void setDimensioneGiardino(int dimensione) {
		this.dimensioneGiardino = dimensione;
	}
}

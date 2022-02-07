import java.util.*;

//(sotto)classe di Annunci per la gestione degli immobili di tipo Appartamento
public class Appartamenti extends Annunci {
	
	private int pianoAppartamento;
	private int pianiCondominio;
	private boolean garage;
	private boolean riscaldamento;
	
	//costruttore
	public Appartamenti (int codice, Date data, String ubicazione, int superficie,int annoCostruzione,String classeEnergetica,int numeroStanze,boolean doppiServizi, int prezzo,String tipologia,int pianoAppartamento,int pianiCondominio, boolean garage, boolean riscaldamento){
		 super(codice,data, ubicazione, superficie, annoCostruzione, classeEnergetica, numeroStanze, doppiServizi, prezzo, tipologia);
		 	this.pianoAppartamento = pianoAppartamento;
	        this.pianiCondominio = pianiCondominio;
	        this.garage = garage;
	        this.riscaldamento = riscaldamento;
	        }


	//si effetua l'overriding per aggiungere al metodo stampaCompleta() anche gli attributi specifici della classe Appartamenti
	@Override
	public String stampaCompleta (){
		System.out.println (super.stampaCompleta());

		String garage = "", riscaldamento = "";
		
		if (getGarage()){
			garage = "Si";
		}
		else {
			garage = "No";
		}

		if (getRiscaldamento()){
			riscaldamento = "Si";
		}
		else {
			riscaldamento = "No";
		}

		return "Piano appartamento: " + getPianoAppartamento() + "\n" + "Piani condominio: " + getPianiCondominio() + "\n" + 
		"Garage: " + garage + "\n" + "Riscaldamento: " + riscaldamento + "\n";
	}

	//metodo get
	public int getPianoAppartamento() {
		return pianoAppartamento;
	}
	
	//metodo get
	public int getPianiCondominio() {
		return pianiCondominio;
	}
	
	//metodo get
	public boolean getGarage() {
		return garage;
	}
	
	//metodo get
	public boolean getRiscaldamento() {
		return riscaldamento;
	}
	
	//metodo set
	public void setPianoAppartamento(int pianoApp) {
		this.pianoAppartamento = pianoApp;
	}
	
	//metodo set
	public void setPianiCondominio(int pianiCond) {
		this.pianiCondominio = pianiCond;
	}
	
	//metodo set
	public void setGarage(boolean garage) {
		this.garage = garage;
	}
	
	//metodo set
	public void setRiscaldamento(boolean riscaldamento) {
		this.riscaldamento = riscaldamento;
	}
}

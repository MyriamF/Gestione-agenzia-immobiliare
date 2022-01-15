import java.sql.Date;

public class Appartamenti extends Annunci {
	
	private int pianoAppartamento;
	private int pianiCondominio;
	private boolean garage;
	private boolean riscaldamento;
	
	public Appartamenti (java.util.Date d, String ubicazione, int superficie,int annoCostruzione,String classeEnergetica,int numeroStanze,boolean doppiServizi, int prezzo,String tipologia,int pianoAppartamento,int pianiCondominio, boolean garage, boolean riscaldamento){
		 super(d, ubicazione, superficie, annoCostruzione, classeEnergetica, numeroStanze, doppiServizi, prezzo, tipologia);
		 	this.pianoAppartamento = pianoAppartamento;
	        this.pianiCondominio = pianiCondominio;
	        this.garage = garage;
	        this.riscaldamento = riscaldamento;
	        }


	@Override
	public String stampaCompleta (){
		super.stampaCompleta ();
		return super.stampaCompleta() + "\n" + getPianoAppartamento() + "\n" + getPianiCondominio() + "\n" + 
		getGarage() + "\n" + getRiscaldamento() + "\n";
	}

	public int getPianoAppartamento() {
		return pianoAppartamento;
	}
	
	public int getPianiCondominio() {
		return pianiCondominio;
	}
	
	public boolean getGarage() {
		return garage;
	}
	
	public boolean getRiscaldamento() {
		return riscaldamento;
	}
	
	public void setPianoAppartamento(int pianoApp) {
		this.pianoAppartamento = pianoApp;
	}
	
	public void setPianiCondominio(int pianiCond) {
		this.pianiCondominio = pianiCond;
	}
	
	public void setGarage(boolean garage) {
		this.garage = garage;
	}
	
	public void setRiscaldamento(boolean riscaldamento) {
		this.riscaldamento = riscaldamento;
	}
}

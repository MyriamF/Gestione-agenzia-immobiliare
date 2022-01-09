
public class Appartamenti extends Annunci {
	
	private int pianoAppartamento;
	private int pianiCondominio;
	private boolean garage;
	private boolean riscaldamento;
	
	
	public Appartamenti (String dataPubblicazione, String ubicazione, int superficie,int annoCostruzione,String classeEnergetica,int numeroStanze,boolean doppiServizi, int prezzo,int pianoAppartamento,int pianiCondominio, boolean garage, boolean riscaldamento){
		 super(dataPubblicazione, ubicazione, superficie, annoCostruzione, classeEnergetica, numeroStanze, doppiServizi, prezzo);
		 	this.pianoAppartamento = pianoAppartamento;
	        this.pianiCondominio = pianiCondominio;
	        this.garage= garage;
	        this.riscaldamento= riscaldamento;
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

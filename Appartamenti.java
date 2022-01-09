
public class Appartamenti extends Annunci {

		private int pianoAppartamento;
		private int pianiCondominio;
		private boolean garage;
		private boolean riscaldamento;
		
		 public Appartamenti (int pianoAppartamento,int pianiCondominio, boolean garage, boolean riscaldamento){
			 super( dataPubblicazione, ubicazione, superficie, annoCostruzione, classeEnergetica, numeroStanze, doppiServizi, prezzo);
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
}

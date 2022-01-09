
public class Villette extends Annunci{

		private int dimensioneGiardino;
		
		public Villette (int dimensioneGiardino) {
			super(dataPubblicazione, ubicazione, superficie, annoCostruzione, classeEnergetica, numeroStanze, doppiServizi, prezzo);
			this.dimensioneGiardino= dimensioneGiardino;		
		}
		
		public int  getDimensioneGiardino() {
			return dimensioneGiardino;
		}
}



public class Annunci {
	//TODO Cambiare tipo
	private Date dataPubblicazione;
	private String ubicazione;
	private int superficie;
	private int annoCostruzione;
	private String classeEnergetica;
	private int numeroStanze;
	private boolean doppiServizi;
	private int prezzo;
	private String tipologia;
	//Codice specifico dell'annuncio
	private int codiceAnnuncio; 
	
	//Codice progressivo dell'annuncio
	static int codice = 1;

	
	public Annunci(Date dataPubblicazione, String ubicazione, int superficie, int annoCostruzione, String classeEnergetica, int numeroStanze, boolean doppiServizi,int prezzo,String tipologia) {
		this.dataPubblicazione = dataPubblicazione;
        this.ubicazione = ubicazione;
        this.superficie = superficie;
        this.annoCostruzione = annoCostruzione;
        this.classeEnergetica = classeEnergetica;
        this.numeroStanze= numeroStanze;
        this.doppiServizi = doppiServizi;
        this.prezzo = prezzo;
		this.tipologia = tipologia;
		this.codiceAnnuncio = codice;
		codice ++;
    }

	public Annunci() {
		Scanner input = new Scanner(System.in);
		System.out.println("Inerisici l'ubicazione");
		ubicazione = input.nextLine();
		System.out.println(getUbicazione());
	}

	public String stampaSintetica () {
		return getTipologia() + "\n" + getDataPubblicazione() + "\n" + getSuperficie() + "\n" + getPrezzo();
	}
	public String stampaCompleta(){
		return getCodiceAnnuncio() + "\n" + getDataPubblicazione() + "\n" + getUbicazione() + "\n" + getSuperficie() + "\n" 
		+ getAnnoCostruzione() + "\n" + getClasseEnergetica() + "\n" + getNumeroStanze() + "\n" + getDoppiServizi()+ "\n"
		+ getPrezzo() + "\n" + getTipologia();
	}

	public String getDataPubblicazione (){
	    return dataPubblicazione.toString();
	}
	    
	public String getUbicazione (){
	    return ubicazione; 
	}
	    
	public int getSuperficie (){
	    return superficie;
	}
	    
	public int getAnnoCostruzione (){
	    return annoCostruzione;  
	}
	    
	public String  getClasseEnergetica (){  
	    return classeEnergetica;
	}
	    
	public int getNumeroStanze (){
	    return numeroStanze;
	}
	    
	public boolean getDoppiServizi (){  
	    return doppiServizi;
	}
	    
	public int getPrezzo (){  
	    return prezzo;
	}
	    
	public int getCodiceAnnuncio (){
		return codiceAnnuncio;
	}

	public String getTipologia () {
		return tipologia;
	}

	public void setDataPubblicazione (String data) {
	    this.dataPubblicazione = data;
	}
	    
	public void setUbicazione(String ubicazione) {
	    this.ubicazione = ubicazione;
	}
	    
	public void setSuperficie(int superficie) {
	    this.superficie = superficie;
	}
	    
	public void setAnnoCostruzione(int anno) {
	    this.annoCostruzione = anno;
	}
	    
	public void setClasseEnergetica(String classe) {
	    this.classeEnergetica = classe;
	}
	    
	public void setNumeroStanze(int num) {
	    this.numeroStanze = num;
	}
	    
	public void setDoppiServizi(boolean doppiS) {
	    this.doppiServizi= doppiS;
	}
	    
	public void setPrezzo(int prezzo) {
	    this.prezzo = prezzo;
	}

}

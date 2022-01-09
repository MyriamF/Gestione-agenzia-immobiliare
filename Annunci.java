

public class Annunci {
	
	private String dataPubblicazione;
	private String ubicazione;
	private int superficie;
	private int annoCostruzione;
	private String classeEnergetica;
	private int numeroStanze;
	private boolean doppiServizi;
	private int prezzo;
	
	
	public Annunci(String dataPubblicazione, String ubicazione, int superficie, int annoCostruzione, String classeEnergetica, int numeroStanze, boolean doppiServizi,int prezzo ){
        this.dataPubblicazione= dataPubblicazione;
        this.ubicazione = ubicazione;
        this.superficie = superficie;
        this.annoCostruzione = annoCostruzione;
        this.classeEnergetica = classeEnergetica;
        this.numeroStanze= numeroStanze;
        this.doppiServizi = doppiServizi;
        this.prezzo = prezzo;
    }
	 public String getDataPubblicazione (){
	        return dataPubblicazione;
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
	    
	    public int getNumeroStanze () {
	    	return numeroStanze;
	    }
	    
	    public boolean getDoppiServizi(){  
	    	return doppiServizi;
	    }
	    
	    public int getPrezzo (){  
	    	return prezzo;
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

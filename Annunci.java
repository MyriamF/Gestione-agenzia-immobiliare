

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
	    
	   
	    
}
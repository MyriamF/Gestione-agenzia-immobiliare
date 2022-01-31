import java.io.*;
import java.util.*;

//è la classe che gestisce gli attributi degli annunci
public class Annunci implements Serializable{
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

	//costante necessaria per la serializzazione
	static final long serialVersionUID = 1;

	//costruttore 
	public Annunci(int codice,Date dataPubblicazione, String ubicazione, int superficie, int annoCostruzione, String classeEnergetica, int numeroStanze, boolean doppiServizi,int prezzo,String tipologia) {
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
    }

	//metodo di stampa sintetica che permette la visualizzazione del codice, della tipologia, della data, della sueprficie e del prezzo dell'annuncio
	public String stampaSintetica() {
		return "Codice annuncio:"+ getCodiceAnnuncio() + "\n" + "Tipologia:" + getTipologia() + "\n" + "Data:" + getDataPubblicazione() + "\n" + "Superficie:" + getSuperficie() + "\n" + "Prezzo:" + getPrezzo();
	}

	//metodo di stampa completa permette d visualizzare tutti gli attributi relativi ad un annuncio
	public String stampaCompleta() {
		return "Codice annuncio:"+getCodiceAnnuncio() + "\n" + "Data:" + getDataPubblicazione() + "\n" + "Ubicazione:" + getUbicazione() + "\n" + "Superficie:" + getSuperficie() + "\n" 
		+ "Prezzo:" + getAnnoCostruzione() + "\n" + "Classe Energetica:" + getClasseEnergetica() + "\n" + "Numero stanze:" + getNumeroStanze() + "\n" + "Presenza di doppi servizi:" + getDoppiServizi()+ "\n"
		+ "Prezzo:"+ getPrezzo() + "\n" + "Tipologia:" + getTipologia();
	}

	//metodo get
	public Date getDataPubblicazione (){
	    return dataPubblicazione;
	}
	 
	//metodo get
	public String getUbicazione (){
	    return ubicazione; 
	}
	
	//metodo get
	public int getSuperficie (){
	    return superficie;
	}
	 
	//metodo get
	public int getAnnoCostruzione (){
	    return annoCostruzione;  
	}
	    
	//metodo get
	public String  getClasseEnergetica (){  
	    return classeEnergetica;
	}
	 
	//metodo get
	public int getNumeroStanze (){
	    return numeroStanze;
	}
	    
	//metodo get
	public boolean getDoppiServizi (){  
	    return doppiServizi;
	}
	
	//metodo get
	public int getPrezzo (){  
	    return prezzo;
	}
	    
	//metodo get
	public int getCodiceAnnuncio (){
		return codiceAnnuncio;
	}

	//metodo get
	public String getTipologia () {
		return tipologia;
	}

	//metodo set
	public void setDataPubblicazione (Date data) {
	    this.dataPubblicazione = data;
	}
	    
	//metodo set
	public void setUbicazione(String ubicazione) {
	    this.ubicazione = ubicazione;
	}
	    
	//metodo set
	public void setSuperficie(int superficie) {
	    this.superficie = superficie;
	}
	    
	//metodo set
	public void setAnnoCostruzione(int anno) {
	    this.annoCostruzione = anno;
	}
	    
	//metodo set
	public void setClasseEnergetica(String classe) {
	    this.classeEnergetica = classe;
	}
	    
	//metodo set
	public void setNumeroStanze(int num) {
	    this.numeroStanze = num;
	}


	//mrtodo set    
	public void setDoppiServizi(boolean doppiS) {
	    this.doppiServizi= doppiS;
	}
	  
	//metodo set
	public void setPrezzo(int prezzo) {
	    this.prezzo = prezzo;
	}




}

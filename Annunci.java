import java.io.*;
import java.util.*;

//modella il tipo di dato Annuncio
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

	//costruttore della classe Annunci 
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

	//restituisce le caratteristiche sintetiche dell'annuncio
	public String stampaSintetica() {
		return "Codice annuncio:"+ getCodiceAnnuncio() + "\n" + "Tipologia:" + getTipologia() + "\n" + "Data:" 
		+ getDataPubblicazione() + "\n" + "Superficie:" + getSuperficie() + "\n" + "Prezzo:" + getPrezzo();
	}

	//restituisce tutti gli attributi dell'annuncio
	public String stampaCompleta() {
		System.out.println (stampaSintetica());

		String servizi = "";
		if (getDoppiServizi()){
			servizi = "Si";
		}
		else {
			servizi = "No";
		}

		return "Ubicazione:" + getUbicazione() + "\n" + 
		"Anno Costruzione:" + getAnnoCostruzione() + "\n" + "Classe Energetica:" + getClasseEnergetica() + "\n" 
		+ "Numero stanze:" + getNumeroStanze() + "\n" + "Presenza di doppi servizi:" + servizi + "\n";
	}

	public Date getDataPubblicazione (){
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

	public void setDataPubblicazione (Date data) {
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

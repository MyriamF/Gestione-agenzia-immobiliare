import java.io.*;
import java.util.*;
import java.text.DateFormat;
import java.text.ParseException;

//modella il tipo di dato Agenzia
public class Agenzia {
  private Vector<Annunci> Lista = null;
  private int codice;

  //costruttore classe Agenzia
  public Agenzia() {
    Lista = new Vector<Annunci>();
    this.codice = 1;
  }

  //restituisce il vettore di Annunci
  public Vector<Annunci> getLista(){
    return Lista;
  }

  //metodo controllo degli interi 
  public void checkNegativo(int parametro) throws InputMismatchException{
    if(parametro <= 0){
      throw new InputMismatchException();
    }
  }

  //metodo di controllo per l'inserimento dell'anno
  public void checkAnno(int anno) throws InputMismatchException{
    if (anno< 1800){
      throw new InputMismatchException();
    }
  }

  //metodo per aggiungere un annuncio al vettore
  public void aggiuntaAnnuncio(Scanner input,int tipo) {
    String menu3 = "1. Dotato di doppi servizi.\n 2. Non dotato di doppi servizi";
    int sceltaServizi = 0;
    String data = "";
    java.util.Date d = null;
    String ub = "";
    int metri = 0;
    int anno = 0;
    String energia = "";
    int stanze = 0;
    boolean doppiS = true;
    int prez = 0;

    try {
      System.out.println("Inserisci data [gg/mm/yyyy]: ");
      data = input.next();

      try {
        DateFormat formatoData = DateFormat.getDateInstance(DateFormat.SHORT);
        formatoData.setLenient(false);
        d = formatoData.parse(data);
      } 
      catch (ParseException e) {
        System.out.println("Formato data non valido.");
        return;
      }

      System.out.println("Inserisci ubicazione: ");
      ub = input.next();
      System.out.println("Inserisci metratura: ");
      metri = input.nextInt();
      checkNegativo(metri);
      System.out.println("Inserisci anno di costruzione dell'immobile: ");
      anno = input.nextInt();
      checkAnno(anno);
      System.out.println("Inserisci classe energetica: ");
      energia = input.next();
      System.out.println("Inserisci il numero delle stanze: ");
      stanze = input.nextInt();
      checkNegativo(stanze);
      System.out.println("Inserisci se nell'immobile ci sono doppi servizi: ");
      System.out.println(menu3);
      sceltaServizi = input.nextInt();
      
      if (sceltaServizi == 1){
        doppiS = true;
      } 
      else if (sceltaServizi == 2) {
        doppiS = false;
      } 
      else {
        throw new InputMismatchException();
      }

      System.out.println("Inserisci prezzo dell'immobile: ");
      prez = input.nextInt();
      checkNegativo(prez);
    } 

    catch (InputMismatchException e){
        System.out.println("Errore dato atteso");
        input.next();
        return;
    }

    //è un appartamento
    if (tipo == 1) {
      String menu4 = "1. Dotato di garage.\n 2. Non dotato di garage";
      String menu5 = "1. Dotato di riscaldamento.\n 2. Non dotato di riscaldamento";
      int sceltaRis = 0;
      int sceltaGarage = 0;

      String tipologia = "Appartamento";
      int pianoA = 0;
      int pianoCond = 0;
      boolean garage = true;
      boolean riscaldamento = true;

      try {
        System.out.println("Inserisci il piano dell'appartamento: ");
        pianoA = input.nextInt();
        System.out.println("Inserisci il numero dei piani presenti nel condominio: ");
        pianoCond = input.nextInt();   
        if (pianoA > pianoCond){
          throw new InputMismatchException();
        } 

        System.out.println("Inserisci se l'immobile è dotato di garage: ");
        System.out.println(menu4);
        sceltaGarage = input.nextInt();
        if (sceltaGarage == 1) {
          garage = true;
        } 
        else if (sceltaGarage == 2) {
          garage = false;
        } 
        else {
          throw new InputMismatchException();
        }

        System.out.println("Inserisci se l'immobile ha il riscaldamento autonomo:");
        System.out.println(menu5);
        sceltaRis = input.nextInt();
        if (sceltaRis == 1) {
          riscaldamento = true;
        } 
        else if (sceltaRis == 2) {
          riscaldamento = false;
        } 
        else {
          throw new InputMismatchException();
        }
      }

      catch (InputMismatchException e) {
          System.out.println("Errore dato atteso");
          input.next();
          return;
      }

      Appartamenti app = new Appartamenti(codice,d, ub,metri,anno, energia,stanze,doppiS,prez,tipologia,pianoA,
      pianoCond,garage,riscaldamento);
      Lista.add(app);
    } 

    // è una villetta
    else {
      String tipologia = "Villetta";
      int mGiardino = 0;

      try {
        System.out.println("Inserisci la metratura del giardino: ");
        mGiardino = input.nextInt();
        checkNegativo(mGiardino);
      } 
      catch (InputMismatchException e) {
        System.out.println("Errore dato atteso");
        input.next();
        return;
      }

      Villette villetta = new Villette(codice,d, ub, metri, anno, energia, stanze, doppiS, prez, tipologia, mGiardino);
      Lista.add(villetta);
    }
    codice++;
  }

  // stampa completa della lista di annunci
  public void stampaInteroCompleta() {
    for ( int i = 0; i< Lista.size(); i++){
        System.out.println(Lista.get(i).stampaCompleta());
    }
  }

  // stampa sintetica della lista di annunci
  public void stampaInteroSintetica() {
    for (int i = 0; i < Lista.size(); i++) {
      System.out.println(Lista.get(i).stampaSintetica());
    }
  }
    
  //metodo eliminazione annuncio 
  public void eliminaAnnuncio(Scanner input) {
    int codice = 0;
    boolean presente = false;
    stampaInteroSintetica();
    System.out.println("Inserisci il codice dell'annnuncio da eliminare:");
     
    try {
      codice = input.nextInt();

      for ( int i = 0; i < Lista.size(); i++){
      if (codice == Lista.get(i).getCodiceAnnuncio()) {
        Lista.remove(i);
        presente = true;
        break;
      }
    }
  } catch (InputMismatchException e) {
    System.out.println("Errore dato atteso");
    input.next();
  }

    if (!presente){
        System.out.println("L'annuncio non e' presente");
    } 
    else {
      System.out.println("Eliminazione andata a buon fine");
    }
  
  
  }
  
  //metodo per visualizzare gli annunci in ordine di data, dalla più recente alla più datata
  public void elencoPerData() {
    Comparator <Annunci> comparator = new AnnunciComparator ();
      Collections.sort(Lista, comparator);
      
    for (int i = 0; i<Lista.size(); i++){
        System.out.println(Lista.get(i).stampaSintetica());
    }
  }

  //metodo per stampare l'elenco completo degli annunci con tutti i dettagli
  public void visualizzaDettagli(Scanner input) {
    int id= 0;
    boolean presente = false;
    stampaInteroSintetica();
    System.out.println("Inserisci il codice dell'annuncio da visualizzare in dettaglio:");
    
    try {
      id = input.nextInt(); 

      for (int i = 0; i < Lista.size(); i++) {
        if ( Lista.get(i).getCodiceAnnuncio() == id) {
          System.out.println(Lista.get(i).stampaCompleta());
          presente = true;   
          break;
        }
      }

      if (!presente){
        System.out.println("L'annuncio non e' presente");
      } 
    }
    catch (InputMismatchException e) {
      System.out.println("Errore dato atteso");
      input.next();
    }
  }

  //metodo che permette di visualizzare i dettagli di un determinato tipo di immobile
  public void elencoTipo (Scanner input)  {
    String menu6 = "1.Appartamenti \n2.Villette";
    int num = 0;
    String tipologia = "";
    System.out.println(menu6);

    System.out.println("Inserire la tipologia di annunci da visualizzare:");
    try { 
      num = input.nextInt();
      if (num == 1){
        tipologia = "Appartamento";
      } 
      else if (num == 2) {
        tipologia = "Villetta";
      } 
      else {
        throw new InputMismatchException();
      } 
    }
    catch (InputMismatchException e) {
      System.out.println ("Errore dato atteso");
      input.next(); 
      return;
    }

    for (int i = 0; i < Lista.size(); i++){ 
      if(Lista.get(i).getTipologia().equals(tipologia)){
        System.out.println(Lista.get(i).stampaSintetica());
      }
    }     
  }  
      
  //metodo per visualizzare gli annunci compresi in un determinato range di prezzo 
  public void filtroPrezzo(Scanner input) {
    int min = 0;
    int max = 0;
    int tmp = 0;

    System.out.println("Inserisci il range di prezzo: ");

    try{
      min = input.nextInt();
      max = input.nextInt();

      for(int i = 0; i < Lista.size(); i++){
        tmp = Lista.get(i).getPrezzo();
        if (tmp >= min && tmp <= max){
          System.out.println(Lista.get(i).stampaSintetica());
        }
      }
    }
    catch (InputMismatchException e){
      System.out.println ("Errore dato atteso");
      input.next(); 
      return;
    }
  }
    
  //salva file serializzato 
  public void salva() {
    try {
      ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("salva.dat")));
      out.writeObject(Lista);
      out.close();
      System.out.println("Dati salvati");
    } 
    catch (IOException e) {
      System.out.println("Errore");
      System.out.println(e);
    }
  }

  //metodo per la lettura del file serializzato
  @SuppressWarnings("unchecked")
  public void caricaFile() {
    try {
      ObjectInputStream inputFile = new ObjectInputStream(new BufferedInputStream(new FileInputStream("salva.dat")));
      Lista = (Vector<Annunci>) inputFile.readObject();
      inputFile.close();
      codice = Lista.size() + 1;
      System.out.println("Carica file completato");
    } 
    catch (FileNotFoundException e) {
      System.out.println("File non esistente");
    } 
    catch (ClassNotFoundException e) {
      System.out.println("Errore lettura file");
    } 
    catch (IOException e) {
      System.out.println("Errore caricamento/salvataggio");
    } 
    catch (ClassCastException e){
      System.out.println("errore cast");
    }
  }
}

             




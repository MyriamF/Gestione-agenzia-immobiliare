import java.io.IOException;
import java.util.*;
import java.text.DateFormat;
import java.text.ParseException;

public class Agenzia {
  private static final DateFormat sdf = null;
  static Vector<Annunci> Lista = new Vector<Annunci>();

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		
		String menu = "1. Aggiungere annuncio\n2. Eliminare annuncio\n3. Elenco sintetico per data\n4. Visualizza dettagli\n5. Elenco sintetico per tipo\n6. Filtro prezzo\n7. Salva\n8. Carica\n9. Esci\n";
    String menu2 = "1. Aggiungi un appartamento.\n2. Aggiungi una villetta";
    int sceltaTipologia = 0;
    int scelta = 0;
         

        while (true) {
            do {
                try {
                    System.out.println(menu);
                    scelta = input.nextInt();
                }
                catch (InputMismatchException e) {
                    System.out.println("Non è un numero!");
                    input.next();
                    scelta = 0;
                }
            }
            while (scelta == 0);

            switch (scelta) {
              case 1: {
                System.out.println("Aggiungere annuncio");
                System.out.println(menu2);

                try {
                  sceltaTipologia = input.nextInt();
                  if (sceltaTipologia == 1) {
                    aggiuntaAnnuncio(1);
                  } else if (sceltaTipologia == 2) {
                    aggiuntaAnnuncio(2);
                  } else {
                    System.out.println("Errore dato atteso");
                  }
                } 
                catch(InputMismatchException e) {
                  System.out.println("Errore dato atteso");
                  input.next();
                } 
                System.out.println("Annuncio aggiunto correttamente");
                break;
              }
              case 2: {
                System.out.println ("Eliminare annuncio"); 
                if (Lista.isEmpty()) {
                  System.out.println("Il vettore e' vuoto");
                } else {
                  eliminaAnnuncio();
                }
                break;
              }
              case 3: {
                System.out.println ("Elenco sintetico per data"); 
                elencoPerData();
                break;
              }
              case 4: {
                System.out.println ("Visualizza dettagli"); 
                break;
              }
              case 5:{
                System.out.println ("Elenco sintetico per tipo"); 
                break;
              }
              case 6: {
                System.out.println ("Filtro prezzo"); 
                break;
              }
              case 7: {
                System.out.println ("Salva"); 
                break;
              }
              case 8: {
                System.out.println ("Carica"); 
                break;
              }
              case 9: {
                System.out.println("Chiusura programma");
                  input.close();
                  return;
              }   
              default: {
                System.out.println ("Valore errato");
              } 
              
         }
        }
  }
      

//metodi ausiliari
        public static void aggiuntaAnnuncio(int tipo) throws IOException {
          Scanner input = new Scanner(System.in);
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
              data = input.nextLine();

              try {
                DateFormat formatoData = DateFormat.getDateInstance(DateFormat.SHORT);
                // imposta che i calcoli di conversione della data siano rigorosi
                formatoData.setLenient(false);
                d = formatoData.parse(data);
              } 
              catch (ParseException e) {
                System.out.println("Formato data non valido.");
                return;
              }
              System.out.println("Inserisci ubicazione: ");
              ub = input.nextLine();
              System.out.println("Inserisci metratura: ");
              metri = input.nextInt();
              System.out.println("Inserisci anno di costruzione dell'immobile: ");
              anno = input.nextInt();
              System.out.println("Inserisci classe energetica: ");
              energia = input.next();
              System.out.println("Inserisci il numero delle stanze: ");
              stanze = input.nextInt();
              System.out.println("Inserisci se nell'immobile ci sono doppi servizi: ");
              System.out.println(menu3);
              sceltaServizi = input.nextInt();
              if (sceltaServizi == 1){
                doppiS = true;
              } else if (sceltaServizi == 2) {
                doppiS = false;
              } else {
                throw new InputMismatchException();
              }
              System.out.println("Inserisci prezzo dell'immobile: ");
              prez = input.nextInt();
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

           String tipologia = "appartamento";
           int pianoA = 0;
           int pianoCond = 0;
           boolean garage = true;
           boolean riscaldamento = true;

           try {
             System.out.println("Inserisci il piano dell'appartamento: ");
             pianoA = input.nextInt();
             System.out.println("Inserisci il numero dei piani presenti nel condominio: ");
             pianoCond = input.nextInt();
             System.out.println("Inserisci se l'immobile è dotato di garage: ");
             System.out.println(menu4);
             sceltaGarage = input.nextInt();
             if (sceltaGarage == 1) {
               garage = true;
             } else if (sceltaGarage == 2) {
               garage = false;
             } else {
               throw new InputMismatchException();
             }
             System.out.println("Inserisci se l'immobile ha il riscaldamento autonomo:");
             System.out.println(menu5);
             sceltaRis = input.nextInt();
             if (sceltaRis == 1) {
               riscaldamento = true;
             } else if (sceltaRis == 2) {
               riscaldamento = false;
             } else {
               throw new InputMismatchException();
             }
           }
            catch (InputMismatchException e) {
                System.out.println("Errore dato atteso");
                input.next();
                return;
            }
            Appartamenti app = new Appartamenti(d, ub,metri,anno, energia,stanze,doppiS,prez,tipologia,pianoA,
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
           } 
           catch (InputMismatchException e) {
             System.out.println("Errore dato atteso");
             input.next();
             return;
           }

           Villette villetta = new Villette(d, ub, metri, anno, energia, stanze, doppiS, prez, tipologia, mGiardino);
           Lista.add(villetta);
         }
        }

        // stampa completa della lista di annunci
        public static void stampaCompleta() {
          for ( int i = 0; i< Lista.size(); i++){
              System.out.println(Lista.get(i).stampaCompleta());
          }
        }

        // stampa sintetica della lista di annunci
        public static void stampaSintetica() {
          for (int i = 0; i < Lista.size(); i++) {
            System.out.println(Lista.get(i).stampaSintetica());
          }
        }
        
        
        //metodo eliminazione annuncio 
        public static void eliminaAnnuncio() throws IOException {
          Scanner input = new Scanner(System.in);
          int codice = 0;
          boolean presente = false;
          stampaCompleta();
          System.out.println("Inserisci il codice dell'annnuncio da eliminare");
          codice = input.nextInt();
          
          for ( int i = 0; i < Lista.size(); i++){
            if (codice == Lista.get(i).getCodiceAnnuncio()) {
              Lista.remove(i);
              presente = true;
              break;
            }
          }
          if (!presente){
              System.out.println("L'annuncio non e' presente");
          } else {
            System.out.println("Eliminazione andata a buon fine");
          }
        }

        public static void elencoPerData() {
          Comparator <Annunci> comparator = new AnnunciComparator ();

          Collections.sort(Lista, comparator);
           
          for (int i = 0; i<Lista.size(); i++){
              System.out.println(Lista.get(i).stampaSintetica());
        
          }
          
             
  }
            
          
        

        
}



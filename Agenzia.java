import java.io.*;
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
                    aggiuntaAnnuncio(input,1);
                  } else if (sceltaTipologia == 2) {
                    aggiuntaAnnuncio(input,2);
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
                  eliminaAnnuncio(input);
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
                visualizzaDettagli(input);
                break;
              }
              case 5:{
                System.out.println ("Elenco sintetico per tipo"); 
                elencoTipo(input);
                break;
              }
              case 6: {
                System.out.println ("Filtro prezzo"); 
                filtroPrezzo(input);
                break;
              }
              case 7: {
                System.out.println ("Salva"); 
                salva(Lista);
                break;
              }
              case 8: {
                System.out.println ("Carica"); 
                caricaFile(Lista);
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
        public static void aggiuntaAnnuncio(Scanner input,int tipo) throws InputMismatchException {
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
        public static void stampaInteroCompleta() {
          for ( int i = 0; i< Lista.size(); i++){
              System.out.println(Lista.get(i).stampaCompleta());
          }
        }

        // stampa sintetica della lista di annunci
        public static void stampaInteroSintetica() {
          for (int i = 0; i < Lista.size(); i++) {
            System.out.println(Lista.get(i).stampaSintetica());
          }
        }
        
        
        //metodo eliminazione annuncio 
        public static void eliminaAnnuncio(Scanner input) {
          int codice = 0;
          boolean presente = false;
          stampaInteroCompleta();
          System.out.println("Inserisci il codice dell'annnuncio da eliminare:");
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

        public static void visualizzaDettagli(Scanner input) {
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
              if (!presente){
                System.out.println("L'annuncio non e' presente");
               
              }
             }
           } 
             catch (InputMismatchException e) {
                System.out.println("Errore dato atteso");
               input.next();
             }
           }
          
        
        public static void elencoTipo (Scanner input) throws InputMismatchException {
          String menu6 = "1.Appartamenti \n2.Villette";
          int num = 0;
          String tipologia = "";
          System.out.println(menu6);

          System.out.println("Inserire la tipologia di annunci da visualizzare:");
             try { 
                num = input.nextInt();
                if (num == 1){
                tipologia.equals("Appartamento");
              } else if (num == 2) {
                tipologia.equals("Villetta");
              } else {
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
        
        

        public static void filtroPrezzo(Scanner input) throws InputMismatchException{
          int min = 0;
          int max = 0;
          boolean eccessoMin = false;
          boolean eccessoMax = false;

          System.out.println("Inserisci il range di prezzo: ");

          try{
            min = input.nextInt();
            max = input.nextInt();

            for(int i = 0; i < Lista.size(); i++){
              if ((min>= Lista.get(i).getPrezzo() && (max <= Lista.get(i).getPrezzo()))){
                Lista.get(i).stampaSintetica();
              }

              if (min < Lista.get(i).getPrezzo()){
                eccessoMin = true;
              } else if (max > Lista.get(i).getPrezzo()){
                eccessoMax = true;
              }
            }

              if (!eccessoMin){
                System.out.println("Il prezzo inserito è troppo basso");
              } else if (!eccessoMax){
                System.out.println("Il prezzo inserito è troppo alto");
              }
            }
          catch (InputMismatchException e){
              System.out.println ("Errore dato atteso");
              input.next(); 
              return;
          }
        }

           private static void salva(Vector <Annunci> Lista) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("salva.dat")));
            out.writeObject(Lista);
            out.close();
            System.out.println("Dati salvati");
        } catch (IOException e) {
            System.out.println("Errore");
            System.out.println(e);
        }
    }

      private static Vector <Annunci> caricaFile(Vector<Annunci> Lista) {
        try {
            ObjectInputStream inputFile = new ObjectInputStream(new BufferedInputStream(new FileInputStream("salva.dat")));
            Lista = (Vector<Annunci>) inputFile.readObject();
            inputFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("File non esistente");
        } catch (ClassNotFoundException e) {
            System.out.println("Errore lettura file");
        } catch (IOException e) {
            System.out.println("Errore caricamento/salvataggio");
        }
        return Lista;
    }
}
}
             




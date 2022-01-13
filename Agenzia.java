import java.util.*;
public class Agenzia {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String menu = "1. Aggiungere annuncio\n2. Eliminare annuncio\n3. Elenco\n4. Visualizza dettagli\n5. Elenco sintetico\n6. Filtro prezzo\n7. Salva\n8. Carica\n9. Esci\n";
    int scelta = 0;

    Vector <Annunci> Lista = new Vector <Annunci> ();
         

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
                System.out.println ("Aggiungere annuncio");
              }
              case 2: {
                System.out.println ("Eliminare annuncio"); break;
              }
              case 3: {
                System.out.println ("Elenco"); break;
              }
              case 4: {
                System.out.println ("Visualizza dettagli"); break;
              }
              case 5:{
                System.out.println ("Elenco sintetico"); break;
              }
              case 6: {
                System.out.println ("Filtro prezzo"); break;
              }
              case 7: {
                System.out.println ("Salva"); break;
              }
              case 8: {
                System.out.println ("Carica"); break;
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
        private static <Annnunci> void aggiuntaAnnuncio(){
          Scanner input = new Scanner (System.in);
          String menu2 = "A. Aggiungi un appartamento.\nB. Aggiungi una villetta";
          String sceltaTipologia = "";
         

          do {
                      try {
                          System.out.println(menu2);
                          sceltaTipologia = input.next();
                      }
                      catch (InputMismatchException e) {
                          System.out.println("Non è un");
                          input.next();
                          sceltaTipologia = "";
                      }

                  }
                  while (sceltaTipologia.equals(""));  

                  switch(sceltaTipologia){
                    case "A":{
                      System.out.println("Aggiungere infomazioni relative all'appartamento");break; 
                      Agenzia.aggiuntaAppartamento();
                    } break;
                    case "B" :{
                    	System.out.println("Aggiungere informazioni relative alla villetta");break;
                      Agenzia.aggiuntaVilletta();
                    } break;
               }
        }
        

        private static void aggiuntaAppartamento(){
          Scanner input = new Scanner (System.in);
          String data = ""; 
          String ub = "";
          int metri = 0;
          int anno = 0;
          String energia = "";
          int stanze = 0;
          boolean doppiS = true;
          int prez = 0;
          String tipologia = "appartamento";
          int pianoA = 0;
          int pianoCond = 0;
          boolean garage = true;
          boolean riscaldamento = true;
          

          System.out.println("Inserimento annuncio di tipo" +tipologia);
          System.out.println("Inserisci data: \n");
          data = input.nextLine();
          System.out.println("Inserisci ubicazione: \n");
          ub = input.nextLine();
          System.out.println("Inserisci metratura: \n");
          metri = input.nextInt();
          System.out.println("Inserisci anno di costruzione dell'immobile: \n");
          anno = input.nextInt();
          System.out.println("Inserisci classe energetica: \n");
          energia = input.nextLine();
          System.out.println("Inserisci il numero delle stanze: \n");
          stanze = input.nextInt();
          System.out.println("Inserisci se nell'immobile ci sono doppi servizi: \n");
          doppiS = Agenzia.sceltaServizi();
          System.out.println("Inserisci prezzo dell'immobile: \n");
          prez = input.nextInt();
          System.out.println("Inserisci il piano dell'appartamento: \n");
          pianoA = input.nextInt();
          System.out.println("Inserisci il numero dei piani presenti nel condominio: \n");
          pianoCond = input.nextInt();
          System.out.println("Inserisci se l'immobile è dotato di garage: \n");
          garage = Agenzia.sceltaGarage();
          System.out.println("Inserisci se l'immobile ha il riscaldamento autonomo:\n");
          riscaldamento = Agenzia.sceltaRiscaldamento();
          // \n");
        }

        private static  void aggiuntaVilletta(){
          Scanner input = new Scanner (System.in);
          String data = "";
          String ub = "";
          int metri = 0;
          int anno = 0;
          String energia = "";
          int stanze = 0;
          boolean doppiS = true;
          int prez = 0;
          String tipologia = "Villetta"; 
          int mgiardino = 0;

          System.out.println("Inserimento annuncio di tipo" + tipologia);
          System.out.println("Inserisci data: \n");
          data = input.nextLine();
          System.out.println("Inserisci ubicazione: \n");
          ub = input.nextLine();
          System.out.println("Inserisci metratura: \n");
          metri = input.nextInt();
          System.out.println("Inserisci anno di costruzione dell'immobile: \n");
          anno = input.nextInt();
          System.out.println("Inserisci classe energetica: \n");
          energia = input.nextLine();
          System.out.println("Inserisci il numero delle stanze: \n");
          stanze = input.nextInt();
          System.out.println("Inserisci se nell'immobile ci sono doppi servizi: \n");
          doppiS = Agenzia.sceltaServizi();
          System.out.println("Inserisci prezzo dell'immobile: \n");
          prez = input.nextInt();
          System.out.println("Inserisci la metratura del giardino: \n");
          mgiardino = input.nextInt();

        }

        private static boolean sceltaServizi(){
          Scanner input = new Scanner (System.in);

          String menu3 = "1. Dotato di doppi servizi.\n 2. Non dotato di doppi servizi";
          int sceltaServizi = 0;
          boolean doppS = true;
         
          while (true) {
            do {
                try {
                    System.out.println(menu3);
                    sceltaServizi = input.nextInt();
                }
                catch (InputMismatchException e) {
                    System.out.println("Non è un numero!");
                    input.next();
                    sceltaServizi = 0;
                }
            }
            while (sceltaServizi == 0);
                     
            switch (sceltaServizi) {
                        case 1: {
                          doppS = true;
                          return doppS;
                        } break;
                        case 2 :{
                          doppS = false;
                          return doppS;
                        } break;
                        case 3: {
                          input.close();
                        }
                        default: {
                          System.out.println("Valore errato");
                        }
                      }
                    }
        }   
        


        private static boolean sceltaGarage(){
          Scanner input = new Scanner (System.in);

          String menu4 = "1. Dotato di doppi garage.\n 2. Non dotato di garage";
          int sceltaGarage = 0;
          boolean garage = true;
         
          while (true) {
            do {
                try {
                    System.out.println(menu4);
                    sceltaGarage = input.nextInt();
                }
                catch (InputMismatchException e) {
                    System.out.println("Non è un numero!");
                    input.next();
                    sceltaGarage = 0;
                }
            }
            while (sceltaGarage == 0);
                     
            switch (sceltaGarage) {
                        case 1: {
                          garage = true;
                          return garage;
                        } break;
                        case 2 :{
                          garage = false;
                          return garage;
                        } break;
                        case 3 :{
                          input.close();
                        }
                        default: {
                          System.out.println("Valore errato");
                        }
                      }
                    }
        }


        private static boolean sceltaRiscaldamento(){
          Scanner input = new Scanner (System.in);

          String menu5 = "1. Dotato di riscaldamento.\n 2. Non dotato di riscaldamento";
          int sceltaRis= 0;
          boolean riscaldamento = true;
         
          while (true) {
            do {
                try {
                    System.out.println(menu5);
                    sceltaRis = input.nextInt();
                }
                catch (InputMismatchException e) {
                    System.out.println("Non è un numero!");
                    input.next();
                    sceltaRis = 0;
                }
            }
            while (sceltaRis == 0);
                     
            switch (sceltaRis) {
                        case 1: {
                          riscaldamento = true;
                          return riscaldamento;
                        } break;
                        case 2 :{
                          riscaldamento = false;
                          return riscaldamento;
                        } break;
                        case 3 :{
                          input.close();
                        }
                        default: {
                          System.out.println("Valore errato");
                        }
                      }
        }

	    // da qui iniziamo a fare le funzioni, ho semplicemnte tagliato tutti gli switch  fatti in  Case 1
        /* do {
                      try {
                          System.out.println(menu2);
                          sceltaTipologia = input.next();
                      }
                      catch (InputMismatchException e) {
                          System.out.println("Non è un");
                          input.next();
                          sceltaTipologia = "";
                      }

                  }
                  while (sceltaTipologia.equals(""));  

                  switch(sceltaTipologia){
                    case "A":{
                      System.out.println("Aggiungere infomazioni relative all'appartamento"); 
                      
                      System.out.println("Inserisci data: \n");
                      int dat = input.nextInt();
                      System.out.println("Inserisci ubicazione: \n");
                      String ub = input.nextLine();
                      System.out.println("Inserisci metratura: \n");
                      int metri = input.nextInt();
                      System.out.println("Inserisci anno di costruzione dell'immobile: \n");
                      int anno = input.nextInt();
                      System.out.println("Inserisci classe energetica: \n");
                      String energia = input.nextLine();
                      System.out.println("Inserisci il numero delle stanze: \n");
                      int stanze = input.nextInt();
                      System.out.println("Inserisci se nell'immobile ci sono doppi servizi: \n"); 
                      
        while (true) {
            do {
                try {
                    System.out.println(menu3);
                    scelta = input.nextInt();
                }
                catch (InputMismatchException e) {
                    System.out.println("Non è un numero!");
                    input.next();
                    scelta = 0;
                }
            }
            while (sceltaServizi == 0);
                      switch (sceltaServizi) {
                        case 1: {
                          boolean servizi = true;
                        }
                        case 2 :{
                          boolean servizi = false;
                        }
                      }

                      System.out.println("Inserisci prezzo dell'immobile: \n");
                      int prez = input.nextInt();
                      System.out.println("Inserisci il piano dell'appartamento: \n");
                      int pianoA = input.nextInt();
                      System.out.println("Inserisci il numero dei piani presenti nel condominio: \n");
                      int pianoB = input.nextInt ();
                      //System.out.println("Inserisci se l'immobile è dotato di garage: \n");
                      //System.out.println("Inserisci se l'immobile ha il riscaldamento autonomo: \n");

                      //Appartamenti app = new Appartamenti (dat, ub, metri, anno, energia, stanze, prez, pianoA, pianoB);
                      //Lista.add(app);
                        
                    }
                  }
                    case "B" :{
                    	System.out.println("Aggiungere informazioni relative alla villetta");
                      
                      
                      System.out.println("Inserisci data: \n");
                      int dat = input.nextInt();
                      System.out.println("Inserisci ubicazione: \n");
                      String ub = input.nextLine();
                      System.out.println("Inserisci metratura: \n");
                      int metri = input.nextInt();
                      System.out.println("Inserisci anno di costruzione dell'immobile: \n");
                      int anno = input.nextInt();
                      System.out.println("Inserisci classe energetica: \n");
                      String energia = input.nextLine();
                      System.out.println("Inserisci il numero delle stanze: \n");
                      int stanze = input.nextInt();
                      //System.out.println("Inserisci se nell'immobile ci sono doppi servizi: \n");
                      System.out.println("Inserisci prezzo dell'immobile: \n");
                      int prez = input.nextInt();
                      System.out.println("Inserisci la metratura del giardino: \n");
                      int mgiardino = input.nextInt ();

                      //Villette vill = new Villette (dat, ub, metri, anno, energia, stanze, prez, pianoA, pianoB, mgiardino);
                      //Lista.add(vill);
                    }  default : {
                    	input.close();
                    	return;
                    }
                  } break;
              }
 
}*/
  
}


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


        private static void aggiuntaAnnuncio(){
          String menu2 = "A. Aggiungi un appartamento.\nB. Aggiungi una villetta";
          String menu3 = "1. Dotato di doppi servizi.\n 2. Non dotato di doppi servizi";
          String sceltaTipologia = "";
          int sceltaServizi = 0;
        
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
}


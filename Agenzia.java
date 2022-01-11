import java.util.*;
public class Agenzia {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String menu = "1. Aggiungere annuncio\n2. Eliminare annuncio\n3. Elenco\n4. Visualizza dettagli\n5. Elenco sintetico\n6. Filtro prezzo\n7. Salva\n8. Carica\n9. Esci\n";
    String menu2 = "A. Aggiungi un appartamento.\nB. Aggiungi una villetta";
    int scelta = 0;
    String sceltaTipologia = "";
    Vector<Annunci> Lista = new Vector <Annunci> ();

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
                      System.out.println("Aggiungere infomazioni relative all'appartamento"); 
                    }
                    case "B" :{
                    	System.out.println("Aggiungere informazioni relative alla villetta");
                    }   default : {
                    	input.close();
                    	return;
                    }
                  } break;
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
    }



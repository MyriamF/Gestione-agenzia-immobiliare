import java.util.*;

//classe che contiene il main 
public class Gestione {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
    
      Agenzia agenzia = new Agenzia(); 
      
      //stampa menu testuale
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

        //switch principale per le operazioni
        switch (scelta) {
          case 1: {
            System.out.println("Aggiungere annuncio");
            System.out.println(menu2);

            try {
              sceltaTipologia = input.nextInt();
              if (sceltaTipologia == 1) {
                agenzia.aggiuntaAnnuncio(input,1);
              } 
              else if (sceltaTipologia == 2) {
                agenzia.aggiuntaAnnuncio(input,2);
              } 
              else {
                System.out.println("Errore dato atteso");
              } 
              System.out.println("Annuncio aggiunto correttamente");
            } 
            catch(InputMismatchException e) {
              System.out.println("Errore dato atteso");
              input.next();
            } 
            break;
          }

          case 2: {
            System.out.println ("Eliminare annuncio"); 
            if (agenzia.getLista().isEmpty()) {
              System.out.println("Il vettore e' vuoto");
            } 
            else {
              agenzia.eliminaAnnuncio(input);
            }
            break;
          }

          case 3: {
            System.out.println ("Elenco sintetico per data"); 
            agenzia.elencoPerData();
            break;
          }

          case 4: {
            System.out.println ("Visualizza dettagli"); 
            agenzia.visualizzaDettagli(input);
            break;
          }

          case 5:{
            System.out.println ("Elenco sintetico per tipo"); 
            agenzia.elencoTipo(input);
            break;
          }

          case 6: {
            System.out.println ("Filtro prezzo"); 
            agenzia.filtroPrezzo(input);
            break;
          }

          case 7: {
            System.out.println ("Salva"); 
            agenzia.salva();
            break;
          }

          case 8: {
            System.out.println ("Carica"); 
            agenzia.caricaFile();
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
  }

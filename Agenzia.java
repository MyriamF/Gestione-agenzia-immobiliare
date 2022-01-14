import java.io.IOException;
import java.util.*;
public class Agenzia {

	public static void main(String[] args) throws IOException {
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
                System.out.println ("Aggiungere annuncio");break;
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
                          sceltaTipologia.equals("");
                      }

                  }
                  while (sceltaTipologia.equals(""));  

                  switch(sceltaTipologia){
                    case "A":{
                      System.out.println("Aggiungere infomazioni relative all'appartamento");break; 
                      aggiuntaAppartamento();
                    } break;
                    case "B" :{
                    	System.out.println("Aggiungere informazioni relative alla villetta");break;
                      aggiuntaVilletta();
                    } break;
               }
        }
        

        public void  aggiuntaAppartamento() throws IOException{
          Scanner input = new Scanner (System.in);
          String menu3 = "1. Dotato di doppi servizi.\n 2. Non dotato di doppi servizi";
          String menu4 = "1. Dotato di garage.\n 2. Non dotato di garage";
          String menu5 = "1. Dotato di riscaldamento.\n 2. Non dotato di riscaldamento";
          int sceltaRis= 0;
          int sceltaGarage = 0;
          int sceltaServizi = 0;
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
          

          System.out.println("Inserimento annuncio di tipo" + tipologia);

          try { System.out.println("Inserisci data: ");
                data = input.nextLine();
                System.out.println("Inserisci ubicazione: ");
                ub = input.nextLine();
                System.out.println("Inserisci metratura: ");
                metri = input.nextInt();
                System.out.println("Inserisci anno di costruzione dell'immobile: ");
                anno = input.nextInt();
                System.out.println("Inserisci classe energetica: ");
                energia = input.nextLine();
                System.out.println("Inserisci il numero delle stanze: ");
                stanze = input.nextInt();
                System.out.println("Inserisci se nell'immobile ci sono doppi servizi: ");
                System.out.println(menu3);
                sceltaServizi = input.nextInt();
                if (sceltaServizi == 1){
                  doppiS = true;
                } else if (sceltaServizi == 2) {
                  doppiS = false;
                } 
              
                System.out.println("Inserisci prezzo dell'immobile: ");
                prez = input.nextInt();
                System.out.println("Inserisci il piano dell'appartamento: ");
                pianoA = input.nextInt();
                System.out.println("Inserisci il numero dei piani presenti nel condominio: ");
                pianoCond = input.nextInt();
                System.out.println("Inserisci se l'immobile è dotato di garage: ");
                System.out.println(menu4);
                sceltaGarage = input.nextInt();
                if (sceltaGarage == 1){
                  garage = true;
                } else if (sceltaGarage == 2){
                  garage = false;
                }
                throw new Exception(menu4);
                System.out.println("Inserisci se l'immobile ha il riscaldamento autonomo:");
                System.out.println(menu5);
                sceltaRis = input.nextInt();
                if (sceltaRis == 1){
                  riscaldamento = true;
                } else if (sceltaGarage == 2){
                  riscaldamento = false;
                } 
                } catch (InputMismatchException e){
                      System.out.println("Errore dato atteso");
                      input.next();
                      return;
                } catch (IndexOutOfBoundsException e) {
                         System.out.println("non è una stringa");
                         input.next();
                  return;
                } catch (NumberFormatException e) {
                      System.out.println("non è un numero");
                }

          Appartamenti app = new Appartamenti(data, ub, metri, anno, energia, stanze,doppiS,prez,tipologia,pianoA, pianoCond,garage, riscaldamento);
          Lista.add(app);
        
        }

        public void aggiuntaVilletta(){
          Scanner input = new Scanner (System.in);
          String menu3 = "1. Dotato di doppi servizi.\n 2. Non dotato di doppi servizi";
          int sceltaServizi = 0;
          String data = "";
          String ub = "";
          int metri = 0;
          int anno = 0;
          String energia = "";
          int stanze = 0;
          boolean doppiS = true;
          int prez = 0;
          String tipologia = "Villetta"; 
          int mGiardino = 0;

        try { System.out.println("Inserimento annuncio di tipo" + tipologia);
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
              sceltaServizi = input.nextInt();
              System.out.println(menu3);
              if (sceltaServizi == 1){
                doppiS = true;
              } else if (sceltaServizi == 2) {
                doppiS = false;
              } 
              System.out.println("Inserisci prezzo dell'immobile: \n");
              prez = input.nextInt();
              System.out.println("Inserisci la metratura del giardino: \n");
              mGiardino = input.nextInt();
            } catch(InputMismatchException e){
                    System.out.println("Errore dato atteso");
                    input.next();
                    return;
            } catch(IndexOutOfBoundsException e){
                    System.out.println("non è una stringa");
                    input.next();
                    return;
            } catch (NumberFormatException e){
                    System.out.println("non è un numero");
            }
       
       
        Villette villetta = new Villette(data,ub,metri,anno,energia,stanze,prez,mGiardino); 
        Lista.add(villetta);
      } 
}



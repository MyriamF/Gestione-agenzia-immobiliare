import java.util.*;

//classe che implementa l'interfaccia Comparator per il confronto tra le date
public class AnnunciComparator implements Comparator <Annunci> {
    
    public int compare (Annunci a1, Annunci a2){
        Date d1 = a1.getDataPubblicazione();
        Date d2 = a2.getDataPubblicazione();
        
        if (d1.before(d2)){
            return 1;
        } 
        else if (d1.after(d2)){
            return -1;
        } 
        else {
            return 0;
        }
    }
}



import java.util.List;
import java.util.ArrayList;
import java.util.Date;
public class MunicipInfoService extends Main {
    
    public String[] getConsommateur(String code) {
       
        String[] trouve;
        
        
        for (int i = 0; i < consommateur.length; i++) {
            
            if(consommateur[i][3].equalsIgnoreCase(code)){
                trouve = consommateur[i];
                return trouve;
                
            }
        }

        return null;

    }
    public String[][] listConsommateur(){
        
        return consommateur;
    }
    public boolean postMessage(String message){
        return true;
    }
    private List<Lot> listLot() {
        var lotList = new ArrayList<Lot>();

        return lotList;
    }
    private Bac getBac(String codeqr) {
        var bac = new Bac();

        bac.codeqr = "232Xd";
        bac.adresse = "2020 du finfin";
        bac.dateEmission = new Date();

        return bac;
    } 
    private Lot getLot(String num) {
        var lot = new Lot();

        return lot;
    }
    private class Bac {
        String codeqr;
        String adresse;
        Date dateEmission;
    }

    private class Lot {
        String numero;
        String type;
        String parent;
        Lot[] sous_lots;
        Date dateRamassage;
        Date dateLivraison;
        String statut;
        int qte_total;
        int qte_traite;
        float taux_rejet;
        float cout;
        String activites;
    }
}

public class InputException extends Exception {

    String s;//Contiendra le message personnalisé
    //Constructeur qui met à jour la String ci-dessus
    public InputException(String s){

        this.s = s;
    }
    
    /** 
     * On Override la methode toString pour
     * retourné le message personnalisé en cas d'erreur
     * @return String
     * @Override
     */
    
    public String toString(){
        
        return s;
    }

}
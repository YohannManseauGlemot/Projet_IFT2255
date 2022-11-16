public class InputException extends Exception {

    String string;//Contiendra le message personnalisé
    //Constructeur qui met à jour la String ci-dessus
    public InputException(String string){

        this.string = string;
    }
    
    /** 
     * On Override la methode toString pour
     * retourné le message personnalisé en cas d'erreur
     * @return String
     * @Override
     */
    
    public String toString(){
        
        return string;
    }

}
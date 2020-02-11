import org.jetbrains.annotations.NotNull;

public class Etudiant {
    private String login;
    private String Nom ;
    private String Prenom;
    private String Adresse;
    private float  notes ;
    Etudiant(String Nom, String Prenom, String login) {
        setLogin(login);
        getPrenom(Prenom);
        getNom(Nom);
    }
    public String getLogin() {
        return login;
    }
    public String getNom(String nom) {
        return Nom;
    }
    public String getPrenom(String prenom) {
        return Prenom;
    }
    public String getAdresse() {
        return Adresse;
    }
    /*public String getMail() {

        return  ;
    }*/
    public String getNomComplet() {
        return Nom+Prenom;
    }



    public void setLogin(@NotNull String login) {
        this.login = login.toLowerCase();
    }
   /* public  void setAdresse(String adresse){

    }*/
    /* public  void addNote(float note){

    }*/
    public  void affiche(){
        System.out.print("Saisir un mot : ");
        System.out.print("Saisir un mot : ");
    }

}

public class TestEtudiant {

    public void main(String[] args) {
        // Déclaration et construction de deux objets
        Etudiant et1 = new Etudiant("dupont", "pierre", "dupontp");
        Etudiant et2 = new Etudiant("martin", "francis", "martinf");

        // Affichage des objets de type Etudiant
        System.out.println("\nAfficher les deux étudiants créés :");
        et1.affiche();
        et2.affiche();

    }
}

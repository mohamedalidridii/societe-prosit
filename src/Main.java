import entities.Employe;
import entities.SocieteArrayList;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(1, "Ali", "Mohamed", "IT", 2);
        Employe e2 = new Employe(2, "Sami", "Ahmed", "RH", 3);
        Employe e3 = new Employe(3, "Ali", "Sofien", "IT", 1);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        System.out.println("Liste des employés :");
        societe.displayEmploye();

        System.out.println("\nRecherche par nom 'Ali' : " + societe.rechercherEmploye("Ali"));
        System.out.println("Recherche par objet e2 : " + societe.rechercherEmploye(e2));

        societe.trierEmployeParNomDépartementEtGrade();
        System.out.println("\nListe triée par Département et Grade :");
        societe.displayEmploye();
    }
}
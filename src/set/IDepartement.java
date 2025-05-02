package set;

import java.util.TreeSet;
//these changes related to Prosit set number 10
public interface IDepartement<T>{

    public void ajouterDepartement(T t);
    public boolean rechercherDepartement(String nom);
    public boolean rechercherDepartement(T t);
    public void supprimerDepartement(T t);
    public void displayDepartement();
    public TreeSet<T> trierDepartementById();
}
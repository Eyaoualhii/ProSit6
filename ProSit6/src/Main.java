import Exceptions.MagasinPleinException;
import Exceptions.PrixNegatifException;

public class Main {
    public static void main(String[] args) {

        Produit p1 = new Produit(1021, "Lait", "Delice");
        Produit p2 = new Produit(2510, "Yaourt", "Vitalait");
        Produit p3 = new Produit(5000, "Fromage", "President");

        Magasin m1 = new Magasin(1,"Carrefour","Centre Ville");
        //Exception de type java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2 apres ajout des produits
        //On doit gerer l'exception avec le bloc try/catch
        try {
        m1.ajoutProduit(p1);
        m1.ajoutProduit(p2);
        m1.ajoutProduit(p3);
        } catch (MagasinPleinException e) {
            System.out.println(e);

        }
        try {
            p1.setPrix(-500);
        }catch (PrixNegatifException p){
            System.out.println(p);
        }


    }
}
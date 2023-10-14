

import Exceptions.PrixNegatifException;

import java.util.Date;

public class Produit {


    private int id;
    private String libelle;
    private String marque;
    private double prix;
    private Date dateExpiration;

    public Produit(int id, String libelle, String marque, double prix) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
    }
    public Produit(int id, String libelle, String marque) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) throws PrixNegatifException{

            if (prix > 0) {
                this.prix = prix;
            } else{
        throw new PrixNegatifException("Le prix ne peut pas être négatif");
        }
    }

    public String toString() {
        return "Le produit {" + "Id=" + id + ", Son libelle='" + libelle + '\'' + ", Sa marque='" + marque + '\'' + ", Son prix=" + prix + '}';
    }


}

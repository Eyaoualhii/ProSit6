

import Exceptions.MagasinPleinException;

import java.util.Arrays;

public class Magasin {
    private int idMagasin;
    private String nomMagasin;
    private String adresse;
    private int capacité;
    private int nbrProduit = 0;

    Produit[] produits = new Produit[2];

    public Magasin(int idMagasin, String nomMagasin, String adresse, int capacité, int nbrProduit, Produit[] produits) {
        this.idMagasin = idMagasin;
        this.nomMagasin = nomMagasin;
        this.adresse = adresse;
        this.capacité = capacité;
        this.nbrProduit = nbrProduit;
        this.produits = produits;
    }

    public Magasin(int idMagasin, String adresse, int capacité) {
        this.idMagasin = idMagasin;
        this.adresse = adresse;
        this.capacité = capacité;
    }

    public Magasin(int idMagasin, String nomMagasin, String adresse) {
        this.idMagasin = idMagasin;
        this.nomMagasin = nomMagasin;
        this.adresse = adresse;
    }

    public Magasin() {
    }

    public void ajoutProduit(Produit p) throws MagasinPleinException {
        if (nbrProduit < produits.length) {
                this.produits[nbrProduit] = p;
                nbrProduit++;
                System.out.println("Le produit est ajouté");

        } else {
            throw new MagasinPleinException("Le magasin est plein");
        }
    }




    @Override
    public String toString() {
        return "Magasin{" +
                "idMagasin=" + idMagasin +
                ", nomMagasin='" + nomMagasin + '\'' +
                ", adresse='" + adresse + '\'' +
                ", capacité=" + capacité +
                ", nbrProduit=" + nbrProduit +
                ", produits=" + Arrays.toString(produits) +
                '}';
    }

}




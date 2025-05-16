package fr.diginamic.factory;

public class Element {
    String nom;
    double valeur;
    Unite unite;

    public Element(String nom, double valeur, Unite unite) {
        this.nom = nom;
        this.valeur = valeur;
        this.unite = unite;
    }
}

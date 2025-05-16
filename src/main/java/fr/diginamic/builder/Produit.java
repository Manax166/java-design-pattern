package fr.diginamic.builder;

import fr.diginamic.factory.*;

import java.util.ArrayList;
import java.util.List;

public class Produit {
    private final String nom;
    private final Marque marque;
    private final String grade;
    private final Categorie categorie;
    private final List<Ingredient> ingredientList;
    private final List<Additif> additifList;
    private final List<Allergene> allergeneList;

    public Produit(Builder produitBuilder){
        this.nom = produitBuilder.nom;
        this.marque = produitBuilder.marque;
        this.grade = produitBuilder.grade;
        this.categorie = produitBuilder.categorie;
        this.ingredientList = produitBuilder.ingredientList;
        this.allergeneList = produitBuilder.allergeneList;
        this.additifList = produitBuilder.additifList;

    }

    public String getNom() {
        return nom;
    }

    public Marque getMarque() {
        return marque;
    }

    public String getGrade() {
        return grade;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    public List<Additif> getAdditifList() {
        return additifList;
    }

    public List<Allergene> getAllergeneList() {
        return allergeneList;
    }

    public static class Builder{
        private String nom;
        private Marque marque;
        private String grade;
        private Categorie categorie;
        private List<Ingredient> ingredientList = new ArrayList<>();
        private List<Additif> additifList = new ArrayList<>();
        private List<Allergene> allergeneList = new ArrayList<>();

        public Builder nom(String nom){
            this.nom = nom;
            return this;
        }
        public Builder marque(String marqueNom){
            this.marque = new Marque(marqueNom);
            return this;
        }
        public Builder grade(String grade){
            this.grade = grade;
            return this;
        }
        public Builder categorie(String categorieNom){
            this.categorie = new Categorie(categorieNom);
            return this;
        }
        public Builder addIngredient(String ingredientNom, double valeur, Unite unite){
            this.ingredientList.add((Ingredient) Factory.ElementFactory(ingredientNom, valeur, unite, Type.ingredient));
            return this;
        }
        public Builder addAdditif(String additifNom, double valeur, Unite unite){
            this.additifList.add((Additif) Factory.ElementFactory(additifNom, valeur, unite, Type.additif));
            return this;
        }
        public Builder addAllergene(String allergeneNom, double valeur, Unite unite){
            this.allergeneList.add((Allergene) Factory.ElementFactory(allergeneNom, valeur, unite, Type.allergene));
            return this;
        }
        public Produit build(){
            return new Produit(this);
        }
    }
}

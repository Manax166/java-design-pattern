package fr.diginamic.builder;

import fr.diginamic.factory.Unite;

import static org.junit.jupiter.api.Assertions.*;

public class ProduitTest {

    @org.junit.Test
    public void testProduitBuilder(){
        Produit produit = new Produit.Builder()
                .nom("Galette Frangipane")
                .categorie("Gateaux")
                .grade("E")
                .marque("Chabrior")
                .addIngredient("pate feuilletée", 150000, Unite.MILLIGRAMME)
                .addIngredient("poudre d'amande", 250000, Unite.MILLIGRAMME)
                .addIngredient("oeuf", 25000, Unite.MILLIGRAMME)
                .addIngredient("sucre", 120000, Unite.MILLIGRAMME)
                .addAllergene("oeuf", 25000, Unite.MILLIGRAMME)
                .build();
        assertEquals(produit.getNom(), "Galette Frangipane");
        assertEquals(produit.getGrade(), "E");
        assertEquals(produit.getCategorie().getNom(), "Gateaux");
        assertEquals(produit.getMarque().getNom(), "Chabrior");
        assertEquals(produit.getIngredientList().size(), 4);
        assertEquals(produit.getAdditifList().size(), 0);
        assertEquals(produit.getAllergeneList().size(), 1);
    }
}
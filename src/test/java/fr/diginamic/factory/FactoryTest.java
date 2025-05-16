package fr.diginamic.factory;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactoryTest {
    @org.junit.Test
    public void testIfNull(){
        assertNull(Factory.ElementFactory("Lait", 12.3, Unite.MILLIGRAMME, null));
    }
    @org.junit.Test
    public void testIfIngredient(){
        assertInstanceOf(Ingredient.class, Factory.ElementFactory("Lait", 12.3, Unite.MILLIGRAMME, Type.ingredient));
    }
    @Test
    public void testIfAllergene(){
        assertInstanceOf(Allergene.class, Factory.ElementFactory("Lait", 12.3, Unite.MILLIGRAMME, Type.allergene));
    }
    @Test
    public void testIfAdditif(){
        assertInstanceOf(Additif.class, Factory.ElementFactory("Lait", 12.3, Unite.MILLIGRAMME, Type.additif));
    }
}
package fr.diginamic.factory;

import java.lang.invoke.SwitchPoint;

public class Factory {
    public static Element ElementFactory(String nom, double valeur, Unite unite, Type type){
        if(type == null) return null;
        switch (type){
            case ingredient -> {
                return new Ingredient(nom, valeur, unite);
            }
            case additif -> {
                return new Additif(nom, valeur, unite);
            }
            case allergene -> {
                return new Allergene(nom, valeur, unite);
            }
        }
        return new Element(nom,valeur,unite);
    }
}

package fr.diginamic.singleton;

import java.util.ResourceBundle;

public class Singleton {
    private static ResourceBundle configuration;
    private Singleton(){
        configuration = ResourceBundle.getBundle("configuration");
    }
    public static ResourceBundle getInstance(){
        if(configuration == null) new Singleton();
        return configuration;
    }
}

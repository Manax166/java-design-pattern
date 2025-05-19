package fr.diginamic.singleton;

import org.junit.jupiter.api.Test;

import java.util.ResourceBundle;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    void getInstance() {
        assertSame(Singleton.getInstance(), Singleton.getInstance());
        assertNotSame(Singleton.getInstance(), ResourceBundle.getBundle("configuration"));
        assertEquals(Singleton.getInstance().getString("db.url"), "jdbc:mysql://localhost:3306/mabase");
        assertEquals(Singleton.getInstance().getString("db.user"),"root");
        assertEquals(Singleton.getInstance().getString("db.password"), "1234");
    }
}
package fr.diginamic.factory;

public enum Type {
    ingredient(1), allergene(2), additif(3)
    ;
    int id;
    public int getId(){
        return this.id;
    }
    Type(int i) {
        int id = i;
    }
}

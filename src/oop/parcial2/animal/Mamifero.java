package oop.parcial2.animal;

public class Mamifero extends Animal {
    private final boolean walk;

    public Mamifero(String name,boolean eat,boolean walk){
        super(name,eat);
        this.walk=walk;
    }

    public boolean isWalk() {
        return walk;
    }
}

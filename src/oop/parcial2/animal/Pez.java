package oop.parcial2.animal;

public class Pez extends Animal {
    private final boolean swimming;

    public Pez(String name,boolean eat,boolean swimming){
        super(name,eat);
        this.swimming=swimming;
    }

    public boolean isSwimming() {
        return swimming;
    }

}

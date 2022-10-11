package oop.parcial2.animal;

public class Ave extends Animal{
    private final boolean fly;

    public Ave(String name,boolean eat,boolean fly){
        super(name,eat);
        this.fly=fly;
    }

    public boolean isFly() {
        return fly;
    }
}

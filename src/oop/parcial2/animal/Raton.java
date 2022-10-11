package oop.parcial2.animal;

public class Raton extends Mamifero {

    public Raton(boolean eat,boolean walk){
        super("Raton",eat,walk);
    }

    @Override
    public String toString(){
        return "Raton";
    }
}

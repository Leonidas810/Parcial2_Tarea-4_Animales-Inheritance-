package oop.parcial2.animal;

public class Gato extends Mamifero {

    public Gato(boolean eat,boolean walk){
        super("Gato",eat,walk);
    }

    @Override
    public String toString(){
        return "Gato";
    }
}

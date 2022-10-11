package oop.parcial2.animal;

public class Perro extends Mamifero {

    public Perro(boolean eat,boolean walk){
        super("Perro",eat,walk);
    }

    @Override
    public String toString(){
        return "Perro";
    }
}

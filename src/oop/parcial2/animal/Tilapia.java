package oop.parcial2.animal;

public class Tilapia extends Pez {

    public Tilapia(boolean eat,boolean swimming){
        super("Tilapia",eat,swimming);
    }

    @Override
    public String toString(){
        return "Tilapia";
    }
}

package oop.parcial2.animal;

public class Salmon extends Pez {

    public Salmon(boolean eat,boolean swimming){
        super("Salmon",eat,swimming);
    }

    @Override
    public String toString(){
        return "Salmon";
    }
}

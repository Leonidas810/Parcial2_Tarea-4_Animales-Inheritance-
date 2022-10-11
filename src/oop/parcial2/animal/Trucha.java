package oop.parcial2.animal;

public class Trucha extends Pez {

    public Trucha(boolean eat,boolean swimming){
        super("Trucha",eat,swimming);
    }
    @Override
    public String toString(){
        return "Trucha";
    }
}

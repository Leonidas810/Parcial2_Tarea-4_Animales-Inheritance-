package oop.parcial2.animal;

public class Sardina extends Pez {

    public Sardina(boolean eat,boolean swimming){
        super("Sardina",eat,swimming);
    }

    @Override
    public String toString(){
        return "Sardina";
    }
}

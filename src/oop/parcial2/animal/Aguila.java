package oop.parcial2.animal;

public class Aguila extends Ave {

    public Aguila(boolean eat,boolean fly){
        super("Aguila",eat,fly);
    }
    @Override
    public String toString(){
        return "Aguila";
    }
}

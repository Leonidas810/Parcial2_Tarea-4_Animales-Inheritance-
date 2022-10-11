package oop.parcial2.animal;

public class Gorrion extends Ave {

    public Gorrion(boolean eat,boolean fly){
        super("Gorrion",eat,fly);
    }
    @Override
    public String toString(){
        return "Gorrion";
    }
}

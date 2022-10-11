package oop.parcial2.animal;

public class Condor extends Ave {

    public Condor(boolean eat,boolean fly){
        super("Condor",eat,fly);
    }
    @Override
    public String toString(){
        return "Condor";
    }
}

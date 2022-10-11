package oop.parcial2;
import oop.parcial2.animal.*;
import java.util.LinkedList;
import java.util.List;
public class Main {
    public static void main(String[] args){
        List<Animal> animals = new LinkedList<>();

        animals.add(new Perro(true,true));
        animals.add(new Gato(true,true));
        animals.add(new Raton(true,true));
        animals.add(new Sardina(true,true));
        animals.add(new Salmon(true,true));
        animals.add(new Tilapia(true,true));
        animals.add(new Trucha(true,true));
        animals.add(new Gorrion(true,true));
        animals.add(new Condor(true,true));
        animals.add(new Halcon(true,true));
        animals.add(new Aguila(true,true));

        for(Animal animal: animals){
            System.out.println("Name con toString " + animal.toString());
            System.out.println("Name con getName: " + animal.getName());
            System.out.println("---------------------------------------");
        }
    }
}

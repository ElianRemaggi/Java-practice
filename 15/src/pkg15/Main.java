/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15;
import Clases.*;
import Interfaces.*;
/**
 *
 * @author Elian_2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Pet [] par = {new Fish("nemo") ,new Fish("dory"), new Cat("Silvestre"), new Cat("Lula")};
         AnimalTest a = new AnimalTest();
        for(Pet c : par){
        a.myPet(c);
    }
        SoundTransmitter [] speack = { new Dog("Lota"), new Dog("cortamalteza"), new Cat("Lula"), new Cat("Lila"), new Cat("Matitutitu")};
        System.out.println("Some animals can speack");
        for(SoundTransmitter s : speack){
            s.transmit();
        }
       TestWeightComparator Test = new TestWeightComparator();
       Test.main(); 
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import Interfaces.*;
/**
 *
 * @author Elian_2
 */
public class AnimalTest {
    @SuppressWarnings("empty-statement")
    public void myPet(Pet p){
        System.out.println("El nombre de su mascota es "+p.getName());
        p.play();
    }
    
    public void emitedSound(SoundTransmitter transmitter){
        System.out.println(transmitter.getSound());
    }
}

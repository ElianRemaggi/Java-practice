/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import Interfaces.*;
import AbstractClass.Animal;
/**
 *
 * @author Elian_2
 */
public class Dog extends Animal implements Pet, SoundTransmitter {

    public String Name,Sound="Guau Guau Guau!!!";

    public Dog() {
    }

    public Dog(String Name) {
        this.Name = Name;
    }
    
    public String getName() {
        return Name;
    }

    public String getSound() {
        return Sound;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setSound(String Sound) {
        this.Sound = Sound;
    }   
    
    @Override
    public void eat() {
        System.out.println("Dog.eat()");
    }

    @Override
    public void play() {
        System.out.println("Dog.play()");
    }

    @Override
    public void transmit() {
        System.out.println("Dogs transmit sound like: "+this.getSound());
    }

    
   
    
}

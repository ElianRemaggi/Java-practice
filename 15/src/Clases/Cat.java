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
public class Cat extends Animal implements Pet, SoundTransmitter {
    
    public String name,Sound="Miau Miau Miau!!!";

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    // implement interface pet
    public void play(){
        System.out.println("Cat.play()");
    }
    
    //implement AbstractClass animal
    public void eat(){
        System.out.println("Cat.eat()");
    }

    @Override
    public void transmit() {
        System.out.println("Cats say: "+this.Sound);
    }

    public String getSound() {
        return Sound;
    }

    @Override
    public void setSound(String Sound) {
        this.Sound = Sound;
    }   
}


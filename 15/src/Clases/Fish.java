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
public class Fish extends Animal implements Pet{
    private String name;

    public Fish() {
    }

    public Fish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void play(){
        System.out.println("Fish.Play()");
    }

    public void eat(){
        System.out.println("Fish.eat()");
    }
            
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClass;
import Interfaces.*;
import java.lang.Comparable;
/**
 *
 * @author Elian_2
 */
public  abstract class Animal {
    public int weight;
    public abstract void eat();

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    /*This metod compare two istances of animal
    if this.weight is > than the parameter animal return -1
    if this.weight and parameter animal habe the same weight returns 0
    if this.weight is < than the parameter aniaml return 1 */
    public int Comparable(Animal a){
        if (this.weight>a.weight){
           return -1;
        }
        if(this.weight==a.weight){
            return 0;
        }
        return 1;
    }    
}

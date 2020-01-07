/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;
import pkg17.AbstractClass.Article;
/**
 *
 * @author Elian_2
 */
public class Sweatshirt extends Article{
    private int waist;

    //constructors
    
    public Sweatshirt() {
    }
    
    public Sweatshirt(int waist) {
        this.waist = waist;
    }
    
    public Sweatshirt(int waist, int id){
        super(id); 
        this.waist=waist;
    }
    
    public Sweatshirt(int waist, int id, double price){
        super(id,price);
        this.waist=waist;
    }
    
    public Sweatshirt(int waist, int id, double price, String color){
        super(id,price,color);
        this.waist=waist;
    }

    // equals

    
    public boolean equals(Sweatshirt obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sweatshirt other = (Sweatshirt) obj;
        if (this.waist != other.waist) {
            return false;
        }
        return true;
    }

    // tostring
    
    @Override
    public String toString() {
        return super.toString()+  " waist: " + this.getWaist();
    }
    
    // get  
    public int getWaist() {
        return waist;
    }
    
    // set
    public void setWaist(int waist) {
        this.waist = waist;
    }
    
    
}

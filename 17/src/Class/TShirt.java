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
public class TShirt extends Article{
    private int waist;

    
    //Constructors
    public TShirt() {
    }

    public TShirt(int waist) {
        this.waist = waist;
    }
    
    public TShirt(int waist, int id){
        super(id); 
        this.waist=waist;
    }
    
    public TShirt(int waist, int id, double price){
        super(id,price);
        this.waist=waist;
    }
    
    public TShirt(int waist, int id, double price, String color){
        super(id,price,color);
        this.waist=waist;
        }
    //get 

    public int getWaist() {
        return waist;
    }
    
    //set
    public void setWaist(int waist) {
        this.waist = waist;
    }
        
    //To string
    @Override
    public String toString() {
        return super.toString()+  " waist: " + this.getWaist();
    }

    /* BUG 
    public void showTShirt(TShirt t){
        System.out.println(+super.showArticle(this) +" waist: "+ this.getWaist());
    }
    */
    
    //equals
    
    public boolean equals(TShirt obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TShirt other = (TShirt) obj;
        if (this.waist != other.waist) {
            return false;
        }
        return true;
    }
    
    
    
}

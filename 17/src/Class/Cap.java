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
public class Cap extends Article {

    //constructors
    
    public Cap() {
    }
    
    public Cap(int id){
        this.id=id;
    }
    
    public Cap(int id, double price){
     super(id);   
     this.price=price;
    }
    
    public Cap(int id, double price, String color){
        super(id,price);
        this.color=color;
    }
    
    public String toString(){
        return super.toString();
    }
    
    /*
    public void showCap(){
        super.showArticle();
    }
    
    */
    
    public boolean equals(Cap obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}


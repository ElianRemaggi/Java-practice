/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17.AbstractClass;

import java.util.Objects;

/**
 *
 * @author Elian_2
 */
public abstract class Article {
    
    protected int id;
    protected double price;
    protected String color;

    public Article() {
    }
    
    public Article(int id){
        this.id=id;
    }
    public Article(String color){
        this.color = color;
    }
    
    public Article(int id, double price){
        this(id);
        this.price = price;
    }

    public Article(int id, double price, String color) {
        this(id,price);
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public boolean equalsArticles(Object object ){
        return this.equals(object);              
    }
    
    public String toString(){
        return "id: "+this.getId()+" price: "+this.getPrice()+" colour: "+this.getColor();
    }
    /*
    public void showArticle(Article ar){
        System.out.println("id: "+this.getId()+" price: "+this.getPrice()+" color: "+this.getColor());
    }
    */
    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    
    public boolean equals(Article obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Article other = (Article) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return true;
    }
    
    
}

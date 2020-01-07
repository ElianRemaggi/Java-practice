/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17;
import Class.*;
import pkg17.AbstractClass.Article;

/**
 *
 * @author Elian_2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       // Testing TShirt constructors an toString
       TShirt tshirt1=new TShirt(4);
       tshirt1.setColor("red");
       tshirt1.setId(0);
       tshirt1.setPrice(500.0);
       
       TShirt tshirt2= new TShirt(4,0);
       tshirt2.setColor("red");
       tshirt2.setPrice(500.0);
       
       TShirt tshirt3= new TShirt(4,0,500.0);
       tshirt3.setColor("red");
       
       TShirt tshirt4= new TShirt(4,0,500.0,"red");
       
       System.out.println(tshirt1.toString());
       System.out.println(tshirt2.toString());
       System.out.println(tshirt3.toString());
       System.out.println(tshirt4.toString());
       
       
       Sweatshirt Sw1= new Sweatshirt(3);
       Sw1.setId(1);
       Sw1.setPrice(700.0);
       Sw1.setColor("green");
       Sweatshirt Sw2= new Sweatshirt(3,1);
       Sw2.setPrice(700.0);
       Sw2.setColor("green");
       Sweatshirt Sw3= new Sweatshirt(3,1,700.0);
       Sw3.setColor("green");
       Sweatshirt Sw4= new Sweatshirt(3,1,700.0,"green");
       
       System.out.println(Sw1.toString());
       System.out.println(Sw2.toString());
       System.out.println(Sw3.toString());
       System.out.println(Sw4.toString());
       
       
       Cap cap1= new Cap(2);
       cap1.setPrice(150.0);
       cap1.setColor("black");
       Cap cap2= new Cap(2,150.0);
       cap2.setColor("black");
       Cap cap3= new Cap(2,150,"black");
       
       System.out.println(cap1.toString());
       System.out.println(cap2.toString());
       System.out.println(cap3.toString());
       
       
       TShirt tshirt5= new TShirt(4,0,500.0,"red");
       if(tshirt5.equals(tshirt4)){
            System.out.println("True answer with boolean");
       }
       if(tshirt5==tshirt4){ // Esta condicion no se cumple
           System.out.println("fake answer with ==");
       }
       
       TShirt tshirt6 = tshirt5;
       
       if(tshirt6.equals(tshirt5)) 
       {
           System.out.println("Are the same");
       }
    }
    
}

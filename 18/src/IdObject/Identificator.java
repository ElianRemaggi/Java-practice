/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IdObject;

/**
 *
 * @author Elian_2
 */
public class Identificator {
    private static int total = 0;
    private int id;

    public static int getTotal() {
        return total;
    }
    
        public int id(){
        total++;
        this.id=Identificator.getTotal();
        
        return id;
    }

    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }   

    public static void setTotal(int total) {
        Identificator.total = total;
    }
    
    public Identificator() {
           Identificator.setTotal(++total);
           this.id=Identificator.getTotal();
       }
     
    public int instance(){
        return Identificator.getTotal();
    }
    
    }
   
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18;
import Test.*;
import IdObject.Identificator;

/**
 *
 * @author Elian_2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TestConvertor.main();
        
       for (int i = 0; i < 10; i++) {
        Identificator tst = new Identificator();
        System.out.println(tst.getId());
        System.out.println(Identificator.getTotal());
    }
    }
    
}

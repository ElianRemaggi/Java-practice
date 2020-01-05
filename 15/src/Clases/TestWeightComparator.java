/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import AbstractClass.weightCompare;


/**
 *
 * @author Elian_2
 */
public class TestWeightComparator {
        public TestWeightComparator() {
    }
    
    public void main(){
        Cat Lula = new Cat("lula");
        Lula.setWeight(3);
        Cat Lila = new Cat("Lila");
        Lila.setWeight(5);
    //posible error
        weightCompare wC = new weightCompare();
        wC.weightVerify(Lula, Lila);
    }
   
}

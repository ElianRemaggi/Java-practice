/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClass;
import AbstractClass.Animal;

/**
 *
 * @author Elian_2
 */
public class weightCompare {

    public weightCompare() {
    }
    
    public void weightVerify(Animal a, Animal b){
        int result;
        result=a.Comparable(b);
        if(result==1){
            System.out.println("The first animal is lighter");
            return ;
        }
        if(result==0){
            System.out.println("They have the same weight");
        }else{
            System.out.println("The first animal is bigger");
        }
    }
   
}

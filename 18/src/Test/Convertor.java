/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author Elian_2
 */
public class Convertor {
    
    // Fahrenheit to Celsius
    public static double calculateCelsius(double temp){
         return ((temp - 32) * 5/9);
    }
    
    //Celsius to Fahrenheit
    public static double calculateFarenheit(double temp){
        return ((temp*9/5) + 32);
    }
    
}
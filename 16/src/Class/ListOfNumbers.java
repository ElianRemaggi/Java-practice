/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.io.*;
import java.util.List;
import java.util.ArrayList;


public class ListOfNumbers {
    // Read a file with numbers and create an array with that numbers
    private List<Integer> list;
    private static final int SIZE = 10;

    public ListOfNumbers () {
        list = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++)
            list.add(new Integer(i));
    }
    public void writeList() {
        PrintWriter out = null;

        try {
            System.out.println("Entering try statement");
            out = new PrintWriter(new FileWriter("OutFile.txt"));
        
            for (int i = 0; i < SIZE; i++)
                out.println("Value at: " + i + " = " + list.get(i));
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Caught IndexOutOfBoundsException: " +
                                 e.getMessage());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }
    
        public void readList () {
            int [] uniti = new int[SIZE];
            File fi = null;
            FileReader fr = null;
            try{
                // Open file
                fi = new File("OutFile.txt");
                fr = new FileReader("OutFile.txt");
                // Read file
                int number,i=0;
                while((number=fr.read())!=-1){
                    System.out.println(number);
                    uniti[i]=number;
                    i++;
                }
            }   
            catch(FileNotFoundException nf){
                System.out.println("File not found exception, verify the url");
            }
            catch(IOException ex){
                System.out.println("Caught IOExcesption ocurred : " +ex.getMessage());
            } finally {
                //Close file
                if (null != fr){
                   try{
                    System.out.println("Closing File Reader");
                    fr.close();
                   }catch(IOException e){
                       System.out.println("Caught IOExcesption ocurred closing file : " +e.getMessage());
                       System.out.println("Maybe your file dont close");                  
                }
                }else{
                    
                    System.out.println("File reader not open ");
                
                
                }
                }
            
        }
}

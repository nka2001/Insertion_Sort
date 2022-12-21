package com.mycompany.insertionsortv1;

/**
 * Main class, holds main method, used to create and print out the results
 * of insertion sort, as well as create test case objects. 
 * @author nicka
 */
public class MainClass {
    
    /**
     * Main Method
     * @param args 
     */
    public static void main(String[] args) {
        
        InsertionSortOnPrimitives i = new InsertionSortOnPrimitives();
        
        
        /*
        i.inputSize(5);
        i.fillArray();
        i.printArray();
        i.sort();
        i.printArray();
        */
        
        InsertionSortOnReference i2 = new InsertionSortOnReference();
        
        i2.setArraySize(6);
        i2.fillArray();
        i2.sort();
        System.out.println(i2.toString());
     
        
        
        
        
        
    }
    
    
}

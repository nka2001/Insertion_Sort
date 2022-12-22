package com.mycompany.insertionsortv1;

/**
 * Main class, holds main method, used to create and print out the results of
 * insertion sort, as well as create test case objects.
 *
 * @author nicka
 */
public class MainClass {

    /**
     * Main Method
     *
     * @param args
     */
    public static void main(String[] args) {
        
        
        
        
        System.out.println("-----Test Case 1: Insertion Sort on primitive ints v1-----");
        //first test case, gather input from the user and sort it

        InsertionSortOnPrimitives i = new InsertionSortOnPrimitives();//create an insertion sort object (on primitives)

        i.inputSize(5);//set the input size (0 before this line of code)
        i.fillArray();//fill the array to size 5, so indexes 0-4
        System.out.println("--Before Sort--");
        System.out.println(i.toString());//print the array before sort
        i.sort();//sort the array
        System.out.println("--After Sort--");
        System.out.println(i.toString());//print the array after sort

        
        
        
        
        
        System.out.println("-----Test Case 2: Insertion Sort on primitive ints v2-----");
        //second test case, pass in a prefilled array to the constructor, then sort it
        
        int[] arr = {9, 6, 4, 1, 3, 8};//prefilled array to be sorted

        InsertionSortOnPrimitives i2 = new InsertionSortOnPrimitives(arr.length, arr);//create an insertion sort object (on primitives) passing that prefilled array, as well as the size

        i2.sort();//sort the array
        System.out.println(i2.toString());//print it 
        
        
        
        
        
        System.out.println("-----Test Case 3: Insertion Sort on Reference type (Integer) v1-----");
        //third test case, first on reference types, gather input from the user and sort it. 
        
        InsertionSortOnReference i3 = new InsertionSortOnReference();//create an insertion sort object, this time on reference type
        
        i3.setArraySize(5);//set the array size, 0 initially 
        i3.fillArray();//fill the array with numbers entered by the user
        System.out.println("--Before Sort--");
        System.out.println(i3.toString());//print before the sort
        i3.sort();//sort the array
        System.out.println("--After Sort--");//print after the sort
        System.out.println(i3.toString());
        
        
   
        System.out.println("-----Test Case 4: Insertion Sort on Reference Type (Integer) v2-----");
        //this is similar to the second test case in primitives, perform insertion sort on a prefilled array passed into the constructor
        
        Integer[] arr2 = {9,3,6,7,1,0};//does implicit conversion to Integer**
        
        InsertionSortOnReference i4 = new InsertionSortOnReference(arr2.length, arr2);//create an insertion sort object, but on reference type integer
        
        i4.sort();//sort the prefilled array
        System.out.println(i4.toString());//then print it
        

    }

}

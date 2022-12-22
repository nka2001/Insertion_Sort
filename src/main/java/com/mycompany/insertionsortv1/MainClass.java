package com.mycompany.insertionsortv1;

import java.util.ArrayList;
import java.util.List;

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
        
        
        
        
        System.out.println("-----Test Case 5: Insertion Sort on Generic Type v1-----");
        //fifth test case, it performs insertion sort on a list of generic types (ints)
        InsertionSortOnGeneric i5 = new InsertionSortOnGeneric(3);//create the insertion sort object
        
        i5.fillList();//fill the list with user data
        System.out.println(i5.toString());//print before the sort
        i5.sort();//sort the array
        System.out.println(i5.toString());//print after the sort
        
        
        
        System.out.println("-----Test Case 6: Insertion Sort on Generic Types v2-----");
        //sixth test case, it performs insertion sort on a prefilled array, using the experimental constructor
        
        List l = new ArrayList();//create a generic list 
        
        l.add(10);
        l.add(9);
        l.add(1);
        
        
        InsertionSortOnGeneric i6 = new InsertionSortOnGeneric(l.size(), l);//create the insertion sort object
       
        System.out.println(i6.toString()); //print before sort
        i6.sort();//sort the list using insertion sort
        System.out.println(i6.toString());//print after sort
        
        
    }

}

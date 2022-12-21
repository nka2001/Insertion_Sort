/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.insertionsortv1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * this class is a bit of an experiment, I am working with generics and looking
 * to perform insertion sort on a list of generics
 *
 * @author nicka
 * @param <T>
 */
public class InsertionSortOnGeneric<T> {

    private int sizeOfArray;//size of the array
    private List<T> arrToBeSorted;//list type because of generic array creation
    public Scanner scan = new Scanner(System.in);

    /**
     * default constructor, sets the size of the array to 0, as well as
     * intializes the arraylist.
     */
    public InsertionSortOnGeneric() {
        this.sizeOfArray = 0;
        this.arrToBeSorted = new ArrayList<>(sizeOfArray);
    }

    /**
     * constructor with default parameter, in this case, sets the size of the
     * arraylist
     *
     * @param arrSize
     */
    public InsertionSortOnGeneric(int arrSize) {
        this.sizeOfArray = arrSize;//set the size of the array list using the constructor
        this.arrToBeSorted = new ArrayList<>(sizeOfArray);//initialize the array to that specified size
    }

    /**
     * (Experiment) constructor with default parameters it takes the array size,
     * as well as an array as parameters, essentially takes a list and will
     * perform insertion sort on it
     *
     * @param arrSize
     * @param arr
     */
    public InsertionSortOnGeneric(int arrSize, List<T> arr) {
        this.sizeOfArray = arrSize;//set the arraysize 
        this.arrToBeSorted = new ArrayList<>(sizeOfArray);//initialize the array
        this.arrToBeSorted = arr;//set the array provided to the array created in this class
    }

    /**
     * setArrSize takes one parameter, the size of the array, and initializes
     * the array to that size
     *
     * @param size
     */
    public void setArrSize(int size) {
        this.sizeOfArray = size;
        this.arrToBeSorted = new ArrayList<>(sizeOfArray);
    }

    /**
     * getUserData will ask the user to enter information, integers in this
     * case.
     */
    public void getUserData() {

        for (int i = 0; i < this.sizeOfArray; i++) {
            
            System.out.println("Please enter a number: ");
            
            while(!scan.hasNextInt()){
                System.out.println("Error, you've entered a something that is not a number \nPlease try again\nPlease enter a number: ");
                scan.next();
            
            }
            
            
    }

    /**
     * printArrayList will print the contents of the arraylist, toString will
     * likely be used here.
     */
    
    /**
     * toString will be used to print the generic if need be.
     *
     * @return
     */
    

    }
}

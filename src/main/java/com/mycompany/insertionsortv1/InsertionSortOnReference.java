/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.insertionsortv1;

import java.util.Scanner;

/**
 * this class will contain methods that perform insertion sort on an array
 * containing the integer reference type
 *
 * @author nicka
 */
public class InsertionSortOnReference {

    private Integer[] arrToBeSorted;//arrayList of type Integer
    private int sizeOfArr;//size of the array 
    public Scanner scan = new Scanner(System.in);

    /**
     * default constructor, initializes the size of the array, as well as the
     * array itself, to 0.
     */
    public InsertionSortOnReference() {

        this.sizeOfArr = 0;//initial size is 0
        this.arrToBeSorted = new Integer[sizeOfArr];//create the array, with 0 as its size

    }

    /**
     * constructor with default parameter, takes the size of the array as a
     * parameter, initializes the array to that size provided
     *
     * @param arrSize
     */
    public InsertionSortOnReference(int arrSize) {
        this.sizeOfArr = arrSize;//size is set to whatever is provided
        this.arrToBeSorted = new Integer[sizeOfArr];//initialize the array to whatever size is provided
    }

    /**
     * (Experiment) constructor with default parameter, takes the size of the
     * array as a parameter, as well as an array itself
     *
     * @param arrSize
     * @param arr
     */
    public InsertionSortOnReference(int arrSize, Integer[] arr) {
        this.sizeOfArr = arrSize;//size is set to whatever provided
        
        this.arrToBeSorted = arr;//set the array provided to the array created in this class?
    }

    /**
     * setArraySize sets the size of the array to whatever the size provided.
     * usually used with the default constructor
     *
     * @param arrSize
     */
    public void setArraySize(int arrSize) {
        this.sizeOfArr = arrSize;//set the size of the array to whatever value is provided
        this.arrToBeSorted = new Integer[sizeOfArr];//initialize the array to the size provided
    }

    /**
     * fillArray fills the array with whatever values are given by the user in
     * this case, Integers.
     */
    public void fillArray() {

        for (int i = 0; i < sizeOfArr; i++) {//for loop, for filling array, user enters numbers to fill
            System.out.println("Please enter a number: ");//prompt

            while (!scan.hasNextInt()) {//while loop used if a user enters something that is not a number, prompts the user until they enter a number
                System.out.println("Error, you've entered something that is not a number, please try again \nPlease enter a number: ");//error statement/prompt
                scan.next();//move to the next line in scan, so it can be checked for an error
            }

            Integer userNum = scan.nextInt();//get the integer from the console
            arrToBeSorted[i] = userNum;//add it to the array

        }

    }

    /**
     * sort will sort the array using insertion sort.
     */
    public void sort() {
        
        for(int j = 1; j < arrToBeSorted.length; j++){//for loop, enters the array
            Integer key = arrToBeSorted[j];//get the first element in the array, to compare later
            int i = j - 1;//get the position of the previous element, thats why start at 1
            
            while(i >=  0 && arrToBeSorted[i] > key){//if i is not 0 and i's data is bigger than key then swap
                arrToBeSorted[i+1] = arrToBeSorted[i];//move i to the next position in the array
                i -= 1;//decrement i
            }
            arrToBeSorted[i+1] = key;//now put key in the correct place
            
        }
        
        
        
    }

    @Override
    public String toString() {
        String str = "";
        
        for(int i = 0; i < arrToBeSorted.length; i++){
            str+= i + " : " + arrToBeSorted[i] + "\n";
        }
        
        
        return str;
    }

}

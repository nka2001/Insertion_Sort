package com.mycompany.insertionsortv1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * this class will perform insertion sort on an array of primitive integers
 *
 * @author nicka
 */
public class InsertionSortOnPrimitives {

    private int numOfInputs; //holds the size of the array, intially 0
    private int[] arrToBeSorted; //initially, the array is of size 0, so nothing currently
    public Scanner scan = new Scanner(System.in);

    /**
     * default constructor, initializes numOfInputs to 0, as well as intialize
     * the array
     */
    public InsertionSortOnPrimitives() {
        this.numOfInputs = 0; //inital size of the array is 0
        this.arrToBeSorted = new int[numOfInputs];//initialize the array to size 0

    }

    /**
     * constructor that takes a parameter, which is the size of the array
     *
     * @param numOfInputs
     */
    public InsertionSortOnPrimitives(int numOfInputs) {
        this.numOfInputs = numOfInputs; //sets the size of the array to whatever the user provided
        this.arrToBeSorted = new int[numOfInputs];//initalize the array to that size provided

    }

    /**
     * (Experiment) this constructor will take the size of the array, as well as
     * an array that is prefilled
     *
     * @param numOfInputs
     * @param arr
     */
    public InsertionSortOnPrimitives(int numOfInputs, int[] arr) {
        this.numOfInputs = numOfInputs;//set the size of the array to whatever size is provided
        this.arrToBeSorted = arr;//set the array in this class to the array provided

    }

    /**
     * inputSize takes the size of the array to be sorted
     *
     * @param sizeOfArray
     */
    public void inputSize(int sizeOfArray) {
        this.numOfInputs = sizeOfArray; //set the size of the array to whatever size is provided
        this.arrToBeSorted = new int[numOfInputs];//reinitialize the array to that size provided 
    }

    /**
     * fillArray() is used to fill the array will integers from the user this
     * method will check if the user has entered an something that is NOT a
     * number.
     */
    public void fillArray() {

        for (int i = 0; i < numOfInputs; i++) {//for loop for filling array
            System.out.println("Please enter a number: ");//prompt

            while (!scan.hasNextInt()) {//used for error checking, if the user enters something that is not a number
                System.out.println("Error, you've entered a something that is not a number \nPlease try again\nPlease enter a number: ");
                scan.next();//advance to the next line in the scanner
            }

            int userNum = scan.nextInt();//get the integer from the scanner

            arrToBeSorted[i] = userNum;//place it in the array

        }

    }

    /**
     * toString will return the contents of the array as a string
     */
    @Override
    public String toString() {
        String str = "";//string to be returned
        for (int i = 0; i < arrToBeSorted.length; i++) {//for loop to build the string
            str += i + " : " + arrToBeSorted[i] + "\n";//add the element and index to the output string
        }
        return str;//return the string 
    }

    /**
     * sort() performs insertion sort on the array that the user filled.
     */
    public void sort() {

        for (int j = 1; j < arrToBeSorted.length; j++) {//for loop for going through entire array
            int key = arrToBeSorted[j];//set a key to be moved later
            int i = j - 1;

            while (i >= 0 && arrToBeSorted[i] > key) {//while i is positive, as well as the current element is bigger than the key...
                arrToBeSorted[i + 1] = arrToBeSorted[i];//insert the current element at i, into the element at i + 1
                i = i - 1;
            }
            arrToBeSorted[i + 1] = key;//finally insert the key at the index i + 1

        }

    }

}

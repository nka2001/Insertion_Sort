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
        numOfInputs = 0;
        arrToBeSorted = new int[numOfInputs];

    }

    /**
     * constructor that takes a parameter, which is the size of the array
     *
     * @param numOfInputs
     */
    public InsertionSortOnPrimitives(int numOfInputs) {
        this.numOfInputs = numOfInputs;
        arrToBeSorted = new int[numOfInputs];

    }

    /**
     * inputSize takes the size of the array to be sorted
     *
     * @param sizeOfArray
     */
    public void inputSize(int sizeOfArray) {
        this.numOfInputs = sizeOfArray;
        this.arrToBeSorted = new int[numOfInputs];
    }

    /**
     * fillArray() is used to fill the array will integers from the user
     * this method will check if the user has entered an something that is NOT a number. 
     */
    public void fillArray() {

        for (int i = 0; i < numOfInputs; i++) {
            System.out.println("Please enter a number: ");

            while (!scan.hasNextInt()) {
                System.out.println("Error, you've entered a something that is not a number \nPlease try again\nPlease enter a number: ");
                scan.next();
            }

            int userNum = scan.nextInt();
            
            arrToBeSorted[i] = userNum;

        }

    }

    /**
     * printArray() will print the contents of the array
     */
    public void printArray() {

        for (int i = 0; i < arrToBeSorted.length; i++) {
            System.out.println(i + " : " + arrToBeSorted[i]);
        }

    }
    
    /**
     * sort() performs insertion sort on the array that the user filled. 
     */
    public void sort(){
        
        for(int j = 1; j < arrToBeSorted.length; j++){
            int key = arrToBeSorted[j];
            int i = j-1;
            
            while(i > 0 && arrToBeSorted[i] > key){
                arrToBeSorted[i + 1] = arrToBeSorted[i];
                i = i-1;
            }
            arrToBeSorted[i+1] = key;
            
            
            
            
        }
       
        
        
        
    }

}

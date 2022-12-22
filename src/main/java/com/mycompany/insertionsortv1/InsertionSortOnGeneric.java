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
public class InsertionSortOnGeneric<T extends Comparable<T>> {

    private int sizeOfList;//size of the list
    private List<T> listToBeSorted;//list type because of generic array creation
    public Scanner scan = new Scanner(System.in);

    /**
     * default constructor, sets the size of the array to 0, as well as
     * intializes the arraylist.
     */
    public InsertionSortOnGeneric() {
        this.sizeOfList = 0;//inital size of the list. 
        this.listToBeSorted = new ArrayList<>(sizeOfList);//create the list with a size of 0
    }

    /**
     * constructor with default parameter, in this case, sets the size of the
     * arraylist
     *
     * @param arrSize
     */
    public InsertionSortOnGeneric(int listSize) {
        this.sizeOfList = listSize;//set the size of the array list using the constructor
        this.listToBeSorted = new ArrayList<>(sizeOfList);//initialize the array to that specified size
    }

    /**
     * (Experiment) constructor with default parameters it takes the array size,
     * as well as an array as parameters, essentially takes a list and will
     * perform insertion sort on it
     *
     * @param arrSize
     * @param arr
     */
    public InsertionSortOnGeneric(int listSize, List<T> l) {
        this.sizeOfList = listSize;//set the arraysize 

        this.listToBeSorted = l;//set the array provided to the array created in this class
    }

    /**
     * setListSize takes one parameter, the size of the array, and initializes
     * the array to that size
     *
     * @param size
     */
    public void setListSize(int size) {
        this.sizeOfList = size;//set the size to the size provided by the user

    }

    /**
     * fillList will ask the user to enter information, integers in this case.
     */
    public void fillList() {

        for (int i = 0; i < this.sizeOfList; i++) {//start at the beginning of the list

            System.out.println("Please enter a number: ");

            while (!scan.hasNextInt()) {//used to check if the user entered an int or not
                System.out.println("Error, you've entered a something that is not a number \nPlease try again\nPlease enter a number: ");
                scan.next();//advance to the next line in the scanner

            }
            T element = (T) (Integer) scan.nextInt();//cast the int to an Integer, then cast to generic type T
            listToBeSorted.add(element);//add the item into the list

        }
    }

    /**
     * sort method will sort the list using insertion sort, note that since this
     * is on generics, we need comparable so I made it the parent class of T.
     */
    public void sort() {

        for (int j = 1; j < listToBeSorted.size(); j++) {//for loop to start going through the list
            T key = listToBeSorted.get(j);//create a key and get the element at j
            int i = j - 1;

            while (i >= 0 && listToBeSorted.get(i).compareTo(key) == 1) {//compare to is used since we are comparing type T
                T temp = listToBeSorted.get(i);//get the element at i, then
                listToBeSorted.set(i + 1, temp);//set it at i+1, these two lines are equivalent as: listToBeSorted[i+1] = listToBeSorted[i]

                i -= 1;
            }
            listToBeSorted.set(i + 1, key);//set the element i+1 equal to the key 
        }

    }

    /**
     * toString method used to print the contents of the list.
     *
     * @return
     */
    @Override
    public String toString() {
        String str = "";//string to be returned

        for (int i = 0; i < listToBeSorted.size(); i++) {
            str += i + " : " + listToBeSorted.get(i) + "\n";
        }
        return str;
    }

}

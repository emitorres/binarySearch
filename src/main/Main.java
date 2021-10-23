package main;

import main.utils.Utils;

public class Main {
    public static void main(String[] args) {
        int [] arreglo = new int []{1,4,3,2,5,30,41,8,50,80};
        int numberToFind = 2;
        int pos = Utils.binarySearch(arreglo, numberToFind);
        System.out.println("The number " + numberToFind +
                           " is in the " + pos + " position");
    }
}
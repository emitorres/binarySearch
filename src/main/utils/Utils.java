package main.utils;

import java.util.Arrays;

public final class Utils {

    private Utils(){}

    public static int binarySearch(int[] array, int number){
        sortArray(array);
        int start = 0;
        int end = array.length - 1;
        int pos;
        boolean find = true;

        while (find) {
            pos = (start + end) / 2;

            if ( array[pos] == number ){
                find = false;
                return pos;
            }
            else if ( array[pos] < number ) {
                start = pos + 1;
            } else {
                end = pos - 1;
            }
        }
        return 0;
    }

    private static void sortArray(int [] array){
        Arrays.sort(array);
    }
}
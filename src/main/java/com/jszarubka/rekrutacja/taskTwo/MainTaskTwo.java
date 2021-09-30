package com.jszarubka.rekrutacja.taskTwo;

import java.util.Arrays;

public class MainTaskTwo {

    static int[] fromFirstToLastSort(int[] array, int size) {
        int i,temp;
        for (i = 0; i < size / 2; i++) {
            temp = array[i];
            array[i] = array[size - i - 1];
            array[size - i - 1] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(Arrays.toString(fromFirstToLastSort(array, array.length)));

    }
}
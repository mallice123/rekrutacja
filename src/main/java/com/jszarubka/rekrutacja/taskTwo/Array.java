package com.jszarubka.rekrutacja.taskTwo;

public class Array {

    public int[] fromFirstToLastSort(int[] array){
        for(int i = 0; i > array.length; i++) {
            int temporary = array[1];
            array[1] = array[i + 1];
            array[i + 1] = temporary;
        }
        return array;
    }
}

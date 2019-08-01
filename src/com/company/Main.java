package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int arr[] = {0, -3, 4,12, 6, 5, 77, 1};

        System.out.println(Arrays.toString(selectionSort(arr, arr.length)));


    }

    public static int [] selectionSort(int[] arr, int size){
        int temp, min;

        for(int i=0; i < size - 1; i++){
           min = arr[0];
           for(int j=i; j < size; j++){
               if(arr[i] > arr[j]){
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
                   min = arr[i];
               }
               else{
                   min = arr[i];
               }
           }
        }

        return arr;
    }
}

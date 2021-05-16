package com.projects.lebed.introjava290321.task10.part2;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] x = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };
        System.out.println("Unsorted array");  //Output: Unsorted array
        System.out.println(Arrays.toString(x));//Output:[8, 0, 4, 7, 3, 7, 10, 12, -3]

        int low = 0;
        int high = x.length - 1;

        quickSort(x, low, high);
        System.out.println("Quick Sort result");//Output:Quick Sort result
        System.out.println(Arrays.toString(x)); //Output:[-3, 0, 3, 4, 7, 7, 8, 10, 12]
    }

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;//terminate execution if array length is 0

        if (low >= high)
            return;//terminate execution if array is sorted

        // choose the point of division
        int middle = low + (high - low) / 2;
        int pointOfDivision = array[middle];

        // split into subarrays which is larger and smaller than the point of division
        int i = low; 
        int j = high;
        while (i <= j) {
            while (array[i] < pointOfDivision) {
                i++;
            }

            while (array[j] > pointOfDivision) {
                j--;
            }

            if (i <= j) {//swap
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // call recursion to sort the left and right side
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
}



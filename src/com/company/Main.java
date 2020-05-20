package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// Write java code to find max in the array.

     int i,max,min,n,temp;

        int[] array ={1,2,-5,3,4};
        max=array[0];
        for (i=0;i<array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println("maximum is:"+ max);

        min=array[0];
        for (int j=0; j<array.length; j++) {
            if (array[j] < min)
                min = array[j];
        }
        System.out.println("minimum is: "+ min);

        //reverse
        n=array.length;
        for (int k=0;k<n/2;k++) {
            temp = array[k];
            array[k] = array[n - k - 1];
            array[n - k - 1] = temp;
        }
       // for (int l=0; l<n;l++)
           // System.out.println(array[l]);
        System.out.println(Arrays.toString(array));

    }
}

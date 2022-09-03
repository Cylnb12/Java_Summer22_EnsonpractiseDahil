package day06_practice;

import java.util.Arrays;

public class Q05_Arrays {
    public static void main(String[] args) {
        /*
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini bulun )
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */
        int[] input={2,6,4,5,8,9};


        int[] squre=new int[input.length];


        for (int i = 0; i < input.length; i++) {
            squre[i]=input[i]*input[i];
            System.out.print(input[i]*input[i]+" ");

        }
        System.out.println();
        System.out.println(Arrays.toString(squre));
    }
}

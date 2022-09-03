package day06_practice;

import java.util.Arrays;

public class Q09_Arrays {
    public static void main(String[] args) {
        /*
         * arr1 = { {0,2,-1}, {3,8,9}, {7} }  ve  arr2 = { {-7,6,-9}, {0,12}, {19} }  veriliyor.
         * Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.
         */

        int sum=0;

        int[][] arr1 = { {0,2,-1},{3,8,9},{7} };
        int[][] arr2 = { {-7,6,-9}, {0,12}, {19} };


        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                sum+=arr1[i][j];
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                sum+=arr2[i][j];
            }
        }
        System.out.println("===  arr1 ve arr2 sayilar toplami  === \n"+sum);


        int toplam=0;
        System.out.println(Arrays.deepToString(arr1)+Arrays.deepToString(arr2));





    }
}

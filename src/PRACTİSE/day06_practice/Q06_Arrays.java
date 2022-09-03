package day06_practice;

import java.util.Arrays;

public class Q06_Arrays {
    public static void main(String[] args) {
        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *

         */


        String input="HeySiri";
        String[] arr=input.split("");
        arr[0]="B";
        arr[1]="y";
        arr[2]="e";
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();

        String str="HeySiri";
        str=str.replace("hey","Bye");
        String[] arr1=new String[1];
        arr1[0]=str;
        System.out.println(Arrays.toString(arr));



    }
}

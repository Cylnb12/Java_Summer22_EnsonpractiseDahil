package day05_practice;

public class Q04_MetCreationForLoop {
    public static void main(String[] args) {


        /* Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called
		  reverseString */
        String str="Amman Java Ne Guzel";


        reverseString(str);

    }

    public static void reverseString(String str) {
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.substring(i,i+1));
        }
    }
}

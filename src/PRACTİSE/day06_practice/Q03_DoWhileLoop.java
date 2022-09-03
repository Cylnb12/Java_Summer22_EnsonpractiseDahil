package day06_practice;

import java.util.Scanner;

public class Q03_DoWhileLoop {
    public static void main(String[] args) {
        /*
    Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
    ve x girildiğinde ise "Program bitti" yazan programı yazınız.
    */

        Scanner scan=new Scanner(System.in);
        String input="";

        do {
            input=scan.next();
             if (input.equals("x")){
                 System.out.println("Program bitti");
             }else {
                 System.out.println("Program calisiyor");
             }


        }while (!input.equalsIgnoreCase("x"));


    }
}

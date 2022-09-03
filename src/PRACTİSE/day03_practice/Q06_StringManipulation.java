package day03_practice;

import java.util.Scanner;

public class Q06_StringManipulation {
    public static void main(String[] args) {


        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

        Scanner scan=new Scanner(System.in);
        String str1= scan.next();
        System.out.println();
        String str2= scan.next();

        System.out.println(str1+"  "+str2);

        str1 = str1.substring(1);
        str2= str2.substring(1);
        System.out.println(str1.concat(str2));


    }
}

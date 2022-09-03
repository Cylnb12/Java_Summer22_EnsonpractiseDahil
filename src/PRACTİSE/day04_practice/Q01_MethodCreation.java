package day04_practice;

import java.util.Scanner;

public class Q01_MethodCreation {
    public static void main(String[] args) {

        /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */
Scanner scan=new Scanner(System.in);
        String str1= scan.nextLine();
       icindeOlan(str1);

    }

    public static void icindeOlan(String str1) {
        String icerik="";
        for (int i = 0; i < str1.length(); i++) {
            if (icerik.contains(str1.substring(i,i+1))){

            }else {
                icerik+=str1.substring(i,i+1);
            }


        }
        System.out.println("her harften bi dene : "+icerik);
    }

}

package day04_practice;

import java.util.Scanner;

public class Q02_MethodCreation {
    public static void main(String[] args) {


       /*
        cm olarak verilen bir sayiyi, metre ve kilometreye
        donusturen bir method yaziniz
      */
        Scanner scan=new Scanner(System.in);
        float cm=scan.nextInt();


        cmDonusturucu(cm);





    }

    public static void cmDonusturucu(float cm) {
        float mt=cm/100;
        float km=mt/1000;

        System.out.println(cm+" cm = "+mt+" Metredir");
        System.out.println(cm+" cm = "+km+" Kilometredir");


    }

}

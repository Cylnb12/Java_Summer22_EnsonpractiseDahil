package day02_practice;

import java.util.Scanner;

public class Q07_BMISiniflama {
    public static void main(String[] args) {
/*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		 */

        Scanner scan=new Scanner(System.in);
        System.out.print("kilo  :  ");
        double kilo= scan.nextDouble();
        System.out.print("boy  :  ");
        double boy= scan.nextDouble()/100;
        double bmi= (int) (kilo/(boy*boy));

        if (bmi<=20){
            System.out.println("oldukca zayifsiniz  "+bmi);
        } else if (bmi<=25) {
            System.out.println(" normal sinirdasiniz  "+ bmi);

        } else if (bmi<=30) {
            System.out.println("sisman kategorisindesiniz  "+bmi);

        }else System.out.println("obez grubundasiniz  "+bmi);


    }

}


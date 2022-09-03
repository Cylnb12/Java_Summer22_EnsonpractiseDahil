package day02_practice;

import java.util.Scanner;

public class Q09_NestedIF {
    public static void main(String[] args) {
/*
    Kullanici dan yas bilgisini alarak
	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz
	 */
        Scanner scan=new Scanner(System.in);

        int age= scan.nextInt();
        if (age>=18) {
            System.out.println("oy kullanmaya uygun");
            if (age >= 70) {
                System.out.println("3 kez oy kullanabilir");
            } else if (age >= 50) {
                System.out.println("2 kez oy kullanabilir");

            } else if (age >= 18) {
                System.out.println("bir kez oy kullanabilir");

            }
        }else System.out.println("kullanamaz");
    }
}

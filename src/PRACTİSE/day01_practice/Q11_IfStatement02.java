package day01_practice;

import java.util.Scanner;

public class Q11_IfStatement02 {
    public static void main(String[] args) {
 /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>  0 ~ 59
     */

        Scanner scan=new Scanner(System.in);
        System.out.println("Degerini Ogrenmek Istediginiz Notu Giriniz : ");

        int x = scan.nextInt();

        if (x<60){
            System.out.println("F");
        } else if (x<70) {
            System.out.println("D");
        } else if (x<80) {
            System.out.println("C");
        } else if (x<90) {
            System.out.println("B");
        } else if (x<101) {
            System.out.println("A");
        }
    }
}

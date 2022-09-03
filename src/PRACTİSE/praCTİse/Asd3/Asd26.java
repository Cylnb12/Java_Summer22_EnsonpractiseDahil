package Asd3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Asd26 {
    public static void main(String[] args) {

//1 ile 7 arasında girilen bir tamsayı ile haftanın gününün adını gösteren bir Java kodu yazın.
//
//Test Data :
//3
//Beklenen Çıktı:
//Carsamba
//Test Data:
//1
//Beklenen Çıktı:
//Pazartesi

        Scanner in = new Scanner(System.in);
        int day = in.nextInt();

        switch (day) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
        }
        if (day==1) {
            System.out.println("Pazartesi");
        }
        else if (day==2 ) {
            System.out.println("Sali");
        }
        else if (day==3 ) {
            System.out.println("Carsamba");
        }
        else if (day==4 ) {
            System.out.println("Persembe");
        }
        else if (day==5 ) {
            System.out.println("Cuma");
        }
        else if (day==6 ) {
            System.out.println("Cumartesi");
        }
        else if (day==7 ) {
            System.out.println("Pazar");
        }




    }
}

package Asd3;

import java.util.Arrays;
import java.util.Scanner;

public class Asd24 {
    public static void main(String[] args) {


        //Soru 4- Kullanicidan bir array’in boyutunu ve
        // tum elementlerini alarak bir array olusturup,
        // bu array’i bize donduren bir method olusturun


        int[] a = intArrrayOlustur();
        System.out.println(Arrays.toString(a));


    }

    public static int[] intArrrayOlustur() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Kac haneli bir Array olusturmak istediginizi yazin");
        int kac= scan.nextInt();
        int[] kacTane=new int[kac];
        for (int i = 0; i < kac; i++) {

            System.out.println(i+". index i giriniz");
            kacTane[i]= scan.nextInt();

        }



        return kacTane;
    }
}

package Asd3;


import java.util.Arrays;
import java.util.Scanner;

public class Asd25 {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir array’in boyutunu ve
        // tum elementlerini alarak bir array olusturup,
        // bu array’i bize donduren bir method olusturun
        Scanner scan=new Scanner(System.in);
        int kacTane= scan.nextInt();
        String[] str=new String[kacTane];

        String[] a=StringArrayOlustur(str,kacTane);
        System.out.println(Arrays.toString(a));


}

    public static String[] StringArrayOlustur(String[] str, int kacTane) {
        Scanner scan=new Scanner(System.in);
        String[] x=new String[kacTane];


        for (int i = 0; i < kacTane; i++) {
            str[i]= scan.next();


        }


        return str;
    }
}
//private static String [] ArrayOlustur(int[] yeni, int kacTane) {
//    Scanner scan = new Scanner(System.in);
//    String[] x = new String[kacTane];
//
//    for (int i = 0; i < kacTane; i++) {
//        x[i] = scan.next();
//
//    }
//    return x;
//}
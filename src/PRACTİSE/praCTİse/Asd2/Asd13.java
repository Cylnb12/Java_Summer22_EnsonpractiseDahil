package Asd2;

import java.util.Scanner;

public class Asd13 {
    public static void main(String[] args) {
        //Kullanicidan baslangic ve bitis harflerini alin
        //ve baslangic harfinden baslayip bitis harfinde biten
        // tum harfleri buyuk harf olaral
        //ekrana yansitin.kullanicinin kata yapmadigini farzedin
        Scanner scan = new Scanner(System.in);
        System.out.println("ilk harfi giriniz");
        char ilkHarf = scan.next().toUpperCase().charAt(0);
        System.out.println("Son harfi giriniz");
        char sonHarf = scan.next().toUpperCase().charAt(0);


        System.out.println("Aralarindaki harfler");
        if (ilkHarf <= sonHarf) {
            while (ilkHarf <= sonHarf) {
                System.out.print(ilkHarf + " ");
                ilkHarf++;
            }
        } else {
            while (sonHarf <= ilkHarf) {
                System.out.print(sonHarf + " ");
                sonHarf++;
            }

        }
    }
}

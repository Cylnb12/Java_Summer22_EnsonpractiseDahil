package replit_Calismalari;

import java.util.Arrays;
import java.util.Scanner;

public class C08_Arrays {
    public static void main(String[] args) {
        //soru:kullanıcıdan bir arrayin boyutunu ve tum elemanlarını alarak yeni bir array donduren methot yazın

        int[] yeniArrays = arrayOlustur();
        System.out.println(Arrays.toString(yeniArrays));

    }

    public static int[] arrayOlustur() {
        Scanner scan = new Scanner(System.in);
        System.out.println("olusturacagınız arrayyin boyutunu giriniz: ");
        int[] array = new int[scan.nextInt()];
        for (int i = 0; i < array.length; i++) {
            Scanner scan1 = new Scanner(System.in);
            System.out.println("olusturacagınız arrayin " + (i+1) + " . elamanını giriniz");
            int eleman = scan.nextInt();
            array[i] = eleman;

        }
        return array;

    }
}




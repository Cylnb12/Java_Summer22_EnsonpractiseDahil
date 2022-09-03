package day20_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {


        int sayilar[] = new int[4];

        System.out.println(sayilar);//[I@19dfb72a
        // non primitive data turundeki datalari
        // her zaman direk yazdiramayabiliriz.
        //Array i yazdirmak icin Array class dan yardim isteriz

        System.out.println(Arrays.toString(sayilar));//[0, 0, 0]


        sayilar[2] = 10;
        sayilar[0] = 5;
        sayilar[1] = 3;

        System.out.println(sayilar);//[I@19dfb72a
        System.out.println(Arrays.toString(sayilar));//[5, 3, 10]

        String sinifList[]={"Ali","Ayse","Ahmet"};
        System.out.println(Arrays.toString(sinifList));//[Ali, Ayse, Ahmet]

        sinifList[1]="Hasan";
        System.out.println(Arrays.toString(sinifList));//[Ali, Hasan, Ahmet]

        System.out.println(sinifList[1]);//Hasan
        System.out.println(sinifList[0]);//Ali


    }
}

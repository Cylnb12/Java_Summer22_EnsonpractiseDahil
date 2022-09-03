package replit_Calismalari;

import java.util.Arrays;

public class C09_arrays {
    public static void main(String[] args) {
        //soru:verilen bir arraye yeni elaman ekleyen bir metod dondurun
        String[] sinifListesi ={"hasan","hamiye","ilyas","ayse","harun"};
        String eklenecekIsım="handan";
        String[] yeniSinifLİstesi=yeniListe(sinifListesi,eklenecekIsım);
        System.out.println(Arrays.toString(yeniSinifLİstesi));


    }

    public static String[] yeniListe(String[] sinifListesi, String eklenecekIsım) {
        String[]yeniListe=new String[sinifListesi.length+1];
        for (int i = 0; i < sinifListesi.length; i++) {
            yeniListe[i]=sinifListesi[i];
            yeniListe[yeniListe.length-1]=eklenecekIsım;

        }
        return yeniListe;



    }
}

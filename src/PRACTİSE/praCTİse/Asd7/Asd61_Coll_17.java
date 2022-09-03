package Asd7;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Asd61_Coll_17 {
    public static void main(String[] args) {


        //Ortak elemanları olan 2 farklı TreeSet oluşturalım ve
        // elemanlarını tektek karşılaştırıp aynı olanlar için "yes"  farklı olanlar için "no" yazdıralım.

        //1. TreeSet: mavi,yesil,kirmizi,sari

        //2. TreeSet: yesil,mavi,pembe,turuncu

        //Beklenen Çıktı:

        //1. TreeSet: [kirmizi,mavi,sari,yesil]

        //2. TreeSet: [mavi,pembe,turuncu,yesil

        //Karsilastirma Sonucu:

        //no

        //yes

        //no

        //yes
        Set<String > ts1=new TreeSet<>(Arrays.asList("mavi","yesil","kirmizi","sari"));
        Set<String > ts2=new TreeSet<>(Arrays.asList("yesil","mavi","pembe","turuncu"));
        System.out.println(ts1);
        System.out.println(ts2);
String sonuc="";
        for (String each1:ts1
             ) {
            for (String each2:ts2
                 ) {
                if (each1.equals(each2)){
                    sonuc="yes";
                    break;
                }else sonuc="no";
            }
            System.out.println(sonuc);
        }

    }
}

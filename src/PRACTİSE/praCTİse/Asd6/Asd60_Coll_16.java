package Asd6;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Asd60_Coll_16 {
    //Bir TreeSet oluşturalım ve Tree Listesini ve listedeki eleman sayısını yazdıran java kodunu yazdıralım.
    //
    //TreeSet elemanları: yesil,sari,mavi,kirmizi,pembe
    //
    //```
    //Beklenen Çıktı:
    //```
    //
    //```
    //Orjinal TreeSet: [kirmizi,mavi,pembe,sari,yesil]
    //```
    //
    //```
    //Tree eleman sayısı: 5




    public static void main(String[] args) {
        Set<String> ts=new TreeSet<>(Arrays.asList("yesil","sari","mavi","kirmizi","pembe"));

        System.out.println(ts);
        System.out.println(ts.size());
        System.out.println(ts.size()-1);

    }
}

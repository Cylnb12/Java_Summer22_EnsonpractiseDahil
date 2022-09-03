package Asd6;

import java.util.HashSet;
import java.util.ListIterator;
import java.util.TreeSet;

public class Asd55_Collections_11 {
    public static void main(String[] args) {
        //HashSet ile list oluşturalım ve  TreeSet ile sıralayalım ve listeyi yazdıralım.
        //HashSet List: sari,mavi,kirmizi,yesil,mor
        //Beklenen Çıktı:
        //TreeSet elements:
        //kirmizi
        //mavi
        //mor
        //sari
        //yesil


        HashSet hs1=new HashSet<>();
        hs1.add("sari");
        hs1.add("mavi");
        hs1.add("kirmizi");
        hs1.add("yesil");
        hs1.add("mor");
        TreeSet ts1=new TreeSet<>();
        ts1.addAll(hs1);
        System.out.println(ts1);


    }
}

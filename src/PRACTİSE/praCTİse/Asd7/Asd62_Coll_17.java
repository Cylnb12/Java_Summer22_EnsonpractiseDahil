package Asd7;

import java.util.*;

public class Asd62_Coll_17 {
    public static void main(String[] args) {
        //Bir Priority Queue  oluşruralım, elemanlarını ekleyim priority queue yazdıralım.
        //
        //priority queue elemanları: sari,yesil,mavi,kirmizi
        //
        //```
        //Beklenen Çıktı:
        //```
        //
        //```
        //Priority Queue elemanlari: [kirmizi, mavi, sari, yesil]
        //```

        Queue<String> que=new PriorityQueue<String >(Arrays.asList("sari","yesil","mavi","kirmizi"));

        Set<String> st=new TreeSet<>(que);
        System.out.println(st);


    }
}

package Asd6;

import java.util.Iterator;
import java.util.TreeSet;

public class Asd59_Collections_15 {
    public static void main(String[] args) {
        //Bir TreeSet oluşturalım ve ilk ve son elemanlarını yazdıralım.

        //TreeSet elemanları: sari,mavi,yesil,kirmizi,turuncu,pembe

        //Beklenen Çıktı:

        //Orjinal Tree: [kirmizi,mavi,pembe,sari,turuncu,yesil]

        //ilk elemen: kirmizi

        //son eleman: yesil

        TreeSet ts1=new TreeSet<>();
        ts1.add("kirmizi");
        ts1.add("mavi");
        ts1.add("pembe");
        ts1.add("sari");
        ts1.add("turuncu");
        ts1.add("yesil");

        System.out.println(ts1);

        Iterator li1=ts1.descendingIterator();
        System.out.println(li1.next());

        if (li1.hasNext()){

        }else System.out.println(li1.next());
    }
}

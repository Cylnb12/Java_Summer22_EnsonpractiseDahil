package Asd6;

import java.util.*;

public class Asd58_Collections_14 {
    public static void main(String[] args) {
        /*
        Bir TreeSet yapalım ve elemanlarını önce normal yazdıralım ve ardından  descendingIterator()  fonksiyonunu kullanarak ters sıradan yazdıralım.

TreeSet elemanları:  yesil,sari,mavi,turuncu,kirmizi

Beklenen Çıktı:

Orjinal Tree sonucu: [kirmizi,mavi,sari,turuncu,yesil]

Tersten Siralanisi:
yesil
turuncu
sari
mavi
kirmizi
         */
        TreeSet ts1 = new TreeSet<>();
        ts1.add("sari");
        ts1.add("mavi");
        ts1.add("yesil");
        ts1.add("kirmizi");
        ts1.add("turuncu");

        Iterator it = ts1.iterator();

        System.out.println(ts1);


        while (it.hasNext()) {
            it.next();
        }
        System.out.println();
        Iterator it1= ts1.descendingIterator();

        while (it1.hasNext()){
            System.out.println(it1.next());
        }



    }
}

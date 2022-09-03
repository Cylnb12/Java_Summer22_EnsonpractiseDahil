package Asd6;

import java.util.Collections;
import java.util.LinkedList;

public class Asd54_Collection_10 {
    public static void main(String[] args) {

        //Bir LinkedList oluşturalım ve ilk eleman ile 4. elemanı yerdeğiştiren java kodunu yazınız.
        //
        //LinkedList: mavi,kirmizi,beyaz,siyah,yesil,turuncu
        //
        //**hint:  Collections.swap();**
        //
        //```
        //Beklene Çıktı:
        //```
        //
        //```
        //Orjinal LinkedList: [mavi,kirmizi,beyaz,siyah,yesil,turuncu]
        //```
        //
        //```
        //Swap sonrası durum: [**siyah**,kirmizi,beyaz,**mavi**,yesil,turuncu]
        //```

        LinkedList ll1=new LinkedList();
        ll1.add("mavi");
        ll1.add("kirmizi");
        ll1.add("beyaz");
        ll1.add("siyah");
        ll1.add("yesil");
        ll1.add("turuncu");

        Collections.swap(ll1,0,3);
        System.out.println(ll1);
    }
}

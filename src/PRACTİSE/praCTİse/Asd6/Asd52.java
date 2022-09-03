package Asd6;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class Asd52 {
    /*
    Bir LinkedList oluşturalım ve ilk ve son elemanlarını iterator özelliğini kullanarak yazdıralım

    LinkedList: sari,mavi,turuncu,siyah,yesil,beyaz

    Beklenen Çıktı:
    Orjinal list elemanlari: [sari,mavi,turuncu,siyah,yesil,beyaz]
    Listenin ilk elemani: sari
    listenin son elemani: beyaz
         */

    public static void main(String[] args) {
        LinkedList ll1=new LinkedList<>(Arrays.asList("sari","mavi","turuncu","siyah","yesil","beyaz"));
        ListIterator lt1=ll1.listIterator();

        System.out.println("First Element = "+lt1.next());
        while (lt1.hasNext()){
            lt1.next();
        }
        System.out.println("Last Element = "+lt1.previous());
    }
}

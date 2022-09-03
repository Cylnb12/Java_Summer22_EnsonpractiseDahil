package Asd6;

import java.util.LinkedList;
import java.util.ListIterator;

public class Asd53_Collection_9 {
    public static void main(String[] args) {

/*
collection 9
 */
        LinkedList ll1=new LinkedList();
        ll1.add("sari");
        ll1.add("mavi");
        ll1.add("yesil");
        ll1.add("kirmizi");
        ll1.add("beyaz");
        ll1.add("mor");

        ListIterator lt1=ll1.listIterator(ll1.size());
        while(lt1.hasPrevious()) {
            System.out.print(lt1.previous());
        }
    }
}

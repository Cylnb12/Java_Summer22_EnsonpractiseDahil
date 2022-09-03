package Asd5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Asd50 {
    public static void main(String[] args) {
        //Soru 4) Bir listedeki elementleri iterator kullanarak sondan basa dogru yazdirin
        // Soru 5)
        // (iterator ile index kullanimina ornek) Bir listedeki ilk n elemani iterator kullanarak 5 artirin
        // . Orn : list : [2,13,56,23,45,14,40] artirilmasi istenen eleman sayisi : 3 output: [7,18,61,23,45,14,40]

        List<Integer> list1=new ArrayList<>(Arrays.asList(2,13,56,23,45,14,40));
        ListIterator itr1= list1.listIterator();
        while (itr1.hasNext()){
            itr1.next();
        }
        int sayi;
        System.out.println("List in sondan basa yazdirimi");
        while (itr1.hasPrevious()){
            sayi= (int)itr1.previous();
            System.out.print(" "+sayi);
        }

        System.out.println();
        Integer sayisi;
        ListIterator itr2= list1.listIterator();
        while (itr2.hasNext()){

            itr2.set((Integer) itr2.next()+5);
        }
        System.out.println("Artirim sonrasi list : "+list1);


        System.out.println("==================================\n 2. cozum" +
                " listeye");
          /*
     Soru 4) Bir listedeki elementleri iterator kullanarak sondan basa dogru yazdirin
     */

            List<String> names = new ArrayList<>(Arrays.asList("Ali","Fatma","Ayse","Salih","Esma","Hamza"));
            ListIterator<String> lit1=names.listIterator(names.size());
            while(lit1.hasPrevious()) {
                System.out.print((String) lit1.previous()+" ");
            }
    }
}

package Asd5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Asd51 {
    public static void main(String[] args) {


        //Soru 5)
        // (iterator ile index kullanimina ornek) Bir listedeki ilk n elemani iterator kullanarak 5 artirin
        // . Orn : list : [2,13,56,23,45,14,40] artirilmasi istenen eleman sayisi : 3 output: [7,18,61,23,45,14,40]


        List<Integer> list=new ArrayList<>(Arrays.asList(2,13,56,23,45,14,40));


        ListIterator irt1= list.listIterator(3);
        while (irt1.hasPrevious()){
            irt1.set((int)irt1.previous()+5);
        }
        System.out.println(list);

         /*
      (iterator ile index kullanimina ornek) Bir listedeki ilk n elemani iterator kullanarak 5 artirin.
       Orn : list : [2,13,56,23,45,14,40] artirilmasi istenen eleman sayisi : 3 output: [7,18,61,23,45,14,40]
       */
        System.out.println("===========================================\n2.cozum");
        List<Integer> list1=new ArrayList<>(Arrays.asList(2,13,56,23,45,14,40));
        ListIterator lt1=list.listIterator();
        int adet=3;
        int temp=0;
        while(lt1.nextIndex()<adet){
            temp=(Integer)lt1.next()+5;//lit1.set((Integer)lt1.next()+5);
            lt1.set(temp);
        }
        System.out.println(" 5 eklendikten sonra ki hali : "+list);
    }




}


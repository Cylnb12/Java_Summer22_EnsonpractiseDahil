package Asd5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Asd49 {
    //Bir listedeki istenen sayi araliginda
    // olmayan elementleri silen bir program yaziniz …
    // (2. liste olusturmadan, gecerli liste uzerinde islem yapiniz)
    // Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil) output: [23,40]

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(2,13,56,45,14,40,23));
        System.out.println("islem oncesi list : "+list);

        ListIterator itr1= list.listIterator();
        int islem;
        while (itr1.hasNext()){
           islem =(int)itr1.next();
            if (islem<20||islem>40){
                itr1.remove();
            }
        }
        System.out.println("islem sonrasi listr : "+list);
    }


}

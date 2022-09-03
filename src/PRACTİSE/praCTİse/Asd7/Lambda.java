package Asd7;

import java.util.ArrayList;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        //1)Ardışık list elementlerini aynı satırda
        // aralarında boşluk bırakarak yazdıran bir method oluşturun.

        //2)Ardışık çift list elementlerini aynı satırda
        // aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

        //3) Ardışık tek list elementlerinin karelerini
        // aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

        //4) Ardışık tek list elementlerinin küplerini tekrarsız
        // olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.

        //5) Tekrarsız çift elementlerin karelerinin toplamını hesaplayan bir method oluşturun


        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);//[8, 9, 131, 10, 9, 10, 2, 8]

        liste.stream().forEach(t-> System.out.print(t+" "));//8 9 131 10 9 10 2 8
        System.out.println();
        liste.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));//8 10 10 2 8
        System.out.println();
        liste.stream().filter(t->t%2!=0).map(t->(t*t)).forEach(t-> System.out.print(t+" "));//81 17161 81
        System.out.println();
        liste.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));//729 2248091
        System.out.println();
        Integer ciftKareToplam=liste.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);
        System.out.println(ciftKareToplam);//168



    }
}

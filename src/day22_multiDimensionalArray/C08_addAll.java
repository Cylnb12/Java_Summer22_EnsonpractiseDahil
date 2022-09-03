package day22_multiDimensionalArray;

import java.util.ArrayList;
import java.util.List;

public class C08_addAll {

    public static void main(String[] args) {

        List<Integer> sayilar1=new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);

        List<Integer> sayilar2=new ArrayList<>();
        sayilar2.add(10);
        sayilar2.add(15);
        sayilar2.add(16);
        sayilar2.add(20);

        sayilar1.addAll(sayilar2);//[5, 3, 2, 10, 15, 16, 20]

        System.out.println(sayilar1);
        System.out.println(sayilar1.addAll(1,sayilar2));
        System.out.println(sayilar1);//[5, 10, 15, 16, 20, 3, 2, 10, 15, 16, 20]

        // bir List in sonuna yada istedigimiz bir index ine
        // baska bir collection ekleyebiliyoruz
        System.out.println(sayilar1.size());



    }
}

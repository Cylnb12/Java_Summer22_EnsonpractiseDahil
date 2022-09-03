package day08_practice;

import java.util.ArrayList;
import java.util.List;

public class Q03_ArrayList_EnBuyukSayi_Hoca {
    public static void main(String[] args) {
        int[] arr1 = {15, 2, 15, 3, 11, 4, 5, 9, 6, 7, 15, 8};
        int n=4;
        List<Integer> list=new ArrayList<>();
        for (int each:arr1
             ) {
            list.add(each);
        }
        List<Integer> maxList=new ArrayList<>();
        int count=1;
        while (count<=n){
            int max=list.get(0);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i)>max&&!(maxList.contains(list.get(i)))){
                    max=list.get(i);
                }
            }
            maxList.add(max);
            list.remove(list.indexOf(max));
            count++;
        }
        System.out.println("listenin max "+n+" elemani"+maxList);

    }
}

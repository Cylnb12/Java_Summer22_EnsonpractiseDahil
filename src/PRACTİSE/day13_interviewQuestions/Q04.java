package day13_interviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04 {
    //fibonacci

    public static void main(String[] args) {
        List<Integer> fibonacciList=new ArrayList<>();
        Scanner scan=new Scanner(System.in);

        System.out.println("bir sayi giriniz");

        int sayi=scan.nextInt();
        fibonacciList.add(0);
        fibonacciList.add(1);


        int i =1;
        if (sayi<=1){
            System.out.println("daha buyuk bir sayi gir");
        }else {

            while (fibonacciList.get(i)<=sayi){// fibonacci elemanlari sayidan kucuk oldugu surece

                fibonacciList.add(fibonacciList.get(i)+fibonacciList.get(i-1));

                i++;
            }

        }
        if (fibonacciList.get(i)>sayi){
            fibonacciList.remove(i);
        }

        System.out.println("Fibonacci sayilari ="+fibonacciList);
    }

}

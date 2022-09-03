package Asd2;

public class Asd18_DoWhileLoop {
    public static void main(String[] args) {

//9 dan 190 a kadar 7 nin kati olan sayilari yazdirin
        int sayi=9;

        do {
            if (sayi%7==0){
                System.out.print(sayi+ " ");
            }
            sayi++;

        }while(sayi<190);


        // m harfindan c harfine kadar tum harfleri yazdirin

        System.out.println("");
        char input='m';


        do {
            System.out.print((input+"  ").toUpperCase());
            input--;

        }while (input>='c');

    }
}

package day17_nestedLoop;

public class C02_NestedForLoop {
    public static void main(String[] args) {
        //verilen sayiya gore carpim tablosu olsuturun
        /*
        input 3
        123
        246
        369
         */

        int input=5;
        for (int i = 1; i <=input ; i++) {

            for (int j = 1; j <=input ; j++) {

                System.out.print(i*j+ " ");

            }
            System.out.println();

        }
    }
}

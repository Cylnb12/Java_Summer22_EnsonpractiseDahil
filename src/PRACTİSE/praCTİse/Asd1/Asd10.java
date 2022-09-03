package Asd1;

public class Asd10 {
    public static void main(String[] args) {

        //While loop kullanarak 3 ten 13 e kadar tum tek tam sayilari ekrana yazdirin

        int bas=3;
        int bit=13;

        while (bas<=bit){
            if (bas%2!=0) {
                System.out.print(bas + " ");
            }
            bas++;

        }
    }
}

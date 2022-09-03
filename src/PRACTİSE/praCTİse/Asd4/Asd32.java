package Asd4;

public class Asd32 {
    public static void main(String[] args) {


        //5 satırlık paskal üçgenini yazdıran Java kodunu yazınız.
        //
        //Beklenen Çıktı:
        //      1
        //     1 1
        //    1 2 1
        //   1 3 3 1
        //  1 4 6 4 1

        int kacSatir = 5;
        int yarisi = kacSatir / 2 + 1;
        int count=1;

        for (int i = 0; i <kacSatir; i++) {
            for (int j = yarisi+1-i; j >=0; j--) {
                System.out.print(" ");
            }
            count=1;
            for (int j = 0; j <=i; j++) {
                System.out.print(count+" ");
                count = count * (i - j) / (j + 1);

            }
            System.out.println();
        }
    }
}

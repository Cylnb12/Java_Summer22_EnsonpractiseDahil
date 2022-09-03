package replitCalismalari;

public class C14_whileSoru {
    public static void main(String[] args) {
        //soru:100'den 0'a kadar çift sayıları yazdırın, ancak decrement(i--) kullanmayın.
        //
        //OUTPUT : 100 98 96 94 92 … … … … 2 0
        int baslangic = 100;
        int temp = baslangic;
        int bitis = 0;
        while (temp>=bitis) {
            if (temp % 2 == 0) {
                System.out.print(temp+" ");

            }
            temp--;
        }


    }
}

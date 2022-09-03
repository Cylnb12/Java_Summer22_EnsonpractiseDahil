package replit_Calismalari;

public class C13_faktoriyel {
    public static void main(String[] args) {
        //soru:Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.
        //
        //Input : 6
        //
        //Output: 6!=65432*1=720

        int input = 6;
        int faktoriyelSonuc = 1;

        for (int i = 1; i <= input; i++) {
            faktoriyelSonuc *= i;


        }
        String yazilim ="";
        for (int i = input-1; i >0; i--) {
            yazilim += "*"+i;

        }

        System.out.println(input + "!="+input + yazilim +"=" + faktoriyelSonuc);

    }
}



package Asd1;

public class Asd3_Polindrome {
    public static void main(String[] args) {
//verilen stringin polindrrome olup olmadigini kontrol ediniz


        String yazi="yay";
        String sonyazi="";

        for (int i = yazi.length()-1; i >=0 ; i--) {
            sonyazi+=yazi.charAt(i);

        }
        if (yazi.equals(sonyazi)){
            System.out.println("bu sayi polindrome dur  "+sonyazi);
        }else System.out.println("bu sayi polindrome degildir");
    }
}

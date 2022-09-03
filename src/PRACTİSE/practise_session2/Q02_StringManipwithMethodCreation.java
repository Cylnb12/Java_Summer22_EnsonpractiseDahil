package practise_session2;

import java.util.Scanner;

public class Q02_StringManipwithMethodCreation {
    public static void main(String[] args) {
        /*
         * girilen String icinde "xyz" dizimi var ise true degilse
         * false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */
        boolean xyzliMi=xyzliMi();




    }

    public static boolean xyzliMi() {
        Scanner scan=new Scanner(System.in);
        String input=scan.next();

        System.out.println(input.contains("xyz")?"true":"false");
        return false;
    }
}

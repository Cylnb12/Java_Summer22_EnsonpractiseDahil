package practise_session2;

import java.util.Scanner;

public class Q06_StringManipulastion {
    public static void main(String[] args) {
        // Kullanicidan alacaginiz bir stringde bosluk karakterinin
        // olup olmadigini kontrol ediniz.
        // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();
        System.out.println(input.isEmpty()?"evet bu input bos":input.contains(" ")?
                "input bosluk iceriyor":"input bosluk icermiyor");

    }
}

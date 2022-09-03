package day06_practice;

import java.util.Scanner;

public class Q04_DoWhileLoop {
    public static void main(String[] args) {
        /*
		Ask user to enter a word. If the word has odd number of characters
		 and has 3 or more characters,
		 print the character in the middle of the word.
		 the word has even number of character print "You entered wrong word."
		     INPUT      :   celik
		     OUTPUT 	:   l
		     INPUT      :   elif
		     OUTPUT 	:   You entered wrong word.*/
        Scanner scan=new Scanner(System.in);
        String input="";
        do {
            input=scan.next();
            if (input.length()>2&&input.length()%2!=0){
                System.out.println(input.charAt(input.length()/2));
            }else {
                System.out.println("you entered wrong word.");
            }
        }while (!input.equals("orcan"));
    }
}

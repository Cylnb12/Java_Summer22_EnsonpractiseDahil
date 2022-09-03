package day01_practice;

import java.util.Scanner;

public class Q12_IfStatement03 {
    public static void main(String[] args) {
	/*
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
        test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
       */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen is Unvaninizi giriniz");
        String jobTitle = scan.nextLine().toUpperCase();

        if (jobTitle.equals("QA") ) {
            System.out.println("Quality Analyst");
        } else if (jobTitle.equals("DEV")){
            System.out.println("Developer");

        } else if (jobTitle.equals("BA")) {
            System.out.println("Business Analyst");
        } else if (jobTitle.equals("PM") ) {
            System.out.println("Project Manager");

        } else {
            System.out.println(jobTitle);
        }


        switch (jobTitle){
            case "QA":
                System.out.println("Quality Analyst");
                break;
            case "PM":
                System.out.println("Project Manager");
                break;
            case "Dev":
                System.out.println("Developer");
                break;
            case "BA":
                System.out.println("Business Analyst");
                break;
            default:
                System.out.println(jobTitle);
                break;

        }


    }
}

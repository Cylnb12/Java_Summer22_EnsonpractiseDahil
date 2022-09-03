package day08_practice;

public class Q09_SurviveMonkey {
    /*
		There is a lonely monkey in the island
		He needs to eat 4 bananas every day
		there are just 165 bananas in that island
		Create following variables and find how many days
		monkey can survive.
		Use do while loop, increment and decrement and if statements
		int numberOfBananas =165, survivalDays = 1;
		boolean monkeyAlive = true;
		*/

    public static void main(String[] args) {
        int num=0;
        int day=0;

        while (num<=165) {
            day++;
            num += 4;
        }
        System.out.println("day = " + day);



    }

}


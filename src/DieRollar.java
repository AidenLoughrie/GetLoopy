import java.util.Random;
import java.util.Scanner;

public class DieRollar {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random random=new Random();
        String answer;

        do {
            int roll = random.nextInt(6) + 1;
            int roll2 = random.nextInt(6) + 1;
            int roll3 = random.nextInt(6) + 1;

            System.out.println("Your number for Die 1 is: " + roll);
            System.out.println("Your number for die 2 is: " + roll2);
            System.out.println("Your number for Die 3 is: " + roll3);

            int sum = roll + roll2 + roll3;
            System.out.println("The sum of the die is: " + sum);
        System.out.print("Do you want to roll again? (Yes/No)");
        answer = sc.next();
        }while (answer.equalsIgnoreCase("Yes"));
        System.out.println("Thanks for playing!");
        sc.close();


    }


}

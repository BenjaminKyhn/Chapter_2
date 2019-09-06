import java.util.Scanner;

public class Exercise222 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //receive the amount
        System.out.print("Enter an amount in int, for example if the amount is $11,56, enter 1156: ");
        int amount = input.nextInt();

        double amountDisplayed = amount / 100.0;
        int remainingAmount = amount;

        //Find the number of dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        //Find the amount of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        //Find the amount of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        //Find the amount of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        //Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        //Display results
        System.out.println("Your amount " + amountDisplayed + " consists of");
        System.out.println(" " + numberOfOneDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");
    }
}

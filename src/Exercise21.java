import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a double for miles:");

        double miles = input.nextDouble();
        double kilometers = miles * 1.6;

        System.out.println(miles + " miles is " + kilometers + " kilometers");
    }
}

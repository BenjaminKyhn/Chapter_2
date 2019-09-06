import java.util.Scanner;

public class Exercise214 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double weightPounds = input.nextDouble();
        double weightKilos = weightPounds * 0.45359237;

        System.out.println("Enter height in inches: ");
        double heightInches = input.nextDouble();
        double heightMeters = heightInches * 0.0254;

        double bmi = weightKilos / (Math.pow(heightMeters, 2));

        System.out.println("BMI is: " + bmi);
    }
}

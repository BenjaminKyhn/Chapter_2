import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for square meters: ");

        double squareMeters = input.nextDouble();
        double ping = squareMeters * 0.3025;

        System.out.println(squareMeters + " square meters are " + ping + " ping");
    }
}

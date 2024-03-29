import java.util.Scanner;

public class Exercise217 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in fahrenheit between -58F and 41F:");
        double temperature = input.nextDouble();

        System.out.println("Enter the wind speed (>=2) in miles per hour:");
        double windSpeed = input.nextDouble();

        double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);

        System.out.println("The wind chill index is: " + windChill);
    }
}

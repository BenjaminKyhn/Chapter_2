import java.util.Scanner;

public class Exercise216 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the side in a hexagon:");
        double side = input.nextDouble();

        double area = (3 * Math.pow(3, 0.5)) / 2 * Math.pow(side, 2);

        System.out.println("The area of the hexagon is: " + area);
    }
}

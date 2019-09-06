import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input a double for the sides of an equilateral triangle:");
        double length = input.nextDouble();
        double area = Math.pow(3, 0.5) / 4 * Math.pow(length, 2);
        double volume = area * length;

        System.out.println("The area of an equilateral triangle with the sides of " + length + " is " + area +
                " and the volume of the triangular prism is " + volume);
    }
}

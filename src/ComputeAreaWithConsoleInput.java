import java.util.Scanner; // scanner is in the java.util package

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args){
        // create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        if (radius < 0) {
            System.out.println("Incorrect input");
        }
        else {
            double area = radius * radius * 3.14159;
            System.out.println("Area is " + area);
        }
}
}
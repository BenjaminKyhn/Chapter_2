import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal and gratuity rate: ");

        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        double gratuity = subtotal * gratuityRate / 100;
        double total = subtotal + gratuity;

        System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
    }
}

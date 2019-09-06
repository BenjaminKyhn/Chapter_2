import java.util.Scanner;

public class Exercise27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");

        int minutes = input.nextInt();
        double years = minutes / 60.0 / 24 / 365;
        double days = minutes / 60.0 / 24 % 365;


        System.out.println(minutes + " minutes is approximately " + (int)years + " years and " + (int)days + " days");

    }
}

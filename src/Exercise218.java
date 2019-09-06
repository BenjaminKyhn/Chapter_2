public class Exercise218 {
    public static void main(String[] args) {
        int a1 = 0;
        int a2 = 0;
        int b1 = 2;
        int b2 = 1;
        double middlePoint1 = (a1 + b1) / 2.0;
        double middlePoint2 = (a2 + b2) / 2.0;

        System.out.println("  a         b      Middle Point");
        System.out.println("(" + a1++ + "," + a2++ + ")     " + "(" + b1++ + "," + b2++ + ")     " + "(" + middlePoint1 + ", " + middlePoint2 + ")");
        System.out.println("(" + a1 + "," + a2 + ")     " + "(" + b1 + "," + b2 + ")     " + "(" + middlePoint1 + ", " + middlePoint2 + ")");
    }
}

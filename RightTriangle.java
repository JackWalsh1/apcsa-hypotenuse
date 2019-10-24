import java.lang.Math;
import java.util.Scanner;

public class RightTriangle {

    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("\nEnter base: ");
        double base = in.nextDouble();
        System.out.print("Enter height: ");
        double height = in.nextDouble();
        System.out.print("Enter hypotenuse: ");
        double hypotenuse = in.nextDouble();

        if (Math.hypot(base, height) == hypotenuse) {
            System.out.println("\nYes, that's a right triangle!");
        } else {
            System.out.println("\nNope...not a right triangle.");
        }

        in.close();
    }

}
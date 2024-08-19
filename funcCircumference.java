import java.util.*;

public class funcCircumference {
    public static void circumferenceCircle(int num) {
        double circumference;
        double PI = 3.14;

        circumference = 2 * PI * num;
        System.out.println("The Circumference Of Circle is: " + circumference);
    }

    public static void main(String[] args) {
        int radius;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Radius Of Circle: ");
        radius = sc.nextInt();

        circumferenceCircle(radius);
    }
}
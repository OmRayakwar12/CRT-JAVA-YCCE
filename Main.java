import java.util.Scanner;

public class Main {
    public static void main(StringOm[] args) {
        Scanner scanner = new Scanner(System.in);

        double m1 = scanner.nextDouble();
        double m2 = scanner.nextDouble();
        double m3 = scanner.nextDouble();

        double total = m1 + m2 + m3;
        double percentage = (total / 300) * 100;

        if (m1 >= 35 && m2 >= 35 && m3 >= 35) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }

        System.out.println(total);
        System.out.println(percentage);

        if (percentage >= 60) {
            System.out.println("eligible for placement");
        } else {
            System.out.println("not eligible for placement");
        }

        scanner.close();
    }
}
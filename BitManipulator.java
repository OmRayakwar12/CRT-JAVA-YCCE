public class BitManipulator {
    public static void main(String[] args) {
        int a = 10;

        System.out.println("Decimal: " + a);
        System.out.println("Hexadecimal: " + Integer.toHexString(a));
        System.out.println("Octal: " + Integer.toOctalString(a));

        a = 200;
        System.out.println("_");
        System.out.printf("%8d%n", a);
        System.out.printf("%5d%6d%n", a, a);
        System.out.printf("%3d%10d%n", a, a);
        
        double pi = 3.14159265358979;

        System.out.println(pi);
        System.out.printf("%.3f%n", pi);
        System.out.printf("%.2f%n", pi);
    }
}

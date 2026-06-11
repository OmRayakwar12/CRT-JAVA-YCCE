import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int i : arr) {
            System.out.println(i);
        }
        
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            j = i;
        }
        System.out.println(arr[j]);

        String name[] = new String[5];
        for (int i = 0; i < name.length; i++) {
            name[i] = sc.next();
        }
        
        for (String string : name) {
            System.out.println(string);
        }
        
        sc.close();
    }
}

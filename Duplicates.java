import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            boolean isduplicate = false;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    isduplicate = true;
                    break;
                }
            }

            if(!isduplicate){
                System.out.println(arr[i]+" ");
            }
        }
    }
}

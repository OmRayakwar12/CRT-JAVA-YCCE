import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int n = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("original array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("Reverse array");
        for(int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }*/

        /*int sum = 0;
        for (int i = 0; i < arr.length; i++) {
           sum += arr[i];
        }
        System.out.println();
        System.out.println(sum);*/
        
        /*int even = 0, odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Even no. are "+even);
        System.out.println("odd numbers are "+odd );

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(max+" "+min);
        int slargest = 0;
        for (int i = 0; i < arr.length; i++) {
            
        }*/
        /* que: maximum consecutive one  */
        /* que:-remove dupliacated from unsorted array */
        
        /*for (int i = 0; i < arr.length; i++) {
            boolean isduplicate = true;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] ==  arr[j]){
                    isduplicate = false;
                    break;
                }
            }
            if(!isduplicate){
                System.out.println(arr[i]);
            }
        }*/

        int[][] arr1 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int index = 0; index < 3; index++) {
                arr1[i][index] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(i+" "+j);
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}

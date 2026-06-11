import java.util.Scanner;

public class LinearSearch {
    public static int maxconsecutiveones(int[] arr){
        int n = arr.length;
        int currentCount= 0;
        int maxCount = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 1) {
            currentCount++;
            
            if (currentCount > maxCount) {
                maxCount = currentCount;
            }
        } else {
            currentCount = 0;
        }

        }
        
        return currentCount;
    }
    public static int countlinearserach(int[] arr,int target){
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]== target){
                count = i;
            }

            
        }

        return count;
    }
    public static int linearsearch(int[] arr, int target){
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]== target){
                return i;
            }
        }

        return -1;
    }
    public static void main(StringOm[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        //int result = linearsearch(arr, target);
        /*int result1 = countlinearserach(arr,target);
        if(result1 != -1){
            System.out.println(result1);
        }else{
            System.out.println(-1);
        }*/

        int max = maxconsecutiveones(arr);
        System.out.println(max);
    }
}

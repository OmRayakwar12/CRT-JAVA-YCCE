import java.util.Arrays;

public class CollectionFrameWork {

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int binarySearch(int[] arr, int target) {
        return Arrays.binarySearch(arr, target);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 5};
        
        System.out.println("Array before sorting:");
        display(arr);
        System.out.println();

        Arrays.sort(arr);
        
        System.out.println("Array after sorting:");
        display(arr);
        System.out.println();

        int target = 4;
        int targetIndex = binarySearch(arr, target);
        System.out.println("Index of element " + target + " (via Binary Search): " + targetIndex);
        System.out.println();
        
        System.out.println(Arrays.toString(arr));
    }
}

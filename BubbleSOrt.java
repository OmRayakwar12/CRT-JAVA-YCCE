import java.util.Arrays;

public class BubbleSOrt {
    public static void bubblesort(int[] arr){
        int  n = arr.length;
        for(int i = 0 ; i< n-1;i++){
            for(int j = 0;j <n-i-1;j++){
                /*
                last i elements are aleready at correct 
                sorted position so no need to check them
                */
               if(arr[j]>arr[j+1]){
                    // swap- a[j],a[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
               }
            }
        }
    }
    public static void main(String[] args) {
        int[] a = { 2,1,3,4,5};
        //optimizedBubbleSort(a);
        bubblesort(a);
        System.out.println(Arrays.toString(a));
    }
}

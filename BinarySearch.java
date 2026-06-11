public class BinarySearch {
    public static int binarysearch(int[] arr , int n , int target){
        int left = 0 ;
        int right = n-1;
        while (left<= right) {
            int mid = (left+right)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
            
        }
        return -1;
    }
    public static void main(StringOm[] args) {
    int[] arr = {10,20,30,40,50,60,70};
    int n = arr.length;
    int target = 50;
    int result = binarysearch(arr,n,target);
    if(result != -1){
        System.out.println("Element found at index : "+result);
    }else{
        System.out.println("Element not found");
    }
    }   
}

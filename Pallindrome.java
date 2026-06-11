public class Pallindrome {
    public static boolean ispallindrome(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            if(arr[left]!= arr[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(StringOm[] args) {
        int[] arr = {1,2,3,2,1,4};
        boolean result = ispallindrome(arr);
        System.out.println(result);
    }
}

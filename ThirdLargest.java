public class ThirdLargest {
    public static void main(StringOm[] args) {
        int[] arr = {3,-2,7,-1,0,5,-4};
        int pos = 0 ;
        int neg = 0 ;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 0){
                pos++;
            }else{
                neg++;
            }
        }
        System.out.println(pos+" "+neg);
    }
}

import java.util.HashSet;
import java.util.Set;

public class Recursion {
    public static int factorial(int n){
        int ans = 1;
        if(n==0 || n==1){
            return 1;
        }else{
            ans = n*factorial(n-1);
        }
        return ans;
    }
    public static void primeNumber(int n){
        if(n==0){
            return ;
        }
        primeNumber(n-1);
        System.out.println(n);;
   }

   public static void printReverse(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printReverse(n-1);
   }

   public static void reverseString(String str,int index){
        if(index<0){
            return;
        }

        reverseString(str, index-1);
        System.out.print(str.charAt(index));
   }

   public static boolean pallidromString(String str,int left, int right){
        if(left>=right){
            return true;
        }
        if(str.charAt(left) != str.charAt(right)){
            return false;
        }

        return pallidromString(str, left+1, right-1);

        
   }
    public static int power(int base , int exp){
        if(exp==0){
            return 1;
        }
        return base*power(base,exp-1);
    }
    public static void main(String[] args) {
        int n = 2;
        //primeNumber(n);
        //printReverse(n);
        /*int ans =factorial(n);
        System.out.println(ans);
        String str = "madam";
        //reverseString(str);
        /*reverseString(str, 4);
        System.out.println();
        System.out.println(power(2,5));*/
        //System.out.println(pallidromString(str, 0,4)); 
        String str = "aabbvvsjjdja";
        Set<Character> union = new HashSet<>();
        for (char ch : str.toCharArray()) {
            union.add(ch);
        }
        System.out.println(union);
        StringBuilder sb = new StringBuilder();
        for (char ch: union) {
            sb.append(ch);
        }

        System.out.println(sb);


   } 
}

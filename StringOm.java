import java.util.Scanner;

public class StringOm {
    public static boolean ispallindrome(String username){
    int left =0 ;
        int right = username.length()-1;
        while(left<=right){
            if(username.charAt(left)!= username.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // FIX 1: Use nextLine() to capture the entire string, including spaces
        String username = sc.nextLine(); 
        
        String password = sc.next();
        int len1 = username.length();
        int len2 = password.length();
        /*
        Determine the length is equal or not
        */
        if(len1 == len2){
            System.out.println("login sucessfully");
        }else{
            System.out.println("Invalid credentials");
        }
        /*
        Count the number of spaces 
        */
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            if(username.charAt(i) == ' '){ 
                count++;
            }
        }
        System.out.println(count);
        System.out.println(ispallindrome(username));

        
        sc.close(); // Good practice to close the scanner
    }
}

import java.util.Scanner;
public class TitleaCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char[] arr = str.toCharArray();

        /*[h,e,l,l,o, ,w,o,r,l,d] */
        // 0 1 2 3 4 5 6 7 8 9 10        

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i - 1] == ' ') {
                arr[i] = Character.toUpperCase(arr[i]);
            }
            // arr[0] ='H'
            // arr[6] ='W' 
        }

        System.out.println(new String(arr));
    }
}

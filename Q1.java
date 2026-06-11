
public class Q1 {
    public static void main(StringOm[] args) {
        int x = -1 ;
        while(x++ == 1){
            System.out.println("loop");
        } 
        int i = 5;
        while(--i > 0){
            System.out.println("Loop");
        }

        int j = 4,k= 7;
        while (++i < --j) {
            System.out.println("Loop");
        }

        int a = 0;

        // orints nothing this is post increment operator it will go inside whille loop a = 0 
        // i.e. condition false and does not return any value

        /*while (a++) {
            System.out.println("a");
            if(a==3)
                break;
        }*/

        /*while (NULL == 0) {
            System.out.println("Loop");
            break;
        }*/
    }
}

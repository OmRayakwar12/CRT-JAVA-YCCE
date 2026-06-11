public class SwitchCase {
    public static void main(String[] args) {
        int i = 1;
        switch (i) {
            case 1:
                System.out.print("Hi ");
        
            default:
                System.out.print("Hello");;
        }
        System.out.println();

        char ch = 65;
        switch (ch) {
            case 'A':
                System.out.println("Apple");
                break;
            case 'B':
                System.out.println("Bing");
                break;
        
            default:
                System.out.println("Bye");
        }


        /* 
        Duplicate case switch case stores ASCII value
        Error ->
        */
        /*
        int j = 65;
        switch (j) {
            case 65:
                System.out.println("Integer 65");
                break;
            case 'A':
                System.out.println("Char 65");
            default:
                break;
        }
        */

        /*
        int k = 65;
        char c ='B';
        switch (k,c) {
            case 65:
                System.out.println("Integer");
                break;
            case 'B':
                System.out.println("Char");
                break;
        }

        Java does not support the multi argument switch case
        */
        System.out.println();
        int a = 1;
        a++;
        switch (a--) {
            case 1:
                System.out.println("Case 1 executed");
                break;
            case 2:
                System.out.println("Case 2 executed");
                break;
            default:
                System.out.println("Default executed");
                break;
        }
        System.out.println();
        switch (3/2) {
            case 1:
                System.out.println("Case 1 executed");
                
            case 2:
                System.out.println("Case 2 executed");
                break;
            default:
                System.out.println("Default executed");
                break;
        }

        /*

        Output -> Case 1 executed (Priority depends --> pre ---> post)
        int num = 0;
        if(num++,num--,++num){
            switch (num) {
            case 1:
                System.out.println("Case 1 executed");
                break;
                
            case 2:
                System.out.println("Case 2 executed");
                break;
            default:
                System.out.println("Default executed");
                break;
            }
        }
        */
        
        /*
        int num = 5;
        switch (num++ == 5) {
            case 1:
                System.out.println("True");
                break;
            case 0:
                System.out.println("False");
                break;
        
            default:
                System.out.println("Inside default");
                break;
        }
        */



    }
}

public class Substring {
    public static void main(String[] args) {
        String str = "ababababab";
        String target = "ab";

        int count = 0;
        int index = 0;

        while ((index = str.indexOf(target, index)) != -1) {
            count++;
            index += target.length(); 
        }

        System.out.println(count);

    }  
}

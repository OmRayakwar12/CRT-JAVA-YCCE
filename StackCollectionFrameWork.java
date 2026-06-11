import java.util.ArrayDeque;
import java.util.Deque;

public class StackCollectionFrameWork {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.peek());
        int num = 0;
        stack.push(num);//[10 20 30 40 0]
        stack.pop();//[10 20 30 40]
        stack.pop();//[10 20 30]
        System.out.println("Current Stack: " + stack);

        while(!stack.isEmpty()){
            System.out.print(stack.peek()+" ");
            stack.pop();
        }
 
    }
}

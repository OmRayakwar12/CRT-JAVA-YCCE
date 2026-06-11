import java.util.LinkedList;
import java.util.Queue;

public class QueueCollectionFramework {

    public static void showq(Queue<Integer> gq) {
        Queue<Integer> g = new LinkedList<>(gq);
        while (!g.isEmpty()) {
            System.out.print("\t" + g.peek());
            g.poll();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();

        que.add(11);
        que.add(22);
        que.add(33);

        System.out.print("The queue is : ");
        showq(que);

        System.out.println( que.size());
        System.out.println(que.peek());
        System.out.println(((LinkedList<Integer>) que).peekLast());

        System.out.println("\nque.pop() : ");
        que.poll();
        
        System.out.print("The queue is : ");
        showq(que);
    }
}

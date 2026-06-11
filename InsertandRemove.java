import java.util.ArrayList;

public class InsertandRemove {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(0, 1);

        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
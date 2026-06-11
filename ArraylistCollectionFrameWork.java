import java.util.ArrayList;
public class ArraylistCollectionFrameWork {
    public static void main(String[] args) {
        ArrayList<Integer> g1 = new ArrayList<>();
        
        for (int i = 1; i <= 5; i++) {
            g1.add(i);
        }

        System.out.println("Output of begin and end:");
        for (int i = 0; i < g1.size(); i++) {
            System.out.print(g1.get(i) + " ");
        }
        System.out.println();

        System.out.println("\nOutput of reverse begin and reverse end: ");
        for (int i = g1.size() - 1; i >= 0; i--) {
            System.out.print(g1.get(i) + " ");
        }
        System.out.println();

        System.out.println("\n Size : " + g1.size());
        System.out.println(" Capacity : (Not directly accessible in Java)");
        System.out.println(" Max_Size : " + Integer.MAX_VALUE);

        System.out.println("\n at \t: g1.at(4) = " + g1.get(4));
        System.out.println(" front() \t: g1.front() = " + g1.get(0));
        System.out.println(" back() \t: g1.back() = " + g1.get(g1.size() - 1));
    }
}

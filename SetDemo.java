import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        
        Set<Integer> set1 = new HashSet<>();

        set1.add(2);
        set1.add(3);
        System.out.println("Set1: " + set1);

        Set<Integer> set2 = new HashSet<>();

        set2.add(1);
        set2.add(2);
        System.out.println("Set2 :" + set2);

        set2.addAll(set1);
        System.out.println("Union is" + set2);
    }
    
}

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        
        Set<String> studlist=new LinkedHashSet<String>();

        studlist.add("Rutuja");
        studlist.add("Supriya");
        studlist.add("Vaishnavi");
        studlist.add("Divya");

        System.out.println("The Student list recently added as:" + studlist);

        Iterator<String> iterator = studlist.iterator();

        while(iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        studlist.remove("Vaishnavi");
        System.out.println("The lis of element after removal:"+studlist);

    }
    
}


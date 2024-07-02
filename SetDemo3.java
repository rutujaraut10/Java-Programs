import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo3 {
    public static void main(String[] args) {
        
        Set<String> studlist=new HashSet<String>();
        System.out.println("List of Fav Fruits");
        studlist.add("Mango");
        studlist.add("Apple");
        studlist.add("Banana");
        studlist.add("Chickoo");
        System.out.println("The Student list recently added as:" + studlist);

        Set<String> studlist1=new LinkedHashSet<String>();
        System.out.println("List of Fav Vegetables");
        studlist1.add("Cabbage");
        studlist1.add("Flower");
        studlist1.add("Spinach");
        System.out.println("The Student list recently added as:" + studlist1);

        Iterator<String> iterator = studlist.iterator();
        while(iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        studlist.remove("Apple");
        System.out.println("The list of element after removal:"+studlist);

        Set<String> unionSet = new HashSet<>(studlist);
        unionSet.addAll(studlist1);
        System.out.println("Union: " + unionSet);

        Set<String> differencSet = new HashSet<>(studlist);
        differencSet.removeAll(studlist);
        System.out.println("Difference: " + differencSet);

    }
    
}

import java.util.Map;
import java.util.TreeMap;

public class Collection {
    public static void main(String[] args) {
        TreeMap <String, Integer> fruits = new TreeMap<String, Integer>();

        fruits.put("Apple", 200);
        fruits.put("Banana", 70);
        fruits.put("Cherry", 150);
        fruits.put("Mango", 600);
        System.out.println(fruits);

        Map <String, Integer> morefruits = new TreeMap<String, Integer>();
        morefruits.put("Strawberry", 140);
        morefruits.put("Jackfruit", 200);

        fruits.putAll(morefruits);
        System.out.println(fruits);

        fruits.clear();
        System.out.println(fruits);

        System.out.println(fruits.isEmpty());

        fruits.put("Chickoo", 50);
        System.out.println(fruits.isEmpty());
    }
}


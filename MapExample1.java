import java.util.HashMap;
import java.util.Map;

public class MapExample1 {
    public static void main(String[] args) {
        Map<String, Integer> emp = new HashMap<String, Integer>();

        emp.put("Rutuja", 12783);
        emp.put("Yash",34781);
        emp.put("Shwetal",25671);
        System.out.println("Map:" + emp);

        //Access keys of the map
        System.out.println("Keys" + emp.keySet());
        
        //Access values of the map
        System.out.println("Values" + emp.values());

        Integer empName = emp.get("Yash");
        System.out.println("Employee with ID Yash: " + empName);


    }
    
}

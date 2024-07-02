import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        
        Map<String, String> map = new HashMap<String, String>();
        map.put("actor","sunil");
        map.put("ceo","sam");
        map.put("cleark","raman");
        map.put("accountant","raj");
        map.put("clerk","raj");

        System.out.println(map.get("doctor"));

        Set<String> desgination = map.keySet();
        for(String key:desgination)
        {
            System.out.println(map.get(key));
        }
        for(String key:desgination)
        {
            System.out.println(key + " "+ map.get(key));
        }
    }
}

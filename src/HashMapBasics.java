import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapBasics {
    static void main(String[] args) {
        Map<String, String> mapping = new HashMap<>();

        //insertion
        mapping.put("in", "india");
        mapping.put("in", "india2");
        mapping.put("us", "United States");
        mapping.put("br", "Brazil");

        System.out.println(mapping);

        Map<String, String> table = new HashMap<>();

        table.put("en", "england");
        System.out.println("before :" +table);
        table.putAll(mapping);
        System.out.println("after : " +table);

        //deletion
        table.remove("en");
        System.out.println(table);

        System.out.println(table.get("br"));

        System.out.println(table.getOrDefault("USA", "Null"));

        System.out.println(table.containsKey("is"));

        System.out.println(table.containsValue("United States"));
        System.out.println(table);
        table.replace("in", "indonesia");
        System.out.println(table);

        Set<String> keySet = table.keySet();
        System.out.println("All keySet : " +keySet);

        Collection<String> valueSet = table.values();
        System.out.println("All Values : " +valueSet);

        //get All the Entry Set from map
                Set<Map.Entry<String, String>> entryset = table.entrySet();
        System.out.println("Printing All Entries : " +entryset);








//        table.putIfAbsent("is", "india3" );
//        System.out.println(table);
//        System.out.println(table.size());
//        table.clear();
//        System.out.println(table.size());
    }
}

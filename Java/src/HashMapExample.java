import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String args[]){
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"Sonam");
        map.put(2,"Vandana");
        map.put(3,"Pallavi");
        map.put(4,"Shivani");

        System.out.println("Iterating Hashmap...");
        for(Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
            map.remove(1);
            System.out.println("Updated list of elements: "+map);

            map.replace(3,"Sonam");
            System.out.println("updated list of elements:"+map);
    }

}
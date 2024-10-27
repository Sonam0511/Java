import java.util.*;

public class Main {


    public static void main(String args[]){
        Map<Person, Integer> personMap = new HashMap<>();


        personMap.put( new Person(1, "PQR", 30),1);
        personMap.put( new Person(2, "ABC", 25),2);
        personMap.put( new Person(1, "XYZ", 28),3);

        System.out.println(personMap);
//        Set<Integer> uniquePersons = new HashSet<>();
//
//        Map<Integer, Person> uniquePersonMap = new LinkedHashMap<>();
//
//        for (Map.Entry<Person, Integer> entry : personMap.entrySet()) {
//            Integer person = entry.getValue();
//
//            if (uniquePersons.add(person)) {
//
//                uniquePersonMap.put(person, entry.getKey());
//            }
//        }
//
//        for (Map.Entry<Integer, Person> entry : uniquePersonMap.entrySet()) {
//            System.out.println("Key (ID): " + entry.getKey() + ", Value (Person): " + entry.getValue());
//        }


    }
}

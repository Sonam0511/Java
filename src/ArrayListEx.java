import java.util.*;

public class ArrayListEx {
    public static void main(String args[]) {
        List<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");



        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        long count = list.stream().filter(fruit -> "Mango".equals(fruit)).count();
        System.out.println(count);
        }





       /* if (!list.equals(list1)) {
            System.out.println("list and list1 are Un equal," +
                    " and their respective hash value are:" + "" + list.hashCode() + " and " + list1.hashCode());
        }*/
    }








import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name=name;
        this.price=price;
    }
}


public class JavaStreamExample{
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
//        productsList.add(new Product(1, "HP Laptop", 25000));
//        productsList.add(new Product(2, "Dell Laptop", 30000));
//        productsList.add(new Product(3, "Lenevo Laptop", 28000));
//        productsList.add(new Product(4, "Sony Laptop", 28000));
//        productsList.add(new Product(5, "Apple Laptop", 90000));

        productsList.add(new Product(1, "HP Laptop", 1));
        productsList.add(new Product(2, "Dell Laptop", 2));
        productsList.add(new Product(3, "Lenevo Laptop", 3));
        productsList.add(new Product(4, "Sony Laptop", 4));
        productsList.add(new Product(5, "Apple Laptop", 5));

//        List<Float> productsList2 = productsList.stream()
//                .filter(p -> p.price > 30000)// filtering data
//                .map(p -> p.price)//fetching data
//                .collect(Collectors.toList());//collect as a list
//        System.out.println(productsList2);
//
//        productsList.stream().filter(product -> product.price == 25000)
//                .forEach(product -> System.out.println(product.name));

        String totalPrice = productsList.stream()
                .map(product -> product.price)
                .map(String::valueOf)
                .reduce("", (sum, price) -> sum + " " + price);// accumulating price


        System.out.println(totalPrice);


//        float totalPrice2 = productsList.stream()
//                .map(product->product.price)
//                .reduce(0.0f,Float::sum);
//        System.out.println(totalPrice2);
//        //Max
//        Product productA = productsList.stream().max((product1, product2)->product1.price > product2.price ? 1: -1).get();
//        System.out.println(productA.price);
//        //Min
//        Product productB = productsList.stream().min((product1, product2)->product1.price > product2.price ? 1: -1).get();
//        System.out.println(productB.price);
//        //count
//        long count = productsList.stream()
//                .filter(product->product.price<30000)
//                .count();
//        System.out.println(count);
//
//        // Converting product List into Set
//        Set<Float> productPriceList =
//                productsList.stream()
//                        .filter(product->product.price < 30000)   // filter product on the base of price
//                        .map(product->product.price)
//                        .collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)
//        System.out.println(productPriceList);
//
//        // Converting Product List into a Map
//        Map<Integer,String> productPriceMap =
//                productsList.stream()
//                        .collect(Collectors.toMap(p->p.id, p->p.name));
//
//        System.out.println(productPriceMap);

    }
}

 interface MyInterface {
    default void display() {
        System.out.println("Default display method");
    }
}



 public class DefaultMethod implements MyInterface {
     public static void main(String[] args) {
         DefaultMethod example = new DefaultMethod();

         example.display();

     }
 }



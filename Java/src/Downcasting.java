class Parent1{
    String name;
    void showMessage(){

        System.out.println("Parent Method is Called");
    }
}

class Child1 extends Parent1{
int age;
void showMessage(){
  System.out.println("Child Method is Called");
}
}
public class Downcasting {
    public static void main(String[]args){
        Parent1 p=new Child1();
        p.name="sonam";

        Child1 c=(Child1)p;
        c.age=24;

        System.out.println(c.name);
        System.out.println(c.age);
        c.showMessage();
    }
}

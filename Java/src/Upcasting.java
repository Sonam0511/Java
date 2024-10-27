class Parent{
    void PrintData(){
        System.out.println("Method of parent class");
    }
}

class child extends Parent{
    void PrintData(){
        System.out.println("Method of child class");
    }
}
public class Upcasting {
    public static void main(String[]args){
        Parent obj1= new child();


        obj1.PrintData();

    }
}

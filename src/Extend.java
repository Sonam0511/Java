 class Electronic {
    void start() {
        System.out.println("Vehicle starting.");
    }
}
class Mobile extends Electronic {
    void accelerate() {
        System.out.println("Car accelerating.");
    }
}

public class Extend{
    public static void main(String[]args){
        Mobile m=new Mobile();
        m.accelerate();
    }
}

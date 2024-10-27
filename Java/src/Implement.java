interface Flyable {
    void fly();
}
class Bird implements Flyable {
    void chirp() {

        System.out.println("Bird chirping.");
    }
    public void fly() {

        System.out.println("Bird flying.");
    }
}
public class Implement{
    public static void main(String[]args){
        Bird bird=new Bird();
        bird.fly();
        bird.chirp();
    }
}
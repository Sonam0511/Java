public class Flower {}
     class Rose extends Flower{

    static void method(Flower f){
        if(f instanceof Rose){
            Rose r=(Rose)f;
            System.out.println("DownCasting Performed");
        }
    }
        public static void main(String args[]){
            Rose r=new Rose();
            Rose r1=null;
            System.out.println(r instanceof Rose);
            System.out.println(r instanceof Flower);
            System.out.println(r1 instanceof Rose);
            Flower f=new Rose();
            Rose.method(f);



    }
}

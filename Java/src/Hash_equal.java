public class Hash_equal {
    public static void main(String[]args){
        String a="Sonam";
        String b="Sonam";
        if(a.equals(b)){
            System.out.println("a and b are equal variables," +
                    " and their respective hash value are:"+ ""+ a.hashCode()+ " and " + b.hashCode());

            String c="Shivani";
            String d="Vandana";
            if(!c.equals(d)){
                System.out.println("c and d are un-equal variables," +
                        " and their respective hash value are:"+ ""+ c.hashCode()+ " and " + d.hashCode());

            }
        }
    }
}

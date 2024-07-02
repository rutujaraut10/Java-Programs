import java.util.ArrayList;

public class ArrlistEx {
    public static void main(String[] args) {
        
        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("Maths");
        al1.add("Science");
        al1.add("Geography");

        System.out.println(al1);
        System.out.println("The size of the arraylist:"+al1.size());

        ArrayList<String> al2=new ArrayList<String>();
        al2.add("Histroy");
        al2.add("Civis");
        al2.add("Algebra");

        al1.addAll(al2);
        System.out.println(al1);

        al2.addAll(al1);
        System.out.println(al2);

        System.out.println(al2.get(4));

        al2.set(5, "geometry");
        System.out.println(":Final list of subjects:"+al2);

    }
}

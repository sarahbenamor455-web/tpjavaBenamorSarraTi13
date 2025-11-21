import java.util.Arraylist;
public class lang{
    public static void main(String[]args){
        ArrayList<String>langage=new Afficherlist<>();
        langage.add("PHP");
        langage.add("java");
        langage.add("C++");
        langage.add("Pyton");
        System.out.println(langage);
        langage.add(0,"pascal");
        String a=langage.get(2);
        System.out.println(a);
        langage.remove( 1);
        langage.remove( 3);
        langage.set( 2,"CH");


    }
}
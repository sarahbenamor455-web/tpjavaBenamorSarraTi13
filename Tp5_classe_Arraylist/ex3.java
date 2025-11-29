import java.util.ArrayList;
import java.util.Collections;

public class ex3{
    public static void main(String[] args) {

        ArrayList<Integer> L1 = new ArrayList<>();
        ArrayList<Integer> L2 = new ArrayList<>();

        L1.add(2); L1.add(7); L1.add(3); L1.add(5);
        L2.add(5); L2.add(3); L2.add(7); L2.add(2);

        ArrayList<Integer> C1 = new ArrayList<>(L1);
        ArrayList<Integer> C2 = new ArrayList<>(L2);

        Collections.sort(C1);
        Collections.sort(C2);

        if (C1.equals(C2)) {
            System.out.println("Les deux listes ont les mêmes éléments.");
        } else {
            System.out.println("Les deux listes sont différentes.");
        }
    }
}

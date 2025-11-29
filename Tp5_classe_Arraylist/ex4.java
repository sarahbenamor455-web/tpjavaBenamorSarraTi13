import java.util.ArrayList;
import java.util.Collections;

public class ex4 {
    public static void main(String[] args) {

        ArrayList<Integer> L = new ArrayList<>();
        Collections.addAll(L, 1,2,3,4,5);

        int NB = 2;

        System.out.println("Liste originale : " + L);

        NB = NB % L.size(); // éviter les dépassements

        ArrayList<Integer> R = new ArrayList<>();

        for (int i = L.size() - NB; i < L.size(); i++) {
            R.add(L.get(i));
        }
        for (int i = 0; i < L.size() - NB; i++) {
            R.add(L.get(i));
        }

        System.out.println("Après rotation : " + R);
    }
}

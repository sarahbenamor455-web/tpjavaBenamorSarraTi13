import java.util.ArrayList;

public class ex1 {
    public static void main(String[] args) {

        ArrayList<Integer> L = new ArrayList<>();
        L.add(2); L.add(5); L.add(5); L.add(5); L.add(9); L.add(12); L.add(12); L.add(3);

        System.out.println("Liste originale : " + L);

        ArrayList<Integer> LF = new ArrayList<>();

        if (!L.isEmpty()) {
            LF.add(L.get(0));

            for (int i = 1; i < L.size(); i++) {
                if (!L.get(i).equals(L.get(i - 1))) {
                    LF.add(L.get(i));
                }
            }
        }

        System.out.println("Liste compressée : " + LF);
    }
}

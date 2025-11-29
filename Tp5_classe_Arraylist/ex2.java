import java.util.ArrayList;

public class ex2 {
    public static void main(String[] args) {

        ArrayList<Integer> L1 = new ArrayList<>();
        ArrayList<Integer> L2 = new ArrayList<>();

        L1.add(2); L1.add(5); L1.add(9); L1.add(12);
        L2.add(1); L2.add(4); L2.add(6); L2.add(10);

        ArrayList<Integer> LF = new ArrayList<>();

        int i = 0, j = 0;

        while (i < L1.size() && j < L2.size()) {
            if (L1.get(i) < L2.get(j)) {
                LF.add(L1.get(i));
                i++;
            } else {
                LF.add(L2.get(j));
                j++;
            }
        }

        while (i < L1.size()) LF.add(L1.get(i++));
        while (j < L2.size()) LF.add(L2.get(j++));

        System.out.println("Liste fusionnée : " + LF);
    }
}

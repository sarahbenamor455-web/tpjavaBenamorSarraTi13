import java.util.Scanner;

public class app3 {
    public static int lectureN() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Donner le taille : ");
            n = sc.nextInt();
        } while (n <= 0);
        return n;
    }
    public static void RemplirTAB(int[] T,int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("saisir"+n+"entiers positifs");
        for (int i = 0; i < T.length; i++) {
            do {
                System.out.print("T[" + i + "] = ");
                T[i] = sc.nextInt();
            } while (T[i] <= 0);
        }
    }
    public static int[] CreerTpair(int[] T) {
        int cpt = 0;
        for (int i=0;i<T.length; i++) {
            if (T[i] % 2 == 0)
                cpt++;
        }
        int[] T_pair = new int[cpt];
        int j = 0;
        for (int i=0;i<T.length;i++) {
            if (T[i] % 2 == 0){
                T_pair[j] =T[i];
                j++;}

        }

        return T_pair;
    }
    public static int[] CreerTimpair(int[] T) {
        int cpt = 0;
        for (int i=0;i < T.length;i++) {
            if (T[i] % 2 != 0)
                cpt++;}
    
        int[] T_impair = new int[cpt];
        int j = 0;
        for (int i=0;i<T.length;i++) {
            if (T[i] % 2 != 0){
                T_impair[j] = T[i];
                j++;}
        }

        return T_impair;
    }
    public static void AfficherTAB(int[] T) {
        System.out.print("[ ");
        for (int val : T) {
            System.out.print(val + " ");
        }
        System.out.println("]");
    }
    public static void main(String[] args) {

        int n = lectureN();

        int[] T = new int[n];
        RemplirTAB(T,n);

        int[] T_pair = CreerTpair(T);
        int[] T_impair = CreerTimpair(T);

        System.out.println("\nTableau initial T :");
        AfficherTAB(T);

        System.out.println("Tableau des pairs :");
        AfficherTAB(T_pair);

        System.out.println("Tableau des impairs :");
        AfficherTAB(T_impair);
    }
}

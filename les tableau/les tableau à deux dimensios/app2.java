import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nl, nc;
        do {
            System.out.print("Donner le nombre de lignes (nl < 30) : ");
            nl = sc.nextInt();
        } while (nl <= 0 || nl >= 30);
        do {
            System.out.print("Donner le nombre de colonnes (nc < 30) : ");
            nc = sc.nextInt();
        } while (nc <= 0 || nc >= 30);

        int[][] M = new int[nl][nc];
        int somme = 0;
        int produit = 1;
        int total= nl * nc;
        float moyenne=0;
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                System.out.print("M[" + i + "][" + j + "] = ");
                M[i][j] = sc.nextInt();
                somme += M[i][j];
                produit *= M[i][j];
                moyenne = somme/total;
            }
        }
        System.out.println("Somme : " + somme);
        System.out.println("Produit  : " + produit);
        System.out.println("la moyenne:" + moyenne);

        }
    }
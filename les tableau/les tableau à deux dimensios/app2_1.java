import java.util.*;

public class app2{
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
        ArrayList<ArrayList<Integer>> m= new ArrayList<>();
        for(int i=0;i<nl;i++){
            ArrayList<Integer> ligne=new ArrayList<>();
            for(int j=0;j<nc;j++){
                System.out.println("donner les element des matrice");
                ligne.add(sc.nextInt());}
                m.add(ligne);}
            int somme=0;long produit=1;
            int taill=nl*nc;
            for(int i=0;i<nl;i++){
                for(int j=0;j<nc;j++){
                    int val= m.get(i).get(j);
                    somme=somme+val;
                }
            }
            double moyenne=(double)somme/taill;
        System.out.println("somme="+somme);
        System.out.println("porduit="+porduit);
        System.out.println("moyenne="+moyenne);



            
            
            
            
            
            }
        }
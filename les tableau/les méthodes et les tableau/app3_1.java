import java.util.Scanner;
import java.util.ArrayList;
public class app3_1{

    public static int lectureN() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Donner le taille : ");
            n = sc.nextInt();
        } while (n <= 0);
        return n;}
    public static void RemplirTAB(ArrayList<Integer>T,int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("remplir le tableau");
        for(int i=0;i<n;i++){
                int val;
                do{
                    System.out.println("donner T["+i+"]");
                    val=sc.nextInt();}
                while(val<=0);    
                T.add(val);}
            
        }
    public static ArrayList<Integer>CreerTpair(ArrayList<Integer>T){
        ArrayList<Integer>T_pair=new ArrayList<>();
        for(int i=0;i<T.size();i++){
            if(T.get(i)%2==0){
                T_pair.add(T.get(i));
            }
        }
        return T_pair;
    }
    public static ArrayList<Integer>CreerTimpair(ArrayList<Integer>T){
        ArrayList<Integer>T_impair=new ArrayList<>();
        for(int i=0;i<T.size();i++){
            if(T.get(i)%2!=0){
                T_impair.add(T.get(i));
            }
        }
        return T_impair;
    }
    public static void Afficherlist(ArrayList<Integer>T){
        System.out.println(T);}

       
    public static void main(String[]args){
    int n=lectureN();
    ArrayList<Integer> T=new ArrayList<>();
    
    RemplirTAB(T,n);
    ArrayList<Integer> T_pair=CreerTpair(T);
    ArrayList<Integer> T_impair=CreerTimpair(TVBVBV);
    System.out.println("les list sont");
    Afficherlist(T);
    Afficherlist(T_pair);
    Afficherlist(T_impair);

}
    

    
    
    } 
    
    



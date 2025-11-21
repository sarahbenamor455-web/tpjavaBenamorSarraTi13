import java.util.Scanner;
public class App5 {  
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,n1,n2,i,j,k,elem;
        int[]T=new int[100];
        int[]T1=new int[100];
        int[]T2=new int[100];
          // lecture de n
        do{
          System.out.println("Saisir n:");
          n=sc.nextInt();
        }while(n<=0|| n>100);
        // remplir tableau
        for(i=0;i<n;i++){
          do{
          System.out.println("Saisir T["+i+"]=");
          elem=sc.nextInt();
        }while(elem<=0);
        T[i]=elem;  }
        // Eclatement
        j=0; k=0;
        for(i=0;i<n;i++){
          if (T[i]%2==0){  T1[j]=T[i]; j++; }
          else{  T2[k]=T[i];  k++;}
        }
        n1=j; n2=k;
        // Affichage T1
        System.out.println("********** T1 **********");
        for(i=0;i<n1;i++){
          System.out.println("T1["+i+"]="+T1[i]);
        }
        // Affichage T2
        System.out.println("********** T2 **********");
        for(i=0;i<n2;i++){
          System.out.println("T2["+i+"]="+T2[i]);
        }
    }
}
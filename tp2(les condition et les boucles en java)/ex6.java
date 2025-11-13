import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        do{
            System.out.println("donner un nombre ");
            n=sc.nextInt();
        }
        while(n<0);
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        
    }
    
}

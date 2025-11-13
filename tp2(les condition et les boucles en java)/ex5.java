import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,a,j=1;
        do{
        System.out.println("donner les nombre de mois");
        m=sc.nextInt();}
        while(1>m||m>12);
        System.out.println("donner une année");
        a=sc.nextInt();
        switch(m) {
            case 1,3,5,8,7,10,12:
            j=31;
            break;
            case 4,6,9,11:
            j=30;
            break;
            case 2:
            if((a%4==0)&&(a%100!=0)||(a%400==0)){
                j=29;
            }
            else{j=28;}
            break;

            
        }
        System.out.println("En "+a+" le mois n "+m+" a "+j+" jours ");
        
    }
    
}

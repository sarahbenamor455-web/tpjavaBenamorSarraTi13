import java.util.Scanner;
public class permuter{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int a,b;
        System.out.println("donner a");
        a=sc.nextInt();
        System.out.println("donner b");
        b=sc.nextInt();
        if(a>b){
            a=a+b;
            b=a-b;
            a=a-b;

        }
    System.out.println("les nouvelle valeur de a et b sont:"+a+","+b);













    }
}
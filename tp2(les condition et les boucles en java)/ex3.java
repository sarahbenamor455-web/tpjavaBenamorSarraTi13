import java.util.Scanner;
public class ex3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a,i;
        do{
            System.out.println("donner un nombre");
            a=sc.nextInt();
        }
        while(1>a || a>10);
        System.out.println("table de multiplication de "+a);
        for(i=1;i<=10;i++){System.out.println(a+"x"+i+"="+(a*i));}
    }}
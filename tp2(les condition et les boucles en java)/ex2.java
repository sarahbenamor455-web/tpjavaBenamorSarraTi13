import java.util.Scanner;
public class ex2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x;
        do{
            System.out.println("donner le num de moi");
            x=sc.nextInt();}
        while(x<1||x>12);
        switch (x) {
            case 12,1,2:
            System.out.println("hiver");
            break;
            case 3,4,5:
            System.out.println("printemps");
            break;
            case 6,7,8:
            System.out.println("ete");
            break;
            case 9,10,11:
            System.out.println("automne");
            default:
            System.out.println("invalide");
            break;


                
        }    
        } }
import java.util.Scanner;

public class température {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Float c;
        double k=0;
        System.out.println("donner la température");
        c=sc.nextFloat();
        k=c+273.15;
        System.out.println(c+"°C"+k+"K");
    }
}

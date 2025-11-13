import java.util.Scanner;
public class température{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        float t;
        System.out.println("donner la température");
        t=sc.nextFloat();
        if(0>t){System.out.println("glace");}
        else if((0<t)&&(t<100)){System.out.println("eau");}
        else{System.out.println("vapeur");}









    }
}
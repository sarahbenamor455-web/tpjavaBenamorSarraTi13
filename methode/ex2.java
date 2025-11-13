import java.util.Scanner;
public class ex2 {
    public static int lecture_n(int n){
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("donner n");
            n=sc.nextInt();}
        while(n<0);    
    return n;}
    public static int compter(String ch){
        int i,s=0;
        for(i=0;i<ch.length();i++){
            s=s+1;}
        return s; }   

        
    public static void main(String[]args){
        int n=0;
        String s;
        n=lecture_n(n);
        s=String.valueOf(lecture_n(n));
        System.out.println("les nombre des chiffre est "+compter(s));

    }


}
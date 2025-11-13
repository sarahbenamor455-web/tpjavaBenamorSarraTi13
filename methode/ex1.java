import java.util.Scanner;

public class ex1{
    public static int lecture_n(int n){
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("donner n");
            n=sc.nextInt();}
        while(n<0);    
    return n;
    }
    public static boolean ESTPaire(int n ){
        boolean test=true;
        if(n%2==0){test=true;}
        else{test=false;}
        return test;
        
    }
    public static void main(String[] args) {
        int i,n=0;
        for(i=0;i<=9;i++){
            n=lecture_n(n);
        if(ESTPaire(n)==true){System.out.println(n+" est paire");}   
        
    }

        
    }
}
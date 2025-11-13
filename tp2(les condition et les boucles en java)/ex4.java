import java.util.Scanner;
public class ex4{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x,i,f=1; 
    do{
        System.out.println("donner un enter positif ");
        x=sc.nextInt();
    }
    while(x<0);
    if(x==0){System.out.println("la factoriel de 0 = 1");}
    else{
    for(i=1;i<=x;i++){f*=i;}}
    System.out.println("le factoriel de "+x+" est:"+f);

    
    
}}

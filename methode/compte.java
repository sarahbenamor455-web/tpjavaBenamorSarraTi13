import java.util.Scanner;
public class compte {
    public static boolean nom(String ch ){
        int i,nb=0;
        boolean test;
        for(i=0;i<ch.length();i++){}
            if(ch.indexOf("_")!=-1){nb++;}
            if(nb==1){test=true;}}
            return test;
    public static String naissanse(String ch1){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("donner votre joure de naissance");
            int j=sc.nextInt();}
        while((1<j)&&(j>31));
        String jour=String.valueOf(j);
        do{
            System.out.println("donner votre mois naissance");
            int m=sc.nextInt();}
        while((m<1)&&(m>12));
        String mois=String.valueOf(m);
        System.out.println("donner votre annee de naissance");
        int a=sc.nextInt();  
        String annee=String .valueOf(a);
        ch1=jour+mois+annee;
        return ch1;}
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String ch,ch1,n;
        do{System.out.println("donner votre nom_prenan");
        n=sc.nextLine();}
        while(nom(ch)==false);
        String f=naissanse(ch1);
        String compte="000"+n+f;
        System.out.println("votre compte est "+compte);}}

       

          


            

           

        
    


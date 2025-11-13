import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i,y;
        char x;
        String ch;
        do {
            System.out.println("veuillew saisir une chaine de caractere:");
            ch=sc.nextLine();
            
        }
        while(ch.lenght()<30);
        for(i=0;i<ch.lenght();i++);
        x=ch.charAt(i);
        y=(int)'x';
        if(Character.isUppercase(x)){y=97+(((int)'x'-97+3)%26);}
        else if (Character.isLowercase(x)){y=65+(((int)'x'-65+3)%26);}



    }
    
}

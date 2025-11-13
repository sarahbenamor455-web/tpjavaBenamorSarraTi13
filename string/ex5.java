import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String ch;
        do{
            System.out.println("saisir un text ne depasse pas 50 caracteres");
            ch=sc.nextLine();
        }
        while(ch.length()>=50);
        int i, nb=0;
        for(i=0;i<ch.length();i++){
            if(Character.isUpperCase(ch.charAt(i))==true){
                nb=nb+1;
            }
            
        }
        System.out.println("le nombre des lettres minuscules dans ce text: "+nb);
    sc.close();
    
    }

    
}

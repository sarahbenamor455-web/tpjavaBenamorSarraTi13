import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("veuillew saisir une phrase:");
        String ch2=sc.nextLine();
        StringBuffer ch=new StringBuffer(ch2);
        System.out.println("le contenu du StringBuffer est :"+ch);
        sc.close();







    }
}
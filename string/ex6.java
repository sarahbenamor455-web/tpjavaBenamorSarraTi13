import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String v = "";
        boolean test = false;
        while (!test) {
            System.out.print("Entrez un verbe du premier groupe (terminé par 'er') : ");
            v = sc.nextLine().trim().toLowerCase();
            
            if (v.length() >= 3 && v.substring(v.length() - 2).equals("er")) {
                test = true;
            } else {
                System.out.println("Erreur : Le verbe doit se terminer par 'er'. Réessayez.");
            }
        }

        
        String racine = v.substring(0, v.length() - 2);

        // Conjugaison au présent de l'indicatif pour les verbes réguliers en -er
        System.out.println("\nConjugaison de '" + v + "' au présent de l'indicatif :");
        System.out.println("je " + racine + "e");
        System.out.println("tu " + racine + "es");
        System.out.println("il/elle/on " + racine + "e");
        System.out.println("nous " + racine + "ons");
        System.out.println("vous " + racine + "ez");
        System.out.println("ils/elles " + racine + "ent");

        sc.close();;}
}  

                
            
            
            
            

        

    


import java.util.Scanner;
public class DebugTPFinal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez une phrase : ");
        String phrase = sc.nextLine();

      
        String[] mots = phrase.split("\\s+");

        int nbMots = mots.length;
        int nbVoyelles = 0;
        String motPlusLong = "";

        
        for (String mot : mots) {

            
            for (char c : mot.toLowerCase().toCharArray()) {
                if ("aeiouy".indexOf(c) != -1) {
                    nbVoyelles++;
                }
            }

       
            if (mot.length() < motPlusLong.length()) {
                motPlusLong = mot;
            }
        }

        System.out.println("\n--- Résultats (version avec erreur) ---");
        System.out.println("Nombre de mots : " + nbMots);
        System.out.println("Nombre de voyelles : " + nbVoyelles);
        System.out.println("Mot le plus long (faux) : " + motPlusLong);

        sc.close();
    }
}


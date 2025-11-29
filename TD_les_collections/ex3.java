import java.util.HashMap;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Lire une phrase
        System.out.print("Entrez une phrase: ");
        String phrase = scanner.nextLine();
        
        // 2. Compter les occurrences de chaque mot
        HashMap<String, Integer> occurrences = new HashMap<>();
        String[] mots = phrase.split("\\s+");
        
        for (String mot : mots) {
            mot = mot.toLowerCase();
            occurrences.put(mot, occurrences.getOrDefault(mot, 0) + 1);
        }
        
        // Afficher le résultat
        System.out.println("Occurrences des mots: " + occurrences);
        
        scanner.close();
    }
}

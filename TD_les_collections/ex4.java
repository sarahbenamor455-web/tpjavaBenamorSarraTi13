import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Créer le HashMap Produits
        HashMap<String, Double> produits = new HashMap<>();
        
        // 2. Remplir le HashMap avec n produits
        System.out.print("Combien de produits voulez-vous ajouter? ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consommer la ligne
        
        for (int i = 0; i < n; i++) {
            System.out.print("Entrez le libellé du produit " + (i+1) + ": ");
            String libelle = scanner.nextLine();
            
            double prix;
            do {
                System.out.print("Entrez le prix (doit être > 0): ");
                prix = scanner.nextDouble();
                scanner.nextLine(); // consommer la ligne
            } while (prix <= 0);
            
            produits.put(libelle, prix);
        }
        
        // 3. Afficher tous les produits
        System.out.println("\nListe des produits:");
        for (Map.Entry<String, Double> entry : produits.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + " DH");
        }
        
        // 4. Calculer et afficher le prix moyen
        double somme = 0;
        for (double prix : produits.values()) {
            somme += prix;
        }
        double moyenne = somme / produits.size();
        System.out.println("\nPrix moyen des produits: " + moyenne + " DH");
        
        // 5. Afficher le libellé du produit le plus cher
        String produitPlusCher = "";
        double prixMax = 0;
        
        for (Map.Entry<String, Double> entry : produits.entrySet()) {
            if (entry.getValue() > prixMax) {
                prixMax = entry.getValue();
                produitPlusCher = entry.getKey();
            }
        }
        
        System.out.println("Produit le plus cher: " + produitPlusCher + " (" + prixMax + " DH)");
        
        scanner.close();
    }
}


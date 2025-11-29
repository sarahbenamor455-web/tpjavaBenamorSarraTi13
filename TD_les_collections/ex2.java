import java.util.ArrayList;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Créer une ArrayList d'employés
        ArrayList<String> employes = new ArrayList<>();
        employes.add("Ali_1500");
        employes.add("Mohamed_2300");
        employes.add("Fatima_1750");
        employes.add("Karim_3000");
        employes.add("Aicha_4500");
        employes.add("Hassan_5200");
        
        System.out.println("Liste des employés: " + employes);
        
        // 2. Vérifier si un employé est présent
        System.out.print("Entrez le nom d'employé à chercher: ");
        String nomCherche = scanner.nextLine();
        boolean trouve = false;
        
        for (String emp : employes) {
            if (emp.split("_")[0].equalsIgnoreCase(nomCherche)) {
                trouve = true;
                break;
            }
        }
        System.out.println("Employé " + nomCherche + " présent: " + trouve);
        
        // 3. Modifier le salaire d'un employé
        System.out.print("Entrez le nom d'employé à modifier: ");
        String nomModif = scanner.nextLine();
        System.out.print("Entrez le nouveau salaire: ");
        int nouveauSalaire = scanner.nextInt();
        
        for (int i = 0; i < employes.size(); i++) {
            String[] parts = employes.get(i).split("_");
            if (parts[0].equalsIgnoreCase(nomModif)) {
                employes.set(i, parts[0] + "_" + nouveauSalaire);
                break;
            }
        }
        System.out.println("Liste après modification: " + employes);
        
        // 4. Compter les employés avec salaire < 5000
        int count = 0;
        for (String emp : employes) {
            int salaire = Integer.parseInt(emp.split("_")[1]);
            if (salaire < 5000) {
                count++;
            }
        }
        System.out.println("Nombre d'employés avec salaire < 5000: " + count);
        
        scanner.close();
    }
}


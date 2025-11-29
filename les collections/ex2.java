import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Annuaire {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<String, String> annuaire = new HashMap<>();

        int choix;

        do {
            System.out.println("\n===== MENU ANNUAIRE =====");
            System.out.println("1. Ajouter un contact");
            System.out.println("2. Rechercher un contact");
            System.out.println("3. Modifier un numéro");
            System.out.println("4. Supprimer un contact");
            System.out.println("5. Afficher tous les contacts");
            System.out.println("6. Quitter");
            System.out.print("Choisissez une option : ");
            choix = sc.nextInt();
            sc.nextLine(); // vider le buffer

            switch (choix) {

                case 1: // Ajouter
                    System.out.print("Nom du contact : ");
                    String nomAjout = sc.nextLine();

                    if (annuaire.containsKey(nomAjout)) {
                        System.out.println("Contact existe déjà !");
                    } else {
                        System.out.print("Numéro du contact : ");
                        String numeroAjout = sc.nextLine();
                        annuaire.put(nomAjout, numeroAjout);
                        System.out.println("Contact ajouté !");
                    }
                    break;

                case 2: // Rechercher
                    System.out.print("Nom du contact à rechercher : ");
                    String nomSearch = sc.nextLine();

                    if (annuaire.containsKey(nomSearch)) {
                        System.out.println("Numéro : " + annuaire.get(nomSearch));
                    } else {
                        System.out.println("Contact introuvable !");
                    }
                    break;

                case 3: // Modifier
                    System.out.print("Nom du contact à modifier : ");
                    String nomModif = sc.nextLine();

                    if (!annuaire.containsKey(nomModif)) {
                        System.out.println("Contact introuvable !");
                    } else {
                        System.out.print("Nouveau numéro : ");
                        String nouveauNumero = sc.nextLine();
                        annuaire.replace(nomModif, nouveauNumero);
                        System.out.println("Numéro modifié !");
                    }
                    break;

                case 4: // Supprimer
                    System.out.print("Nom du contact à supprimer : ");
                    String nomSupp = sc.nextLine();

                    if (annuaire.containsKey(nomSupp)) {
                        annuaire.remove(nomSupp);
                        System.out.println("Contact supprimé !");
                    } else {
                        System.out.println("Contact introuvable !");
                    }
                    break;

                case 5: // Afficher
                    System.out.println("\n--- Liste des contacts ---");
                    if (annuaire.isEmpty()) {
                        System.out.println("Aucun contact.");
                    } else {
                        annuaire.forEach((nom, numero) ->
                                System.out.println("Nom : " + nom + "  |  Numéro : " + numero));
                    }
                    break;

                case 6:
                    System.out.println("Fermeture du programme...");
                    break;

                default:
                    System.out.println("Option invalide !");
            }

        } while (choix != 6);

        sc.close();
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ex1 {
    public static void main(String[] args) {
        // 1. Créer la ArrayList Livres
        ArrayList<String> livres = new ArrayList<>();
        livres.add("Java Programming");
        livres.add("Algorithmique");
        livres.add("Python Basics");
        
        System.out.println("Liste initiale: " + livres);
        
        // 2. Afficher les livres par ordre croissant
        Collections.sort(livres);
        System.out.println("Livres triés: " + livres);
        
        // 3. Supprimer tous les livres qui commencent par A
        Iterator<String> iterator = livres.iterator();
        while (iterator.hasNext()) {
            String livre = iterator.next();
            if (livre.toUpperCase().startsWith("A")) {
                iterator.remove();
            }
        }
        System.out.println("Après suppression: " + livres);
    }
}

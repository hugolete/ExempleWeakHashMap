import java.util.WeakHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // Création d'un WeakHashMap (Map où chaque objet est stockée comme WeakReference).
        // On va y stocker les livres de la bibliothèque
        Map<Livre, String> weakMapLivres = new WeakHashMap<>();

        // Création d'un livre (c'est un objet de la map)
        Livre livre1 = new Livre("1er livre");

        // Ajout du livre au WeakHashMap (objet, String associée a l'objet)
        weakMapLivres.put(livre1, "Exemple 1");

        System.out.println("Contenu du WeakHashMap avant le GC: " + weakMapLivres);

        // Définition de l'objet à null. Vu que c'est une map ou les valeurs sont stockées en WeakReference,
        // le GC va collecter cet objet car il "n'existe plus" et ne représente plus rien
        livre1 = null;

        // Appeler le garbage collector
        System.gc();

        System.out.println("Contenu du WeakHashMap après le GC: " + weakMapLivres);
    }
}
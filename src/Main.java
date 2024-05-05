import java.util.WeakHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // Création d'un WeakHashMap (Map où chaque valeur clé est stockée comme WeakReference)
        Map<ClasseTest, String> weakMap = new WeakHashMap<>();

        // Création d'un objet (clé)
        ClasseTest objet1 = new ClasseTest("1er objet");

        // Ajout d'un objet au WeakHashMap (objet, String associée a l'objet)
        weakMap.put(objet1, "Exemple");

        System.out.println("Contenu du WeakHashMap avant le GC: " + weakMap);

        // Définition de l'objet à null pour permettre au garbage collector de collecter cet objet (suppression de la clé)
        objet1 = null;

        // Appeler le garbage collector
        System.gc();

        System.out.println("Contenu du WeakHashMap après le GC: " + weakMap);
    }
}
import java.util.Scanner;

/**
 * Vorkurs Programmierung und Softwareentwicklung (PSE) - Tag 1
 * Aufgabe 2: Scanner und Konsoleneingaben
 * 
 * @author Max Wittich
 */
public class Aufgabe_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Teilaufgabe 1: Addierer ---
        // Hinweis: Mit Integer.parseInt(scanner.nextLine()) vermeiden wir Probleme mit dem Zeilenumbruch.
        System.out.println("--- Aufgabe 1: Addierer ---");
        System.out.print("Gib eine Zahl ein: ");
        int zahl1 = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Gib noch eine Zahl ein: ");
        int zahl2 = Integer.parseInt(scanner.nextLine());
        
        int summe = zahl1 + zahl2;
        System.out.println("Die Summe ist: " + summe);
        
        System.out.println("\n-----------------------------------\n");

        // --- Teilaufgabe 2: Modulo-Übungsprogramm ---
        System.out.println("--- Aufgabe 2: Modulo ---");
        System.out.print("Gib eine Zahl ein: ");
        int modZahl1 = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Gib noch eine Zahl ein: ");
        int modZahl2 = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Gib dein Ergebnis ein: ");
        int userErgebnis = Integer.parseInt(scanner.nextLine());
        
        int echtesErgebnis = modZahl1 % modZahl2;
        System.out.println("Das richtige Ergebnis von " + modZahl1 + " % " + modZahl2 + " ist: " + echtesErgebnis);

        System.out.println("\n-----------------------------------\n");

        // --- Teilaufgabe 3: Wort-Ersetzungs-Geschichte ---
        System.out.println("--- Aufgabe 3: Lückentext ---");
        System.out.print("Gib ein Thema ein: ");
        String thema = scanner.nextLine();
        
        System.out.print("Gib ein Verb ein: ");
        String verb = scanner.nextLine();
        
        // Originalsatz: "Die PSE-Vorkurs Hauptorgas lieben grillen."
        // Wir ersetzen "PSE-Vorkurs" und "grillen" durch die Eingaben:
        System.out.println("Die " + thema + "-Vorkurs Orgas lieben " + verb + ".");

        scanner.close();
    }
}

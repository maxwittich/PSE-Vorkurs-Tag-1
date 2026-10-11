import java.util.Random;
import java.util.Scanner;

/**
 * Vorkurs Programmierung und Softwareentwicklung (PSE) - Tag 1
 * Aufgabe 4: Aufgeteilt in die Teile 1 bis 4
 * 
 * @author Max Wittich
 */
public class Aufgabe_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rndGenerator = new Random();

        // ==========================================
        // Teilaufgabe 1: Zufallswahl des Computers
        // ==========================================
        // Der Computer generiert eine Zufallszahl (0 = Schere, 1 = Stein, 2 = Papier)
        int computerWahl = rndGenerator.nextInt(3);


        // ==========================================
        // Teilaufgabe 2: Spielereingabe & Grundspiel
        // ==========================================
        // Die Wahl des Nutzers wird per Konsole eingelesen
        System.out.println("--- Teilaufgabe 1 & 2: Schere, Stein, Papier ---");
        System.out.print("Deine Wahl (0 = Schere, 1 = Stein, 2 = Papier): ");
        int spielerWahl = Integer.parseInt(scanner.nextLine());


        // ==========================================
        // Teilaufgabe 3: Auswertung via Modulo-Formel
        // ==========================================
        // Berechnung über eine einzige Rechenformel, ohne direkte Variablenvergleiche im if
        int ergebnis = (spielerWahl - computerWahl + 3) % 3;

        if (ergebnis == 0) {
            System.out.println("Ergebnis Teil 3: Unentschieden!\n");
        } else if (ergebnis == 1) {
            System.out.println("Ergebnis Teil 3: Gewonnen!\n");
        } else {
            System.out.println("Ergebnis Teil 3: Verloren!\n");
        }


        // ==========================================
        // Teilaufgabe 4: Erweiterung um Echse & Spock
        // ==========================================
        // Erweiterung auf 5 Symbole (0 bis 4) und angepasste Modulo-Formel
        System.out.println("--- Teilaufgabe 4: Echse & Spock Erweiterung ---");
        System.out.println("0 = Schere, 1 = Papier, 2 = Stein, 3 = Echse, 4 = Spock");
        System.out.print("Deine Wahl (0-4): ");
        int spielerErweitert = Integer.parseInt(scanner.nextLine());
        int computerErweitert = rndGenerator.nextInt(5);

        int ergebnisErweitert = (spielerErweitert - computerErweitert + 5) % 5;

        if (ergebnisErweitert == 0) {
            System.out.println("Ergebnis Teil 4: Unentschieden!");
        } else if (ergebnisErweitert == 1 || ergebnisErweitert == 3) {
            System.out.println("Ergebnis Teil 4: Gewonnen!");
        } else {
            System.out.println("Ergebnis Teil 4: Verloren!");
        }

        scanner.close();
    }
}
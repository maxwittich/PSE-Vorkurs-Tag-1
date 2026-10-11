import java.util.Scanner;

/**
 * Vorkurs Programmierung und Softwareentwicklung (PSE) - Tag 1
 * Aufgabe 3: Boole'sche Ausdrücke und Verzweigungen
 * 
 * @author Max Wittich
 */
public class Aufgabe_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Teilaufgabe 1: Einlasskontrolle für die UNO ---
        System.out.println("--- Aufgabe 1: Einlasskontrolle ---");
        System.out.print("Wie alt bist du: ");
        int alter = Integer.parseInt(scanner.nextLine());

        if (alter >= 18) {
            System.out.println("Willkommen auf der UNO!");
        } else {
            System.out.println("Sorry, du darfst noch nicht rein :/");
        }

        System.out.println("\n-----------------------------------\n");

        // --- Teilaufgabe 2: Preiskalkulierer (nur für Volljährige) ---
        System.out.println("--- Aufgabe 2: Preiskalkulierer ---");
        if (alter >= 18) {
            System.out.print("Bist du ein Ersti (true oder false eingeben): ");
            boolean istErsti = Boolean.parseBoolean(scanner.nextLine());

            if (istErsti) {
                System.out.println("Für dich sinds 3 Euro");
            } else {
                System.out.println("Für dich sinds 7 Euro");
            }
        } else {
            System.out.println("Du bist unter 18 und darfst leider nicht rein, daher gibts keinen Preis.");
        }

        System.out.println("\n-----------------------------------\n");

        // --- Teilaufgabe 3: Getränke-Kalkulator ---
        System.out.println("--- Aufgabe 3: Getränke-Bestellung ---");
        System.out.print("Wie viel Geld hast du: ");
        int geld = Integer.parseInt(scanner.nextLine());

        System.out.print("Wie viele Shots hättest du gerne: ");
        int shots = Integer.parseInt(scanner.nextLine());

        System.out.print("Wie viele Softdrinks hättest du gerne: ");
        int softdrinks = Integer.parseInt(scanner.nextLine());

        System.out.print("Wie viele Biere hättest du gerne: ");
        int biere = Integer.parseInt(scanner.nextLine());

        // Preise: Shot = 1 Euro, Softdrink = 2 Euro, Bier = 2 Euro
        int gesamtkosten = (shots * 1) + (softdrinks * 2) + (biere * 2);
        System.out.println("Das sind insgesamt " + gesamtkosten + " Euro");

        if (geld >= gesamtkosten) {
            System.out.println("Dein Geld reicht für die Bestellung!");
        } else {
            System.out.println("Du hast zu wenig Geld dabei");
        }

        scanner.close();
    }
}
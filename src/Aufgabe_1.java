/**
 * Vorkurs Programmierung und Softwareentwicklung (PSE) - Tag 1
 * Aufgabe 1: Variablen, Ausgaben und ASCII-Art
 * 
 * @author Max Wittich
 */
public class Aufgabe_1 {
    public static void main(String[] args) {

        // --- Teilaufgabe 1: ASCII-Grill ausgeben ---
        System.out.println(".............");
        System.out.println("......@......");
        System.out.println("......@......");
        System.out.println(".....@..@....");
        System.out.println("....@..@+....");
        System.out.println(".....@..@....");
        System.out.println("......*......");
        System.out.println(".............");
        System.out.println("..@@@@@@@@@@@@@@@@...");
        System.out.println("...@@@@@@@@@@@@@@@@++..");
        System.out.println("....@@@@@@@@@@@@@@...");
        System.out.println(".....@@@@@@@@@@@@-...");
        System.out.println(".......@@@@@@........");
        System.out.println(".....-@.....:@.......");
        System.out.println("......:@......%@.....");
        System.out.println("....@@@@........@@...");
        System.out.println("..@@..@@@@@@@@@@@@...");
        System.out.println("..@@..@@........@@...");
        System.out.println("...@@@@.........@@...");

        System.out.println("\n-----------------------------------\n");

        // --- Teilaufgabe 2: Variable erstellen, ausgeben, ändern, erneut ausgeben ---
        int zahl = 10;
        System.out.println("Alter Wert: " + zahl);
        
        zahl = 42; // Wert ändern
        System.out.println("Neuer Wert: " + zahl);

        System.out.println("\n-----------------------------------\n");

        // --- Teilaufgabe 3: Zwei int-Variablen, Summe und Produkt ---
        int a = 7;
        int b = 5;
        
        int summe = a + b;
        int produkt = a * b;
        
        System.out.println("Summe: " + summe);
        System.out.println("Produkt: " + produkt);

        System.out.println("\n-----------------------------------\n");

        // --- Teilaufgabe 4: Begrüßung mit genau einem Print ---
        String name = "Max";
        System.out.println("Hallo " + name + "!");
    }
}
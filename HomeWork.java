import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);

        System.out.println ("Wie viele Packete wollen Sie senden?");
        int Anzahl = S.nextInt();
        System.out.println("Gewicht der Packete in kg");
        double Gewicht = S.nextDouble();
        System.out.println("Voller Name?");
        S.nextLine();
        String Name = S.nextLine();
        System.out.println ("Empfängeradresse?");
        String Adresse = S.nextLine();


        double insgGewicht = Anzahl * Gewicht;


        String  label = "Voller Name: " + Name + "\n"
                + "Adresse: " + Adresse + "\n"
                + "Insg. Gewicht: " + insgGewicht + "\n";

        System.out.println(label);


        System.out.println("Ist alles richtig? ja/nein");
        boolean correct = S.nextBoolean();






    }
}

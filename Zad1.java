import java.util.Scanner;

public class ŚredniaOcenLosowe {

    private static final int LICZBA_PRZEDMIOTÓW = 5;
    private static final int MAX_OCENA = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Losowe generowanie ocen
        double[] oceny = new double[LICZBA_PRZEDMIOTÓW];
        for (int i = 0; i < LICZBA_PRZEDMIOTÓW; i++) {
            oceny[i] = random.nextDouble() * MAX_OCENA;
        }

        // Losowe generowanie pytań
        String[] pytania = new String[LICZBA_PRZEDMIOTÓW];
        for (int i = 0; i < LICZBA_PRZEDMIOTÓW; i++) {
            pytania[i] = "Podaj ocenę z przedmiotu " + (i + 1) + ": ";
        }

        // Wyświetlanie pytań i pobieranie odpowiedzi
        for (int i = 0; i < LICZBA_PRZEDMIOTÓW; i++) {
            System.out.println(pytania[i]);
            oceny[i] = scanner.nextDouble();
        }

        // Obliczanie średniej
        double średnia = 0;
        for (double ocena : oceny) {
            średnia += ocena;
        }

        średnia /= LICZBA_PRZEDMIOTÓW;

        // Wyświetlanie wyników
        System.out.println("Oceny:");
        for (double ocena : oceny) {
            System.out.println(ocena);
        }

        System.out.println("Średnia: " + średnia);
    }
}

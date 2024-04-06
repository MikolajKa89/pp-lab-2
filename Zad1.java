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

        // Wyświetlanie pytań i pobieranie odpowiedzi
        for (int i = 0; i < LICZBA_PRZEDMIOTÓW; i++) {
            System.out.println("Podaj ocenę z przedmiotu " + (i + 1) + ": ");
            oceny[i] = scanner.nextDouble();
        }

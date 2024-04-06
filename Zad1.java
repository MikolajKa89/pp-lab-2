import java.util.Scanner;

public class ŚredniaOcen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę przedmiotów: ");
        int liczbaPrzedmiotów = scanner.nextInt();

        double[] oceny = new double[liczbaPrzedmiotów];

        for (int i = 0; i < liczbaPrzedmiotów; i++) {
            System.out.println("Podaj ocenę z przedmiotu " + (i + 1) + ": ");
            oceny[i] = scanner.nextDouble();
        }

        double średnia = 0;
        for (double ocena : oceny) {
            średnia += ocena;
        }

        średnia /= liczbaPrzedmiotów;

        System.out.println("Średnia ocen: " + średnia);
    }
}


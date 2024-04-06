import java.util.Scanner;

public class SredniaArytmetyczna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        // Wczytaj liczbę liczb
        System.out.println("Podaj liczbę liczb do uśrednienia: ");
        int liczbaLiczb = 3; // Wstawiona wartość: 3
    
        //  tablicę do przechowywania liczb
        double[] liczby = new double[liczbaLiczb];
    
        // Wczytaj wartości liczb
        for (int i = 0; i < liczbaLiczb; i++) {
            System.out.println("Podaj " + (i + 1) + ". liczbę: ");
            liczby[i] = scanner.nextDouble();
        }
    
        // Oblicz sumę liczb
        double suma = 0;
        for (double liczba : liczby) {
            suma += liczba;
        }
    
        // Oblicz średnią arytmetyczną
        double srednia = suma / liczbaLiczb;
    
        // Wyświetl wynik
        System.out.println("Średnia arytmetyczna: " + srednia);
    }
    

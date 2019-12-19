package pl.bci.g73.ITCAMP.ZadaniaCAMP.Sortowanie;

import java.util.Scanner;

/**
 * Created by Gerard Podgórski on 03-12-19 [NowyProjekt/ZadaniaCAMP.Sortowanie]
 */
public class App {

    public static void main(String[] args) {
        int tableSize;
        int highestNumberAbs;
        int numberOfArrays;

        if (args.length != 0) {
            numberOfArrays = Integer.parseInt(args[0]);
            tableSize = Integer.parseInt(args[1]);
            highestNumberAbs = Integer.parseInt(args[2]);

        } else {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Podaj ilość tablic:");
            numberOfArrays = scanner.nextInt();

            System.out.print("Podaj rozmiar tablicy:");
            tableSize = scanner.nextInt();
            System.out.print("Podaj najwyższą liczbę:");
            highestNumberAbs = scanner.nextInt();

            System.out.print("");
        }

        for (int i = 0; i < numberOfArrays; i++) {
            new ThreadTest(tableSize, highestNumberAbs).start();
        }
    }
}

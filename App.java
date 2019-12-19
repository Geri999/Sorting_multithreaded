package pl.bci.g73.ITCAMP.ZadaniaCAMP.Sortowanie;

import java.util.Scanner;

import static java.lang.System.nanoTime;

/**
 * Created by Gerard Podgórski on 03-12-19 [NowyProjekt/ZadaniaCAMP.Sortowanie]
 */
public class App {

    public static void main(String[] args) {
        int tableSize;
        int highestNumberAbs;
        int numberOfArrays;

        if (args.length != 0) {
            tableSize = Integer.parseInt(args[0]);
            highestNumberAbs = Integer.parseInt(args[1]);
            numberOfArrays = Integer.parseInt(args[2]);

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

            long time0 = nanoTime();

            int[] tableOryginal = TableGeneratorInt.tableGeneratorInt(tableSize, highestNumberAbs);
            int[] tableSortedDesc = TableSorting.tableSortingIntDesc(tableOryginal);
            int[] tableSortedAsc = TableSorting.tableSortingIntAsc(tableOryginal);

            System.out.printf("Całość zajeła %s milisekund\n", (nanoTime() - time0) / 1_000);

            TablePrinter.tablePrinterINT(tableOryginal);
            TablePrinter.tablePrinterINT(tableSortedDesc);
            TablePrinter.tablePrinterINT(tableSortedAsc);
        }
    }
}

package pl.bci.g73.ITCAMP.ZadaniaCAMP.Sortowanie;
/**
 * Created by Gerard Podgórski on 03-12-19 [NowyProjekt/ZadaniaCAMP.Sortowanie]
 */

import java.util.Arrays;

public class TableSorting {

    public static int[] tableSortingIntDesc(int[] tableOryginal) {

        int[] tableSorted = new int[tableOryginal.length];
// by nie psuć oryginalengo obietku (przekazywanego poprzez referencję)
        int[] tableOryginalCopy = Arrays.copyOf(tableOryginal, tableOryginal.length);

        int temporaryBiggest;
        int indeksOfTheBiggestValue = 0;
        int indeks2 = tableOryginalCopy.length;

        for (int i = 0; i < tableSorted.length; i++) {
            temporaryBiggest = tableOryginalCopy[0];  // można np. = Integer.MAX_VALUE i autoboxing na int;
            for (int j = 0; j < indeks2; j++) {
                if (tableOryginalCopy[j] >= temporaryBiggest) {
                    temporaryBiggest = tableOryginalCopy[j];
                    indeksOfTheBiggestValue = j;
                }
            }
            tableSorted[i] = temporaryBiggest;
            tableOryginalCopy[indeksOfTheBiggestValue] = tableOryginalCopy[indeks2 - 1]; // ost. element wchodzi na miejsce
            // tego najwyższego w tym przebiegu.
            indeks2--;  //wirualnie skracamy tablicę o ostatni element

        }
        return tableSorted;
    }

    public static int[] tableSortingIntAsc(int[] tableOryginal) {
        int[] tableSortedDesc = tableSortingIntDesc(tableOryginal);
        int[] tableSortedAsc = new int[tableSortedDesc.length];
        for (int i = 0; i < tableOryginal.length; i++) {
            tableSortedAsc[i] = tableSortedDesc[tableOryginal.length - i - 1];
        }
        return tableSortedAsc;
    }
}

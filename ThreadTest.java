package pl.bci.g73.ITCAMP.ZadaniaCAMP.Sortowanie;

import static java.lang.System.nanoTime;

/**
 * @description:
 * @author: Gerard
 * @date: 19-12-1920:21
 * @version: 1.00
 */
public class ThreadTest extends Thread {

    private int tableSize;
    private int highestNumberAbs;

    public ThreadTest(int tableSize, int highestNumberAbs) {
        this.tableSize = tableSize;
        this.highestNumberAbs = highestNumberAbs;
    }

    @Override
    public void run() {

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

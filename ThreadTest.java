package pl.bci.g73.itcamp.ZadaniaCAMP.sortowanie;

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

        StringBuffer buffer = new StringBuffer();

        buffer.append("\u001B[34m"+Thread.currentThread().getName() + "   "+"\u001B[0m");
        buffer.append("\u001B[32m"+"Całość zajeła " + (nanoTime() - time0) / 1_000 + " milisekund\n"+"\u001B[0m");
//        System.out.printf("Całość zajeła %s milisekund\n", (nanoTime() - time0) / 1_000);

        String all = buffer.toString();
        System.out.println(all);

//        TablePrinter.tablePrinterINT(tableOryginal);
//        TablePrinter.tablePrinterINT(tableSortedDesc);
//        TablePrinter.tablePrinterINT(tableSortedAsc);

        TablePrinter.tablePrinterINTThread(tableOryginal);
        TablePrinter.tablePrinterINTThread(tableSortedDesc);
        TablePrinter.tablePrinterINTThread(tableSortedAsc);
    }
}

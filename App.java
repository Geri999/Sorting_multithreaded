package pl.bci.g73.ITCAMP.ZadaniaCAMP.Sortowanie;
/**
 * Created by Gerard Podgórski on 03-12-19 [NowyProjekt/ZadaniaCAMP.Sortowanie]
 */
public class App {

    public static void main(String[] args) {

        int[] tableOryginal = TableGeneratorInt.tableGeneratorInt(10, 100);
        int[] tableSortedDesc = TableSorting.tableSortingIntDesc(tableOryginal);
        int[] tableSortedAsc = TableSorting.tableSortingIntAsc(tableOryginal);

        TablePrinter.tablePrinterINT(tableOryginal);
        TablePrinter.tablePrinterINT(tableSortedDesc);
        TablePrinter.tablePrinterINT(tableSortedAsc);

    }
}

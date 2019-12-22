package pl.bci.g73.itcamp.ZadaniaCAMP.sortowanie;
/**
 * Created by Gerard Podgórski on 03-12-19 [NowyProjekt/ZadaniaCAMP.Sortowanie]
 */
public class TablePrinter {

    public static void tablePrinterINT(int[] table) {
        System.out.print(Thread.currentThread().getName());
        System.out.print(" - Tablica " + table.length + "-elementowa: ");

        System.out.print("[");
        for (int i = 0; i < table.length - 1; i++) {
            System.out.print(table[i] + ", ");
        }
        System.out.println(table[table.length - 1] + "]"); // by nie było przecinka po ostatnim elemencie
    }
//--------------------------------------------------------------------------------------------

    public static void tablePrinterINTThread(int[] table) {//wersja zsynchronizowana
        StringBuffer buffer = new StringBuffer();

        buffer.append("\u001B[34m"+Thread.currentThread().getName()+"\u001B[0m");
        buffer.append(" - Tablica " + table.length + "-elementowa: ");

        buffer.append("[");
        for (int i = 0; i < table.length - 1; i++) {
            buffer.append(table[i] + ", ");
        }
        buffer.append(table[table.length - 1] + "]"); // by nie było przecinka po ostatnim elemencie

        String all = buffer.toString();
        System.out.println(all);
    }


}

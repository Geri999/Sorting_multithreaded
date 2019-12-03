package ZadaniaCAMP.Sortowanie;
/**
 * Created by Gerard Podgórski on 03-12-19 [NowyProjekt/ZadaniaCAMP.Sortowanie]
 */
public class TablePrinter {

    public static void tablePrinterINT(int[] table){
        System.out.print("Tablica "+table.length+"-elementowa: ");
        System.out.print("[");
        for (int i = 0; i <table.length-1 ; i++) {
            System.out.print(table[i]+", ");
        }
        System.out.println(table[table.length-1]+"]"); // by nie było przecinka po ostatnim elemencie
    }
}

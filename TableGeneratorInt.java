package Sortowanie;
/**
 * Created by Gerard Podgórski on 03-12-19 [NowyProjekt/Sortowanie]
 */

public class TableGeneratorInt {

    static public int[] tableGeneratorInt(int tableSize, int highestNumberAbs) {

        int[] table = new int[tableSize];

        for (int i = 0; i < tableSize; i++) {
            table[i] = (int) (Math.random() * (highestNumberAbs + 1))*(Math.random()>0.5? 1:-1);
        }

        return table;
    }


}

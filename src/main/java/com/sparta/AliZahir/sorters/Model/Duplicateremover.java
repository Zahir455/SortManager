package com.sparta.AliZahir.sorters.Model;

import java.util.LinkedHashSet;

public class Duplicateremover {

    public int[] removeDups(int[] arrayTOSort) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < arrayTOSort.length; i++) {
            set.add(arrayTOSort[i]);
        }

        int[] arraySorted = new int[set.size()];

        int k = 0;
        for (Integer i : set) {
            int x = i;
            arraySorted[k] = x;
            k++;
        }
        return arraySorted;
    }
}

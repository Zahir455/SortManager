package com.sparta.AliZahir.sorters.Model;

import com.sparta.AliZahir.sorters.Controller.Factory;
import com.sparta.AliZahir.sorters.Sorter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class BubbleSort implements Sorter {

    public static Logger logger = LogManager.getLogger(Factory.class);

    @Override
    public int[] sortArray(int[] arrayToSort) {
        logger.info("Starting array: " + Arrays.toString(arrayToSort));

        int y;
        for (int i = 0; i < arrayToSort.length - 1; i++) {
            for (int j = 0; j < arrayToSort.length - 1; j++) {
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    y = arrayToSort[j + 1];
                    arrayToSort[j + 1] = arrayToSort[j];
                    arrayToSort[j] = y;
                    logger.info("Bubble sort: "+ Arrays.toString(arrayToSort));
                }
            }
        }

        Duplicateremover duplicateremover = new Duplicateremover();
        return (duplicateremover.removeDups(arrayToSort));
    }
}



package com.sparta.AliZahir.sorters.Model;

import com.sparta.AliZahir.sorters.Controller.Factory;
import com.sparta.AliZahir.sorters.Sorter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class MergeSort implements Sorter {

    public static Logger logger = LogManager.getLogger(Factory.class);

    @Override
    public int[] sortArray(int[] arrayToSort) {

        int length = arrayToSort.length;

        if(length<2){
            return null;
        }

        int middle = length/2;

        int[] leftArray = new int[middle];
        int[] rightArray = new int[length-middle];

        for(int i=0;i<middle;i++){
            leftArray[i]=arrayToSort[i];
        }

        for(int i=middle;i<length;i++){
            rightArray[i-middle]=arrayToSort[i];
        }

        sortArray(leftArray);
        sortArray(rightArray);

        merge(arrayToSort, leftArray, rightArray);

        Duplicateremover duplicateremover = new Duplicateremover();
        return (duplicateremover.removeDups(arrayToSort));
    }

    private static void merge(int[]result, int[]leftArray, int[]rightArray){
        int  leftlength = leftArray.length;
        int rightlength = rightArray.length;

        int i=0;
        int j=0;
        int k=0;


        while (i<leftlength && j < rightlength){
            if(leftArray[i]<= rightArray[j]){
                result[k] = leftArray[i];
                i++;
            }
            else {
                result[k]= rightArray[j];
                j++;
            }
            k++;
        }
        while (i<leftlength){
            result[k] = leftArray[i];
            i++;
            k++;
        }
        while (j<rightlength){
            result[k] = rightArray[j];
            j++;
            k++;
        }
        logger.info("Merge sort: "+ Arrays.toString(result));
    }
}

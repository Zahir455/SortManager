package com.sparta.AliZahir.sorters.Controller;

import com.sparta.AliZahir.sorters.Model.BinarySort;
import com.sparta.AliZahir.sorters.Model.BubbleSort;
import com.sparta.AliZahir.sorters.Model.MergeSort;

import java.util.Arrays;

public class Factory {

    public int[] bubbleSort(int[]test){
        BubbleSort bubble = new BubbleSort();
        return (bubble.sortArray(test));
    }
    public int[] mergeSort(int[]test){
        MergeSort merge = new MergeSort();
        return (merge.sortArray(test));
    }
    public int[] binarySort(int[]test){
        BinarySort binary = new BinarySort();
        return (binary.sortArray(test));
    }

    public String compare(){
        BubbleSort bubble = new BubbleSort();
        MergeSort merge = new MergeSort();

        long bubbleStart = System.nanoTime();

        long bubbleFinish = System.nanoTime();
        long bubbleTime = bubbleFinish-bubbleStart;

        long mergeStart = System.nanoTime();

        long mergeFinish = System.nanoTime();
        long mergeTime = mergeFinish-mergeStart;

        String result ="Bubble: " + bubbleTime + "\nMerger: " + mergeTime;
        return result;
    }
}

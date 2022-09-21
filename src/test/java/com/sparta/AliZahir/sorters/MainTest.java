package com.sparta.AliZahir.sorters;

import com.sparta.AliZahir.sorters.Model.BinarySort;
import com.sparta.AliZahir.sorters.Model.BubbleSort;
import com.sparta.AliZahir.sorters.Model.MergeSort;
import com.sparta.AliZahir.sorters.View.ViewManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    public void testbubbleodd(){
        int[] test = {9,4,3,7,17,1,0};
        BubbleSort bubbleSort=new BubbleSort();
        int [] result = bubbleSort.sortArray(test);
        Assertions.assertArrayEquals(new int[]{0,1,3,4,7,9,17},result);
    }

    @Test
    public void testbubblempty(){
        int[] test = {};
        BubbleSort bubbleSort=new BubbleSort();
        int [] result = bubbleSort.sortArray(test);
        Assertions.assertArrayEquals(new int[]{},result);
    }

    @Test
    public void testbubblelargenumbers(){
        int[] test = {12363,837264,9088736,974682,48888,92643729};
        BubbleSort bubbleSort=new BubbleSort();
        int [] result = bubbleSort.sortArray(test);
        Assertions.assertArrayEquals(new int[]{12363,48888, 837264, 974682, 9088736, 92643729},result);
    }

    @Test
    public void testMergeEmpty(){
        int[] test = {};
        MergeSort mergeSort = new MergeSort();
        int [] result = mergeSort.sortArray(test);
        Assertions.assertArrayEquals(new int[]{},result);
    }

    @Test
    public void testMergeSmall(){
        int[] test = {2,1};
        MergeSort mergeSort = new MergeSort();
        int [] result = mergeSort.sortArray(test);
        Assertions.assertArrayEquals(new int[]{1,2},result);
    }

    @Test
    public void testBinaryEmpty(){
        int[] test = {};
        BinarySort binarySort = new BinarySort();
        int [] result = binarySort.sortArray(test);
        Assertions.assertArrayEquals(new int[]{},result);
    }

    @Test
    public void testWrongArrayLength(){
        ViewManager viewManager =new ViewManager();
        viewManager.options();
    }


}
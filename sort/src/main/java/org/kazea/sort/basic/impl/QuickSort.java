package org.kazea.sort.basic.impl;

import org.kazea.sort.basic.Sort;

/**
 * 快速排序
 */
public class QuickSort implements Sort {

    @Override
    public void sort(int[] array) {
        System.out.println("use QuickSort");
        sort(array, 0, array.length-1);
    }

    public void sort(int[] array, int start, int end) {

        if(start >= end) return;

        int base = array[start];
        int low = start;
        int high = end;

        while(low < high){
            while(low < high && array[high] >= base) high--;
            array[low] = array[high];

            while(low < high && array[low] <= base) low++;
            array[high] = array[low];

        }
        array[low] = base;

        sort(array, start, low-1);
        sort(array, low+1, end);

    }

}

package org.kazea.sort.basic.impl;

import org.kazea.sort.basic.Sort;

/**
 * 快速排序
 */
public class QuickSort<T extends Comparable> implements Sort<T> {

    @Override
    public void sort(T[] array) {
        System.out.println("use QuickSort");
        sort(array, 0, array.length-1);
    }

    public void sort(T[] array, int start, int end) {

        if(start >= end) return;

        T base = array[start];
        int low = start;
        int high = end;

        while(low < high){
            while(low < high && array[high].compareTo(base) >= 0) high--;
            array[low] = array[high];

            while(low < high && array[low].compareTo(base) <= 0) low++;
            array[high] = array[low];

        }
        array[low] = base;

        sort(array, start, low-1);
        sort(array, low+1, end);

    }

}

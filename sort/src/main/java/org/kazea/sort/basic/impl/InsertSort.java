package org.kazea.sort.basic.impl;

import org.kazea.sort.basic.Sort;

/**
 * 插入排序
 */
public class InsertSort<T extends Comparable> implements Sort<T> {

    @Override
    public void sort(T[] array) {
        System.out.println("use InsertSort");

        for(int i=1; i< array.length-1; i++){
            T current = array[i];
            int j = i-1;
            for(; j>=0 && current.compareTo(array[j]) < 0; j--){
                array[j+1] = array[j];
            }
            array[j+1] = current;
        }
    }

}

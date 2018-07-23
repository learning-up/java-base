package org.kazea.sort.basic.impl;

import org.kazea.sort.basic.Sort;

/**
 * 插入排序
 */
public class InsertSort implements Sort {

    @Override
    public void sort(int[] array) {
        System.out.println("use InsertSort");

        for(int i=1; i< array.length-1; i++){
            int current = array[i];
            int j = i-1;
            for(; j>=0 && current < array[j]; j--){
                array[j+1] = array[j];
            }
            array[j+1] = current;
        }
    }

}

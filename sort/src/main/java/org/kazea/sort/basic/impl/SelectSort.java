package org.kazea.sort.basic.impl;

import org.kazea.sort.basic.Sort;

/**
 * 选择排序
 */
public class SelectSort implements Sort {
    @Override
    public void sort(int[] array) {
        System.out.println("use SelectSort");
        for(int i=0; i<array.length; i++){
            int index = i;
            for(int j=i; j<array.length; j++){
                if(array[j] < array[index])
                    index = j;
            }
            swap(array, i, index);
        }
    }
}

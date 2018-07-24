package org.kazea.sort.basic.impl;

import org.kazea.sort.basic.Sort;

/**
 * 选择排序
 */
public class SelectSort<T extends Comparable> implements Sort<T> {
    @Override
    public void sort(T[] array) {
        System.out.println("use SelectSort");
        for(int i=0; i<array.length; i++){
            int index = i;
            for(int j=i; j<array.length; j++){
                if(array[j].compareTo(array[index]) < 0)
                    index = j;
            }
            swap(array, i, index);
        }
    }
}

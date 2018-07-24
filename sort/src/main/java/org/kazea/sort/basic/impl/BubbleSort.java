package org.kazea.sort.basic.impl;

import org.kazea.sort.basic.Sort;

/**
 * 冒泡排序
 */
public class BubbleSort<T extends Comparable> implements Sort<T> {

    @Override
    public  void sort(T[] array) {
        System.out.println("use BubbleSort");

        for(int i=0; i<array.length; i++){
            for(int j=i; j<array.length; j++){
                if(array[j].compareTo(array[i]) < 0){
                    swap(array, i, j);
                }
            }
        }
    }

}

package org.kazea.sort.basic.impl;

import org.kazea.sort.basic.Sort;

/**
 * 冒泡排序
 */
public class BubbleSort implements Sort {

    @Override
    public void sort(int[] array) {

        System.out.println("use BubbleSort");

        for(int i=0; i<array.length; i++){
            for(int j=i; j<array.length; j++){
                if(array[j] < array[i]){
                    swap(array, i, j);
                }
            }
        }

    }

}

package org.kazea.sort.basic.impl;

import org.kazea.sort.basic.Sort;

/**
 * 归并排序
 */
public class MergeSort implements Sort {
    @Override
    public void sort(int[] array) {
        System.out.println("use MergeSort");
        sort(array, 0, array.length-1);
    }

    private void sort(int[] array, int start, int end){

        if(start >= end) return;

        int middle = (start + end)/2;

        sort(array, start, middle);
        sort(array, middle + 1, end);
        merge(array, start, middle, end);

    }

    private void merge(int[] array, int start, int middle, int end){

        int[] tempArray = new int[end-start+1];
        int index = 0;

        int left = start;
        int right = middle+1;

        while(left <= middle && right <= end){
            if(array[left] < array[right]) {
                tempArray[index++] = array[left++];
            } else {
                tempArray[index++] = array[right++];
            }
        }

        while(left <= middle) tempArray[index++] = array[left++];

        while(right <= end)   tempArray[index++] = array[right++];

        for(int temp=0; temp <= (end-start); temp++){
            array[start + temp] = tempArray[temp];
        }

    }



}

package org.kazea.sort.basic.impl;

import org.kazea.sort.basic.Sort;

/**
 * 希尔排序
 */
public class ShellSort<T extends Comparable> implements Sort<T> {
    @Override
    public void sort(T[] array) {
        System.out.println("use ShellSort");
    }
}

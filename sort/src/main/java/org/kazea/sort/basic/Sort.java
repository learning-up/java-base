package org.kazea.sort.basic;

import java.lang.reflect.InvocationTargetException;

public interface Sort {

    void sort(int[] array);

    default void swap(int[] array, int i, int j){
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }

    static Sort getInstance(SortType type){

        try {
            return (Sort) Class.forName(type.getFullClassPath()).getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    enum SortType {
          Insert, Shell, Select, Heap, Bubble, Quick, Merge, Radix;

          public String getFullClassPath(){
              return "org.kazea.sort.basic.impl." + this.name() + "Sort";
          }
    }

}

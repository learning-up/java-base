package org.kazea.sort.basic;


public class App {

    private static final int[] NUMBERS =
            {49, 38, 65, 97, 76, 13, 27, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51};

    public static void main( String[] args ) {

        //==============================================
        Sort sort = Sort.getInstance(Sort.SortType.Quick);
        //==============================================

        long start = System.currentTimeMillis();

        sort.sort(NUMBERS);

        for (int number : NUMBERS) {
            System.out.print( number  );
            System.out.print( "\t"  );
        }

        System.out.println();
//        System.out.println( System.currentTimeMillis() - start  );
    }

}

package com.dsa.challenges;

import java.util.Arrays;
import java.util.Comparator;

public class SortEvenFirst {

    public static void main(String[] args) {
        Integer [] array = {1,2,3,4,5,6};

        Arrays.sort(array,new EvenComparator());
        System.out.println(Arrays.toString(array));
    }

}

class EvenComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1%2 - o2%2;
    }
}

package com.dsa.challenges;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class InterSectionOfTwoArrays {
    public static void main(String[] args) {
      Integer[] a1 = {1,1,3,3,3};
      Integer[] a2 = {1,1,1,3,5,7};

        Set<Integer> set1 = new LinkedHashSet<>(Arrays.asList(a1));
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(a2));

        System.out.println(set1);
        System.out.println(set2);

        for (Integer i: set1) {
            if(set2.contains(i)){
                System.out.println(i);
        }
        }

    }


}

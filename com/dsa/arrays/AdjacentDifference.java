package com.dsa.arrays;

import java.util.ArrayList;

public class AdjacentDifference {
    public static void main(String[] args) {
        int[] array = {10,-3,-4,7,6,5,-4,-1};
        System.out.println(minAbsoluteDifference(array));
    }

    static int minAbsoluteDifference(int[] array){
        ArrayList<Integer> diffs = new ArrayList<>();
        for (int i = 0; i < array.length-1; i++){
            int absoluteDifference = Math.abs(array[i] - array[i+1]);
            diffs.add(absoluteDifference);
        }
        diffs.add(Math.abs(array[array.length-1] - array[0]));
        System.out.println(diffs);
        return diffs.stream().min(Integer::compare).get();
    }
}

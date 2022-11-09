package com.dsa.arrays;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MaximumAppearingElement {

    public static void main(String[] args) {
       int[] left = {1,2};
       int[] right = {5,4};
       maxElement(left,right);
    }

    static void maxElement(int[] left, int[] right){
        List<ArrayList<Integer>> ranges = new ArrayList<>();
        for (int i = 0; i < left.length; i++){
            ArrayList<Integer> collect = (ArrayList<Integer>) IntStream.range(left[i], right[i] + 1).boxed().collect(Collectors.toList());
            ranges.add(collect);
        }
        HashMap<Integer,Integer> map = new LinkedHashMap<>();
        for (ArrayList<Integer> range : ranges){
            for(int i = 0 ; i < range.size(); i++){
                if (map.containsKey(range.get(i))){
                    map.put(range.get(i),map.get(range.get(i))+1);
                }else {
                    map.put(range.get(i),1);
                }
            }
        }
        int max = 0;
        int result = 0;
        for (Map.Entry<Integer,Integer> elements : map.entrySet()){
            if (elements.getValue() > max){
                max = elements.getValue();
                result = elements.getKey();
            }
        }
        System.out.println(ranges);
        System.out.println(map);
        System.out.println(result);
    }
}

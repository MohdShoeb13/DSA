package com.dsa.leetcode;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length;i++){
            map.put(nums[i],i);
        }

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int rem = target - num;
            if(map.containsKey(rem)){
                int index = map.get(rem);
                if(index == i) continue;
                System.out.println("["+i+","+index+"]");
                break;
            }
        }
    }
}

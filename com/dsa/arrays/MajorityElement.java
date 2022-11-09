package com.dsa.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
      int[] array = {1,4,1,6,1};
//        System.out.println(majorityElement(array));
        hashMajority(array);
    }

    static int majorityElement(int[] array){

        for(int i = 0; i < array.length; i++){
            int count = 1;
            for(int j = i + 1; j < array.length; j++){
                if (array[i] == array[j]){
                    count++;
                }
            }
            if (count > array.length/2){
                return i;
            }
        }
        return -1;
    }

  static void hashMajority(int[] array){
      Map<Integer,Integer> map = new HashMap<>();
      for (int j : array) {
          if (map.containsKey(j)) {
              map.put(j, map.get(j) + 1);
          } else {
              map.put(j, 1);
          }
      }
      int majority = -1;
      int max = 0;
      for (Map.Entry<Integer,Integer> entry : map.entrySet()){
          if(max < entry.getValue()){
              max = entry.getValue();
              majority = entry.getKey();
          }
      }
      if(max > array.length/2){
          System.out.println(majority);
      }else {
          System.out.println("No Majority");
      }
  }

    static int findMajority(int arr[], int n)
    {
        int res = 0, count = 1;

        for(int i = 1; i < n; i++)
        {
            if(arr[res] == arr[i])
                count++;
            else
                count --;

            if(count == 0)
            {
                res = i; count = 1;
            }
        }

        count = 0;

        for(int i = 0; i < n; i++)
            if(arr[res] == arr[i])
                count++;

        if(count <= n /2)
            res = -1;

        return res;
    }
}

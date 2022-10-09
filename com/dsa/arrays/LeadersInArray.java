package com.dsa.arrays;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] array = {11,1,7,8,3,4,5,2};
        leadersEfficient(array);
    }

    static void leaders(int[] array){
        for (int i = 0; i < array.length; i++){
            boolean leader = true;
            for (int j = i+1; j < array.length; j++){
                 if(array[j] > array[i]){
                     leader = false;
                     break;
                 }
            }
            if (leader){
                System.out.print(array[i] + " ");
            }
        }
    }

    static void leadersEfficient(int[] array){
        int currentLeader = array[array.length-1];
        System.out.print(currentLeader+" ");
        for (int i = array.length-2; i >= 0; i--){
            if (array[i] > currentLeader){
                currentLeader = array[i];
                System.out.print(currentLeader+" ");
            }
        }
    }
}

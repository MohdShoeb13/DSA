package com.dsa.search;

public class CountNumberOfOccurrence {

    public static void main(String[] args) {
        int[] array = {1,2,3,3,4,4,4,4,4,4,4,4,4,4,4,4,4,5,5,5,5,5,5,5};
        System.out.println(optimizedSolution(array,3));
    }

    static int countOccurrence(int[] array, int number){
        int occurrences = 0;

        for(int element: array){
            if (element == number) occurrences++;
            if (occurrences > 0 && element != number) break;
        }

        return occurrences;
    }

    static int optimizedSolution(int[] array, int number){
        int first = IndexOfFirstOccurrence.indexOfFirstBinary(array,number);
        if (first == -1){
            return 0;
        }else {
            int last = IndexOfLastOccurrence.lastOccurrenceIndex(array,number);
            return (last-first+1);
        }
    }
}

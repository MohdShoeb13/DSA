package com.dsa.challenges;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Objects;

public class SortUrls {

    public static void main(String[] args) {
        String[] urls = {"url1", "url2", "url3", "url1","url2","url2","url3"};

        System.out.println(Arrays.toString(sortedUrls(urls)));
    }


    static String[] sortedUrls(String[] urls){
        HashMap<String, Integer> map = new HashMap<>();

        for(String url : urls){
            if(!map.containsKey(url)){
                map.put(url,0);
            }
            map.put(url, map.get(url) +1);
        }
        String[] array = new String[map.size()];

        int index = 0;
        for(String url : map.keySet()){
            array[index++] = url;
        }

        Arrays.sort(array, (o1, o2) -> {
            if(Objects.equals(map.get(o1), map.get(o2))) return o1.compareTo(o2);
            return (map.get(o2) - map.get(o1));
        });
        return array;
    }
}

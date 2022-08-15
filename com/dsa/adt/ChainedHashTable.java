package com.dsa.adt;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {

    private LinkedList<Entry>[] hashtable;

    public ChainedHashTable(){
        this.hashtable = new LinkedList[10];
        for(int i = 0; i  < hashtable.length; i++){
            hashtable[i] = new LinkedList<Entry>();
        }
    }

    private int hashKey(String key){
        return Math.abs(key.hashCode() % hashtable.length);
    }

    private class Entry{
        private String key;
        private String value;

        public Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "(" +
                    "key='" + key + '\'' +
                    ", value='" + value + '\'' +
                    ')';
        }
    }

    public void put(String key, String value){
        int hashedKey = hashKey(key);
        hashtable[hashedKey].add(new Entry(key,value));
    }

    public String get(String key){
        int hashedKey = hashKey(key);
        ListIterator<Entry> iterator = hashtable[hashedKey].listIterator();
        Entry entry = null;
        while (iterator.hasNext()){
            entry = iterator.next();
            if(entry.getKey().equals(key)){
                return  entry.getValue();
            }
        }
        return null;
    }

    public String remove(String key){
        int hashedKey = hashKey(key);
        ListIterator<Entry> iterator = hashtable[hashedKey].listIterator();
        int index = -1;
        Entry entry = null;
        while (iterator.hasNext()){
            entry = iterator.next();
            index++;
            if(entry.getKey().equals(key)){
                break;
            }
        }

        if(entry == null || !entry.getKey().equals(key)) {
            return  null;
        }else {
            hashtable[hashedKey].remove(index);
            return  entry.getValue();
        }
    }

    public void printList(){
        System.out.print("{");
        for (int i = 0; i < hashtable.length; i++){
            if(hashtable[i].isEmpty()){
                 continue;
            }else {
                ListIterator<Entry> listIterator = hashtable[i].listIterator();
                while (listIterator.hasNext()){
                    System.out.print(listIterator.next()+",");
                }
            }

        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        ChainedHashTable chainedHashTable = new ChainedHashTable();
        chainedHashTable.put("Java", "Spring");
        chainedHashTable.put("JS","Node");
        chainedHashTable.put("python","django");
        chainedHashTable.printList();
    }
}

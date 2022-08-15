package com.dsa.adt;

public class SimpleHashTable {

    private Entry[] hashtable;

    public SimpleHashTable(){
        this.hashtable = new Entry[10];
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

    private int hashKey(String key){
        return key.length() % hashtable.length;
    }

    public void put(String key, String value){
        int hashedKey = hashKey(key);

        if(isOccupied(hashedKey)){
            int stopIndex = hashedKey;
            if(hashedKey == hashtable.length -1){
                hashedKey = 0;
            }else {
                hashedKey++;
            }

            while (isOccupied(hashedKey) && hashedKey != stopIndex){
                hashedKey = (hashedKey+1) % hashtable.length;
            }
        }

        if(isOccupied(hashedKey)){
            System.err.println("Value is Already present at position " + hashedKey );
        }else {
            hashtable[hashedKey] = new Entry(key,value);
        }
    }

    private int findKey(String key){
        int hashedKey = hashKey(key);
        if(hashtable[hashedKey] != null && hashtable[hashedKey].getKey().equals(key)){
            return hashedKey;
        }
        int stopIndex = hashedKey;
        if(hashedKey == hashtable.length -1){
            hashedKey = 0;
        }else {
            hashedKey++;
        }

        while (hashedKey != stopIndex && hashtable[hashedKey] != null && !hashtable[hashedKey].getKey().equals(key)){
            hashedKey = (hashedKey+1) % hashtable.length;
        }

        if(hashtable[hashedKey] != null && hashtable[hashedKey].getKey().equals(key)){
            return hashedKey;
        }else {
            return -1;
        }
    }

    private boolean isOccupied(int index){
        return hashtable[index] != null;
    }

    public String get(String key){
        int hashedKey = findKey(key);

        if(hashedKey == -1){
            return null;
        }
        return hashtable[hashedKey].getValue();
    }

    public String remove(String key){
        int hashedKey = findKey(key);
        if(hashedKey == -1){
            return null;
        }

        String value = hashtable[hashedKey].getValue();
        hashtable[hashedKey] = null;
        Entry[] oldHashTable = hashtable;
        hashtable = new Entry[oldHashTable.length];
        for(int i = 0; i < oldHashTable.length; i++){
            if(oldHashTable[i] != null){
                put(oldHashTable[i].getKey(), oldHashTable[i].getValue());
            }
        }
        return value;
    }

    public void printHashTable(){
        System.out.print("{");
        for (Entry value:
             hashtable ) {
            if(value!=null){
                System.out.print(value+",");
            }
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        SimpleHashTable simpleHashTable = new SimpleHashTable();
        simpleHashTable.put("Ryu", "Shroyuken");
        simpleHashTable.put("Ken", "JAKSJAKJSK");
        simpleHashTable.put("Akuma","99deaths");
        simpleHashTable.put("chun-li","lattee");
        simpleHashTable.put("12345", "tatty");

        simpleHashTable.remove("12345");
        simpleHashTable.printHashTable();
        simpleHashTable.get("12345");

    }
}

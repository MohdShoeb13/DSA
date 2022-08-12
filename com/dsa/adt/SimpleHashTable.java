package com.dsa.adt;

public class SimpleHashTable {

    private String[] hashtable;

    public SimpleHashTable(){
        this.hashtable = new String[10];
    }

    private int hashKey(String key){
        return key.length() % hashtable.length;
    }

    public void put(String key, String value){
        int hashedKey = hashKey(key);
        if(hashtable[hashedKey] != null){
            System.err.println("Value is Already present at position " + hashedKey );
        }else {
            hashtable[hashedKey] = value;
        }
    }

    public String get(String key){
        int hashedKey = hashKey(key);
        return hashtable[hashedKey];
    }

    public void printHashTable(){
        System.out.print("{");
        for (String value:
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

        simpleHashTable.printHashTable();
        System.out.println(simpleHashTable.get("0000000"));
    }
}

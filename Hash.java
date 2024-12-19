package org.example;
import java.util.ArrayList;
import java.util.HashMap;

public class Hash {
    private final ArrayList<Object>[] hashTable;
    private final HashMap<Integer, Object> hashMap;

    public Hash() {
        hashTable = new ArrayList[10];
        for (int i = 0; i < hashTable.length; i++) {
            hashTable[i] = new ArrayList<>();
        }
        hashMap = new HashMap<>();
    }
    public void add(Object obj) {
        int key = obj.hashCode();
        int index = getIndex(key);

        ArrayList<Object> list = hashTable[index];
        list.add(obj);
        hashMap.put(key, obj);
    }
    private int getIndex(int key) {
        int index = key % hashTable.length;
        if (index < 0) {
            index += hashTable.length;
        }
        return index;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < hashTable.length; i++) {
            ArrayList<Object> list = hashTable[i];
            for (Object obj : list) {
                if (obj instanceof Person person) {
                    sb.append(i).append(": ").append(person.toString()).append("\n");
                } else {
                    sb.append(i).append(": ").append(obj.toString()).append("\n");
                }
            }
        }
        return sb.toString();
    }
}

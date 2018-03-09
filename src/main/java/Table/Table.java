package Table;

import java.util.ArrayList;

/**
 * This class needs to manage an ArrayList of Entry objects.  It needs a get method that takes a key and returns
 * its corresponding value, or null of the key is not in the arraylist.  It needs a put method that takes a key and value
 * and makes an entry with key, value.  NOTE: There cannot be two entries with the same key.
 * It also needs a remove method which takes a key and, if that key exists in the arraylist, removes that item.
 * Void return on `remove`.
 */
public class Table<K, V> {
    private ArrayList<Entry> entries;

    public Table() {
        this.entries = new ArrayList<>();
    }

    public void put(K key, V val){
        for (Entry entry:entries) {
            if (entry.getKey().equals(key)){
                entry.setValue(val);
                return;
            }
        }
        entries.add(new Entry(key, val));
    }

    public V get(K key){
        for (Entry entry:entries) {
            if (entry.getKey().equals(key)){
                return (V) entry.getValue();
            }
        }
        return null;
    }

    public void remove(K key){
        for (Entry entry:entries) {
            if (entry.getKey().equals(key)){
                entries.remove(entry);
                return;
            }
        }
    }

}

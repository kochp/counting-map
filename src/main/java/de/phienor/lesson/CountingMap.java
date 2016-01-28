package de.phienor.lesson;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Philipp Koch (created), $Date$
 * @author $Author$ (last changed)
 * @version $Rev$, $Date$<br>
 *          $Id: $
 */
public class CountingMap<K,V> implements Map<K,V>{

    private Map<K,V> internalMap = new HashMap<K,V>();

    private int counter=0;

    public V put(K key, V value) {
        counter++;
        return internalMap.put(key, value);
    }

    public void putAll(Map<? extends K, ? extends V> m) {
        counter+=m.size();
        internalMap.putAll(m);
    }

    public int getCounter() {
        return counter;
    }



    // the following methods are only wrapper method's and not from interest for this case.

    public int size() {
        return internalMap.size();
    }

    public boolean isEmpty() {
        return internalMap.isEmpty();
    }

    public boolean containsKey(Object key) {
        return internalMap.containsKey(key);
    }

    public boolean containsValue(Object value) {
        return internalMap.containsValue(value);
    }

    public V get(Object key) {
        return internalMap.get(key);
    }

    public V remove(Object key) {
        return internalMap.remove(key);
    }

    public void clear() {
        internalMap.clear();
    }

    public Set<K> keySet() {
        return internalMap.keySet();
    }

    public Collection<V> values() {
        return internalMap.values();
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return internalMap.entrySet();
    }
}

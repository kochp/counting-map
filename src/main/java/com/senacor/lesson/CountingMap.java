package com.senacor.lesson;

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
public class CountingMap implements Map{

    private Map internalMap = new HashMap();

    private int counter=0;

    public Object put(Object key, Object value) {
        counter++;
        return internalMap.put(key, value);
    }

    public void putAll(Map m) {
        counter+=m.size();
        internalMap.putAll(m);
    }

    public int getCounter() {
        return counter;
    }

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

    public Object get(Object key) {
        return internalMap.get(key);
    }

    public Object remove(Object key) {
        return internalMap.remove(key);
    }

    public void clear() {
        internalMap.clear();
    }

    public Set keySet() {
        return internalMap.keySet();
    }

    public Collection values() {
        return internalMap.values();
    }

    public Set<Entry> entrySet() {
        return internalMap.entrySet();
    }
}

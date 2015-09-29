package com.senacor.lesson;

import java.lang.Object;
import java.lang.Override;
import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class CountingHashMap extends HashMap
{

    private int counter=0;

    @Override
    public Object put(Object key, Object value) {
        counter ++;
        return super.put(key, value);
    }

    @Override
    public void putAll(Map m) {
        counter+=m.size();
        super.putAll(m);
    }

    public int getCounter() {
        return counter;
    }
}

package de.phienor.lesson;

import junit.framework.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/*
 * Project       MKP
 * Copyright (c) 2009,2010,2011 DP IT Services GmbH
 *
 * All rights reserved.
 *
 * $Rev: $ 
 * $Date: $ 
 * $Author: $ 
 */
public class CountingMapTest {
    @Test
    public void shouldCountSinglePut(){
        CountingMap countingMap = new CountingMap();
        countingMap.put("test1","Test1");
        countingMap.put("test2","Test2");
        countingMap.put("test3","Test3");
        countingMap.put("test4","Test4");
        Assert.assertEquals(4, countingMap.getCounter());
    }
    @Test
    public void shouldCountMultiplePut(){
        CountingMap countingMap = new CountingMap();
        Map input = new HashMap();
        input.put("test1","Test1");
        input.put("test2","Test2");
        input.put("test3","Test3");
        countingMap.putAll(input);
        Assert.assertEquals(3,countingMap.getCounter());
    }
}

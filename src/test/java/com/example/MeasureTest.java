package com.example;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class MeasureTest {
    @Test
    public void testName() {
        
    }

    @Before
    public void Before(){
        System.out.println("test始まる");
    }
    
    @Test
    public void Test(){
        double[] buf = MeasureMacros.VoltMeasure("test1");
        double[] CollectBuffer = {1};
        assertArrayEquals("bufOK", CollectBuffer, buf, 0);
    } 
}

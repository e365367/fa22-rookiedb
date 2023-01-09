package edu.berkeley.cs186.database;

import org.junit.Test;

public class MyTest {
    @Test
    public void myTest() {
        float f = (float) 0.4;
        System.out.println(Math.ceil(f));
        assert ((int)Math.ceil(f) == 1);
    }
}

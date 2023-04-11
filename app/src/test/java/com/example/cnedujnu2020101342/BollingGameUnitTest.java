package com.example.cnedujnu2020101342;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BollingGameUnitTest {

    private game g;

    @Before
    public void setUp() {
        g = new game();
    }

    @Test
    public void test1()
    {
        for(int i=0;i<20;i++){
            g.roll(0);
        }
        assertEquals(0, g.score());
    }
    @Test
    public void test2()
    {
        for(int i=0;i<20;i++){
            g.roll(1);
        }
        assertEquals(20,g.score());
    }
}
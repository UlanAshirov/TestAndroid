package com.joma.testandroid;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyMathTest {
    private MyMath math;

    @Before
    public void setUp() {
        math = new MyMath();
        System.out.println("Before");

    }

    @Test
    public void simpleAddCase() {
        assertEquals(4, math.add(2, 2));
        System.out.println("Simple Add Case");
    }

    @Test
    public void simpleReversCase() {
        assertEquals("World Hello", "Hello World");
    }

    @Test
    public void simpleSubCase() {
        assertEquals(1, math.sub(2, 2));
        System.out.println("Simple Sub Case");
    }

    @Test
    public void numberInWords() {
        assertEquals("World Hello", math.reversWords("Hello World 1"));
        System.out.println("with number in words");
    }

    @Test
    public void matchSpaceBetween() {
        assertEquals("World Hello", math.reversWords("Hello       World"));
    }
    
    @After
    public void tearDown() {
        System.out.println("After");
        math = null;
    }
}

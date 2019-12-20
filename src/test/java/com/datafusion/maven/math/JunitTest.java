package com.datafusion.maven.math;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class JunitTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("use for init");
    }

    @Before
    public void before() {
        System.out.println("before");
    }

    @After
    public void after() {
        System.out.println("after");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("use for destroy");
    }

    @Test
    public void testAdd() {
        assertEquals(6, new JunitDemo().add(2,4));
    }

    @Test
    public void testSubtract() {
        assertEquals(20, new JunitDemo().subtract(30, 10));
    }


}

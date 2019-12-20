package com.datafusion.maven;

import com.datafusion.maven.math.JunitTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({JunitTest.class})
public class SuiteTest {
    // Warning : the execute order is wrong in JunitTest
    // Please check it and solve it
}

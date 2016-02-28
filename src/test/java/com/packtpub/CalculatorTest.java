package com.packtpub;

import junit.framework.Assert;
import junit.framework.TestCase;
/**
 * Created by webstddesign on 21.02.2016.
 */
public class CalculatorTest extends TestCase {

    public void testSum() throws Exception {
        Calculator calculator = new Calculator();
        int sum = calculator.sum(1, 2);
        Assert.assertEquals(3, sum);
        /*comment*/

    }
    public void testGood() throws Exception {
        Assert.assertTrue("This test should not fail. See you", true);
    }
}
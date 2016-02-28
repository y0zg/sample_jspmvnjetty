package com.packtpub;

import junit.framework.Assert;
import junit.framework.TestCase;
/**
 * Created by webstddesign on 23.02.2016.
 */
public class CalculatorTest extends TestCase {

    public void testSum() throws Exception {
        Calculator calculator = new Calculator();
        int sum = calculator.sum(1, 2);
        Assert.assertEquals(3, sum);
        /*comment*/

    }

    public void testMultiply() throws Exception {
        Calculator calculator = new Calculator();
        int product = calculator.multiply(4, 3);
        Assert.assertEquals(12, product);
    }
}
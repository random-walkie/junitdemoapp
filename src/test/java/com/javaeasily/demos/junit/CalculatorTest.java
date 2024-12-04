package com.javaeasily.demos.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import com.javaeasily.demos.junit.Calculator;

public class CalculatorTest {
    @Test
    public void testAdd() {
        // arrange
        int a = 10;
        int b = 20;
        //act
        int result = Calculator.add(a, b);
        //assert
        Assertions.assertEquals(30, result);
    }

}

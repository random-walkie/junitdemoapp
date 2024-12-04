package com.javaeasily.demos.junit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import com.javaeasily.demos.junit.Calculator;

public class CalculatorTest {
    // Also need to push the object into the test class itself so it
    // can be accessed by its methods.
    // Can do this by setting a private object to the class.
    private Calculator calc; //
    @BeforeEach
    // This method will be executed before each test
    // due to the annotation given above, to setup the test fixture:
    // the set of objects of each test class before each test is run.
    public void setup(){
        // If a method is not static, it is necessary
        // to first instantiate an object to access the method
        calc = new Calculator();
    }
    @Test
    public void testAddPositiveNumbers() {
        // arrange
        int a = 10;
        int b = 20;
        //act
        int result = calc.add(a, b);
        //assert
        Assertions.assertEquals(30, result);
    }

    @Test
    public void testAddZerotoPositiveNumber() {
        // arrange
        int a = 10;
        int b = 0;
        //act
        int result = calc.add(a, b);
        //assert
        Assertions.assertEquals(10, result);
    }

}

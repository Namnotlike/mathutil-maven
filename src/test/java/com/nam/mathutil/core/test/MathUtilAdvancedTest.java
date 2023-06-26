/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.nam.mathutil.core.test;

import static com.nam.mathutil.core.MathUtility.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author TTC
 */
public class MathUtilAdvancedTest {
    
    public static Object[][] initTestData(){
        Object testData [][] = {{0, 1}, 
                                {1, 1}, 
                                {2, 2}, 
                                {4, 24}, 
                                {6, 7200}};
        return testData;
    }
    @ParameterizedTest
    @MethodSource("initTestData")
    public void checkFactorialGivenRightArgumentReturnWell(int n, long expected){
        assertEquals(expected, getFactorial(n));
    }
    
    // bat ngoai le, GetF() co tra ve ngoai le 
    //AssertThrow(): hamf xai bieu thuc lambda
    //
}

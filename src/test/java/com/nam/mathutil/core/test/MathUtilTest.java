/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.nam.mathutil.core.test;

import com.nam.mathutil.core.MathUtility;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author TTC
 */
public class MathUtilTest {
    
    @Test
    public void checkFactorialGivenRightArgumentReturnWell(){
        
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(2, MathUtility.getFactorial(2));
    }
    
    // TDD: viet code chinh va code test dan xen de check ham dung sai
    // DDT: trong qua trinh viet code test, tach data test ra rieng 1 cho cho de doc, de bao tri
    // DDT nam trong TDD
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nam.mathutil.core;

/**
 *
 * @author TTC
 */
public class MathUtility {
    public static final double PI = 3.1415;
    public static long getFactorial(int n){
        if (n == 0 || n == 1) {
            return 1;
        } else if(n < 0||n > 20){
            throw new IllegalArgumentException("n must be between 0 to 20, please....");
        }else
            return n * getFactorial(n - 1);
    }
    
}

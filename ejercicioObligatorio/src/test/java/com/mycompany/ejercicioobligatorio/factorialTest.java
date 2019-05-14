/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioobligatorio;

import java.math.BigInteger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aylin
 */
public class factorialTest {
    
    public factorialTest() {
    }
    
    /**
     * Test of factorial method, of class factorial.
     */
 
          
    @Test
    public void testFactorialPositivo(){
        System.out.println("Numeros Positivos");
        int num=-1;
        factorial fact = new factorial();
        Object result= fact.factorial1(num);
         Object expResult = "Esta función solo acepta números positivos o cero!!!";
        assertTrue(result instanceof String);
        assertEquals(expResult, result);
        
        
    }
    
    @Test
    public void testFactorialMayor(){
        
        System.out.println("Numeros Mayores a 100");
        int num=102;
        factorial fact = new factorial();
        Object result= fact.factorial1(num);
        long expResult = 999999999;
        assertTrue(result instanceof Long);
        assertEquals(expResult, result);
        
        
    }
    
    @Test
    public void testFactorialMenor(){
        
        System.out.println("Numeros Menores a 10");
        int valor= 24;
        int numero=5;
        factorial fact = new factorial();
        Object respue= fact.factorial1(numero);
        assertTrue(respue instanceof Integer);
        assertEquals(respue,valor);
        
    }
    
  
    
}

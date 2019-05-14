package com.mycompany.ejercicioobligatorio;

import java.math.BigInteger;

/**
 *
 * @author aylin
 */
public class factorial {
    
    
    //cuando el parámetro de entrada sea un número negativo deberá retornar el mensaje de error "Esta función solo acepta números positivos o cero!!!"
    //cuando el parámetro de entrada sea un número mayor que 100 deberá retornar el número 9999999999
    //cuando el parámetro de entrada sea un número menor que 10 los valores retornados deberán ser: 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880 respectivamente

    
     public Object factorial1(int num){
        
        Object fact;
        
          int resultado=1;
          long result;
          
        if(num<0)
        {
            
            fact="Esta función solo acepta números positivos o cero!!!";
        }
        else
        {
            if( num>0 && num<=10){
                
                for(int i=1;i<num;i++)
                {
                resultado = resultado * i;
            }
             fact=resultado;
            }
            else{
                result=999999999;
                fact=result ;   
                
            }
        }
         return fact;
     }
    
}

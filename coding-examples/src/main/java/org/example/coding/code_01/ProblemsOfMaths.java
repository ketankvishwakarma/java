package org.example.coding.code_01;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProblemsOfMaths {

    /*
    * You go through all numbers up to half of the value
    * (all higher values cannot be integer divisors because 2 is already a divisor)
    * and check if they divide the given number without a remainder.
    * If this is the case, then this number is a divisor and included in a result list.
    * */
    List<Integer> divisorOfNumber(final int number){
        List<Integer> divisor = new ArrayList<>();
        for(int i=1 ;i<=number/2; i++){
            if(number%i==0)
                divisor.add(i);
        }
        return divisor;
    }

    List<Integer> extractDigit(final int start){
        List<Integer> digits = new ArrayList<>();
        int remaining = start;
        while(remaining>0){
            final int digit = remaining % 10;
            digits.add(digit);
            remaining = remaining /10;
        }
        Collections.reverse(digits);
        return digits;
    }
}

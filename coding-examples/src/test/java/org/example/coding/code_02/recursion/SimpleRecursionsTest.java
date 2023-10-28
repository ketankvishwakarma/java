package org.example.coding.code_02.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class SimpleRecursionsTest {

    @Test
    void test_factorial(){
        Assertions.assertEquals(SimpleRecursions.Factorial.find(5),120);
    }

    @Test
    void test_sum_of_all_numbers_upto_n(){
        Assertions.assertEquals(SimpleRecursions.SumOfAllNumbersUptoN.find(5),15);
    }

    @ParameterizedTest
    @CsvSource({"5,5","8,21"})
    void test_fibonacci_upto_n(int input,int output){
        Assertions.assertEquals(SimpleRecursions.Fibonacci.find(input),output);
    }

    @ParameterizedTest
    @CsvSource({"1234,10","1234567,28"})
    void test_sum_of_digits(int input, int expected){
        Assertions.assertEquals(SimpleRecursions.SumOfDigits.find(input),expected);
    }

    @ParameterizedTest
    @CsvSource({"42,28,14","42,14,14","42,7,7"})
    void test_gcd(int input1,int input2, int expected){
        Assertions.assertEquals(SimpleRecursions.GreatestCommonDivisor.find(input1,input2),expected);
    }

    @ParameterizedTest
    @CsvSource({"2,7,14","7,7,14"})
    void test_lcm(int input1,int input2, int expected){
        Assertions.assertEquals(SimpleRecursions.LowestCommonMultiplier.find(input1,input2),expected);
    }

    @ParameterizedTest
    @CsvSource({"ABC,CBA","A,A"})
    void test_string_reversal(String  input, String expected){
        Assertions.assertEquals(SimpleRecursions.ReverseString.go(input),expected);
    }

    static Stream<Arguments> valuesAndResult(){
        return Stream.of(Arguments.of(Arrays.asList(1), 1),
                Arguments.of(Arrays.asList(1, 2, 3 ), 6));
    }

    @Test
    //@MethodSource("valueAndResult")
    void test_sum_array_elements(){
        Assertions.assertEquals(SimpleRecursions.SumOfArrayElements.go(Arrays.asList(1)),1);
        Assertions.assertEquals(SimpleRecursions.SumOfArrayElements.go(Arrays.asList(1, 2, 3)),6);
    }

    @ParameterizedTest
    @CsvSource({"5,101","11,1011"})
    void test_decimal_to_binary(int input,String output){
        Assertions.assertEquals(SimpleRecursions.DecimalToBinary.go(input),output);
    }

    @ParameterizedTest
    @CsvSource({"42, 52", "7, 7", "8, 10"})
    void test_decimal_to_octa(int input,String output){
        Assertions.assertEquals(SimpleRecursions.DecimalToOcta.go(input),output);
    }

    @ParameterizedTest
    @CsvSource({"2, 4, 16"})
    void test_power_of(int value,int exp,int output){
        Assertions.assertEquals(SimpleRecursions.PowerOf.go(value,exp),output);
    }

    @Test
    void test_pascals_triangle(){
        SimpleRecursions.PascalsTriangle.go(5);
    }
}
package org.example.coding.code_01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ProblemsOfMathsTest {
    ProblemsOfMaths maths = new ProblemsOfMaths();
    @Test
    void divisorOfNumber_success() {
        Assertions.assertEquals(Arrays.asList(1,2,3),maths.divisorOfNumber(6));
    }

    @Test
    void extractDigit() {
        Assertions.assertEquals(Arrays.asList(1,2,3),maths.extractDigit(123));
    }
}
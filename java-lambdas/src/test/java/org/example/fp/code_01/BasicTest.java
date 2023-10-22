package org.example.fp.code_01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BasicTest {

    Basic basic=new Basic();
    @Test
    void functionalWay() {
        Assertions.assertEquals(basic.functionalWay(), BigDecimal.valueOf(67.5));
    }

    @Test
    void oldWay() {
        Assertions.assertEquals(basic.oldWay(), BigDecimal.valueOf(67.5));
    }
}
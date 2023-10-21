package ketan.io.subtype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class AppleAndOrangesTest {

    protected static final Logger log= Logger.getLogger("AppleAndOrangesTest");

    @Test
    void apple_compare_success(){
        Apple a1 = new Apple(10);
        Apple a2 = new Apple(20);
        List<Apple> a = Arrays.asList(a1,a2);
        log.info("Apples -> "+Collections.max(a).equals(a2));
        Assertions.assertEquals(true,Collections.max(a).equals(a2));
    }

    @Test
    void oranges_compare_success(){
        Oranges o1 = new Oranges(10);
        Oranges o2 = new Oranges(20);
        List<Oranges> o = Arrays.asList(o1,o2);
        log.info("Oranges -> "+Collections.max(o).equals(o2)+"");
        Assertions.assertEquals(true,Collections.max(o).equals(o2));

    }
}
package org.example.fp.code_01;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Basic {

    //Suppose we’re asked to total the prices greater than $20, discounted by 10%.
    static final List<BigDecimal> prices = Arrays.asList(
            BigDecimal.valueOf(10),BigDecimal.valueOf(30),BigDecimal.valueOf(17),
            BigDecimal.valueOf(20),BigDecimal.valueOf(15),BigDecimal.valueOf(18),
            BigDecimal.valueOf(45),BigDecimal.valueOf(12)
    );

    BigDecimal functionalWay(){
        return prices.stream()
                .filter(price -> price.compareTo(BigDecimal.valueOf(20))>0)
                .map(prices-> prices.multiply(BigDecimal.valueOf(0.9)))
                .reduce(BigDecimal.ZERO,BigDecimal::add);
    }
    BigDecimal oldWay(){
        BigDecimal totalOfDiscountedPrices = BigDecimal.ZERO;

        for(BigDecimal price : prices) {
            if(price.compareTo(BigDecimal.valueOf(20)) > 0)
                totalOfDiscountedPrices =
                        totalOfDiscountedPrices.add(price.multiply(BigDecimal.valueOf(0.9)));
        }
        return totalOfDiscountedPrices;
    }
}

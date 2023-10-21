package ketan.io.subtype;

import java.util.*;
import java.util.logging.Logger;

/**
 * - Prohibits comparison of apples with oranges
 * - Two fruits are equal if they have the same name and the same size

 * */
public class AppleAndOranges {
    protected static final Logger log= Logger.getLogger("AppleAndOranges");

    public static void main(String[] args) {
        Apple a1 = new Apple(10);
        Apple a2 = new Apple(20);
        Oranges o1 = new Oranges(10);
        Oranges o2 = new Oranges(20);
        List<Apple> a = Arrays.asList(a1,a2);
        //assert Collections.max(a).equals(a2);
        log.info(Collections.max(a).equals(a2)+"");
        List<Oranges> o = Arrays.asList(o1,o2);
        //assert Collections.max(o).equals(o2);
        log.info(Collections.max(o).equals(o2)+"");

        List<Fruit> mixed = List.of(a1,o1);

        //Collections.max(mixed); // this won't compile as subtypes are different as <? extends T>


    }
}

abstract class Fruit{
    protected String name;
    protected Integer size;
    protected Fruit(String name, int size) {
        this.name = name; this.size = size;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        if (!name.equals(fruit.name)) return false;
        return size.equals(fruit.size);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + size.hashCode();
        return result;
    }
    protected int compareTo(Fruit that){
        return Integer.compare(this.size,that.size);
    }
}

class Apple extends Fruit implements Comparable<Apple>{

    protected Apple(int size) {
        super("Apple", size);
    }

    @Override
    public int compareTo(Apple o) {
        return super.compareTo(o);
    }
}

class Oranges extends Fruit implements Comparable<Oranges>{
    protected Oranges(int size) {
        super("Orange", size);
    }

    @Override
    public int compareTo(Oranges o) {
        return super.compareTo(o);
    }
}
package ketan.io.comparable._01;

import java.util.*;
import java.util.logging.Logger;

/**
 * - Prohibits comparison of apples with oranges
 * - Two fruits are equal if they have the same name and the same size
 * */
public class AppleAndOranges {
    protected static final Logger log= Logger.getLogger("AppleAndOranges");

    /**
     *
     * */
    protected static <T extends Fruit & Comparable<? super T>> T max(Collection<? extends  T> inputCollection){
        Iterator<? extends T> i = inputCollection.iterator();
        T currentMax = i.next();
        while (i.hasNext()){
            T next = i.next();
            if(next.compareTo((Fruit)currentMax)>0)
                currentMax=next;
        }
        return currentMax;
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
    //Collections.max(Arrays.asList(1)).equals(1);
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
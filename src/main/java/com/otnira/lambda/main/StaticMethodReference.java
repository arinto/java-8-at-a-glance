package com.otnira.lambda.main;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * A simple example that uses static method reference (::)
 * as a single-abstract-method
 * @author arinto
 *
 */
public class StaticMethodReference {

    public static void main(String[] args) {

        Random random = new Random();
        Set<Integer> theIntSet = new HashSet<>();
        for(int i = 0; i < 10;i++) {
            theIntSet.add(Integer.valueOf(random.nextInt(100)));
        }
        
        theIntSet.forEach(ThatClass::thatIs);
    }
    
    public static class ThatClass {
        public static void thatIs(int i) {
            System.out.printf("That is %d%n", i);
        }
    }
}

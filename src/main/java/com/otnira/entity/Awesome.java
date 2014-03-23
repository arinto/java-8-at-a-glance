package com.otnira.entity;

/**
 * Awesome interface
 * @author arinto
 *
 */
public interface Awesome {
    
    /**
     * say hello!
     */
    void sayHello();
    
    /**
     * eat something!
     * @param something thing to be eaten
     */
    default void eat(String something) {
        System.out.printf("nom nom %s.. %n", something);
    }

}

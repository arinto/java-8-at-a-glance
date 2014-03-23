package com.otnira.entity.impl;

import com.otnira.entity.Awesome;

/**
 * Awesome people from Singapore
 * @author arinto
 *
 */
public class AwesomeSingaporean implements Awesome{

    @Override
    public void sayHello() {
        System.out.println("Hello!");
    }
    
    @Override
    public void eat(String something) {
        System.out.printf("makan %s..%n", something);
    }

}

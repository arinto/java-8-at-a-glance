package com.otnira.evolution.main;

import java.util.LinkedList;
import java.util.List;

import com.otnira.evolution.entity.Awesome;
import com.otnira.evolution.entity.impl.AwesomeIndonesian;
import com.otnira.evolution.entity.impl.AwesomeSingaporean;
import com.otnira.evolution.entity.impl.AwesomeSpaniard;
import com.otnira.evolution.entity.impl.AwesomeSwedish;

/**
 * Interface evolution examples. Awesome people who do not implement
 * the default methods are still able to call eat method.
 * @author arinto
 *
 */
public class InterfaceEvolutionMain {

    public static void main(String[] args) {

        List<Awesome> awesomePeople = new LinkedList<>();
        Awesome spaniard = new AwesomeSpaniard();
        awesomePeople.add(spaniard);
        
        Awesome indonesian = new AwesomeIndonesian();
        awesomePeople.add(indonesian);
        
        Awesome swedish = new AwesomeSwedish();
        awesomePeople.add(swedish);
        
        Awesome singaporean = new AwesomeSingaporean();
        awesomePeople.add(singaporean);
        
        awesomePeople.forEach(ap -> {
            ap.sayHello();
            ap.eat("roti prata kosong");
        });

    }

}

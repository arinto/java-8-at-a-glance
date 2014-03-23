package com.otnira.evolution.main;

import java.util.LinkedList;
import java.util.List;

import com.otnira.evolution.entity.Awesome;
import com.otnira.evolution.entity.impl.AwesomeIndonesian;
import com.otnira.evolution.entity.impl.AwesomeSingaporean;
import com.otnira.evolution.entity.impl.AwesomeSpaniard;
import com.otnira.evolution.entity.impl.AwesomeSwedish;

/**
 * Basic main class. All awesome people say hello in their own languages!
 * @author arinto
 *
 */
public class BasicMain {

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
        
        awesomePeople.forEach(ap -> ap.sayHello());
    }

}

package com.otnira.main;

import java.util.LinkedList;
import java.util.List;

import com.otnira.entity.Awesome;
import com.otnira.entity.impl.AwesomeIndonesian;
import com.otnira.entity.impl.AwesomeSingaporean;
import com.otnira.entity.impl.AwesomeSpaniard;
import com.otnira.entity.impl.AwesomeSwedish;

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
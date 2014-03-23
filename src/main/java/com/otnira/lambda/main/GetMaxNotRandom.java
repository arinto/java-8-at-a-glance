package com.otnira.lambda.main;

import java.util.Collection;
import java.util.OptionalInt;

import com.otnira.lambda.entity.Student;

/**
 * Main class that generates collection of students
 * deterministically and finds the maximum grade
 * of the specified batch.
 * @author arinto
 *
 */
public class GetMaxNotRandom {

    public static void main(String[] args) {
        
        int year = args.length >= 1? Integer.valueOf(args[0]) : 2013;
        
        Collection<Student> students = Util.initNotRandom();
        
        OptionalInt max = students.stream()
                .filter(s -> year == s.getGradYear())
                .mapToInt(s -> s.getGrade()).max();
        
        if (max.isPresent()) {
            System.out.printf("Maximum grade for students from year %d is %d%n",
                    year, max.getAsInt());
        }
    }

}

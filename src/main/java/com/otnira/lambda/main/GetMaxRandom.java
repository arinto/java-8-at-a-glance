package com.otnira.lambda.main;

import java.util.Collection;
import java.util.OptionalInt;
import java.util.concurrent.TimeUnit;

import com.otnira.lambda.entity.Student;

/**
 * Main class that randomly generates collection of students
 * and find the maximum of the grade for student in specific year
 * using sequential and parallel stream
 * @author arinto
 *
 */
public class GetMaxRandom {

    public static void main (String args[]) {
        
        int year = args.length >= 1? Integer.valueOf(args[0]) : 2013;
        int numStudentPerBatch = args.length >= 2? Integer.valueOf(args[2]): 1000;
        
        Collection<Student> students = Util.initRandom(numStudentPerBatch);
        System.out.println("Using sequential stream");
        System.out.printf("Total number of students = %d%n", students.size());

        long start = System.nanoTime();
        OptionalInt max = students.stream()
                .filter(s -> year == s.getGradYear())
                .mapToInt(s -> s.getGrade()).max();
        
        if (max.isPresent()) {
            System.out.printf("Maximum grade for students from year %d is %d%n",
                    year, max.getAsInt());
        }
        System.out.printf("Duration using sequential stream: %d ms%n%n",
                TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - start));
        
        System.out.println("Now using parallel stream!");
        students = Util.initRandom(numStudentPerBatch);
        System.out.printf("Total number of students = %d%n", students.size());
        
        start = System.nanoTime();
        max = students.parallelStream()
                .filter(s -> year == s.getGradYear())
                .mapToInt(s -> s.getGrade()).max();
        
        if (max.isPresent()) {
            System.out.printf("Maximum grade for students from year %d is %d%n",
                    year, max.getAsInt());
        }
        System.out.printf("Duration using parallel stream: %d ms%n",
                TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - start));

    }
}

package com.otnira.lambda.main;

import java.util.Collection;

import com.otnira.lambda.entity.Student;

/**
 * A simple example that uses parallel Stream on Java 8.
 * @author arinto
 *
 */
public class ParallelStreamExample {

    public static void main(String[] args) {

        int year = args.length >= 1 ? Integer.valueOf(args[0]) : 2013;
        int numStudentPerBatch = args.length >= 2 ? Integer.valueOf(args[1])
                : 1000;

        Collection<Student> students = Util.initRandom(numStudentPerBatch);
        System.out.println("Using parallel stream");
        System.out.printf("Total number of students = %d%n", students.size());

        students.parallelStream()
                .filter(s -> year == s.getGradYear() && s.getGrade() > 90)
                .forEach(s -> System.out.println(s));
    }
}

package com.otnira.lambda.main;

import java.util.Collection;

import com.otnira.lambda.entity.Student;

public class StreamExample {

    public static void main(String[] args) {
        
        int year = args.length >= 1? Integer.valueOf(args[0]) : 2013;
        int numStudentPerBatch = args.length >= 2? Integer.valueOf(args[1]): 1000;
        
        Collection<Student> students = Util.initRandom(numStudentPerBatch);
        System.out.println("Using sequential stream");
        System.out.printf("Total number of students = %d%n", students.size());
        
        students.stream()
                .filter(s -> year == s.getGradYear() && s.getGrade() > 90)
                .forEach(s -> System.out.println(s));
    }

}

package com.otnira.lambda.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import com.otnira.lambda.entity.Student;

/**
 * Utility class to generate dummy collection of Students
 * @author arinto
 *
 */
class Util {
    
    /**
     * Generate collection of students deterministically.
     * It will generate student from year 2000 to 2014, 
     * and for each year it will generate students with grade 10 to 100, 
     * both inclusive.
     * @return collection of students
     */
    static Collection<Student> initNotRandom() {
      
        List<Student> students = new ArrayList<>();
        IntStream.rangeClosed(2000, 2014).forEachOrdered(
                year -> IntStream.rangeClosed(10, 100).forEachOrdered(
                        grade -> students.add(new Student(year, grade))));

        return students;
    }
    
    /**
     * Generate collection of students randomly.
     * It will generate numStudentPerBatch from year 2000 to 2014.
     * @param numStudentPerBatch number of student to generate per batch
     * @return collection of students
     */
    static Collection<Student> initRandom(int numStudentPerBatch) {
        
        List<Student> students = new ArrayList<>();
        Random rnd = new Random();
        
        for(int year = 2000; year <= 2014; year++) {
            for(int i = 0; i < numStudentPerBatch; i++) {
                students.add(new Student(year, rnd.nextInt(101)));
            }
        }
        
        return students;
    }

}

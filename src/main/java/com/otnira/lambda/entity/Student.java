package com.otnira.lambda.entity;

/**
 * Entity class that represent a student
 * that has graduation year and a grade
 * @author arinto
 *
 */
public final class Student {
    
    private final int gradYear;
    private final int grade;
    
    /**
     * The constructor
     * @param inGrade grade
     * @param inGradYear graduation year
     */
    public Student(int inGradYear, int inGrade) {
        this.gradYear = inGradYear;
        this.grade = inGrade;
    }

    /**
     * Get the graduation year
     * @return graduation year
     */
    public int getGradYear() {
        return gradYear;
    }

    /**
     * Get the grade
     * @return grade
     */
    public int getGrade() {
        return grade;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + gradYear;
        result = prime * result + grade;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (gradYear != other.gradYear)
            return false;
        if (grade != other.grade)
            return false;
        return true;
    }
}

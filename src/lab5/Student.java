package lab5;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String name = "student";
    private double score = 0.0;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }


    @Override
    public int compareTo(Student that) {
        if (that == null)
            throw new NullPointerException();
        if (this.score == that.score)
            return 0;
        if (this.score < that.score)
            return -1;
        return 1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

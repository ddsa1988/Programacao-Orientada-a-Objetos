package exercise01;

import java.util.ArrayList;

public class Student {
    private String name;
    private String course;
    private Grade grades;

    public Student(String name, String course, Grade grades){
        this.setName(name);
        this.setCourse(course);
        this.setGrades(grades);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setCourse(String course){
        this.course = course;
    }

    public String getCourse(){
        return this.course;
    }

    public void setGrades(Grade grades){
        this.grades = grades;
    }

    public ArrayList<Float> getGrades(){
        return this.grades.getGrades();
    }

    public float getAverage(){
        return this.grades.getAverage();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", grades=" + getGrades() +
                '}';
    }
}

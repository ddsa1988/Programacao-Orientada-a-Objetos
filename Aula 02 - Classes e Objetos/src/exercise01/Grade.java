package exercise01;

import java.util.ArrayList;

public class Grade {
    private ArrayList<Float> grades = new ArrayList<Float>();

    public Grade(ArrayList<Float> grades){
        this.setGrades(grades);
    }

    public void setGrades(ArrayList<Float> grades){
        for (float grade: grades) {
            try{
                if(grade >= 0 && grade <=10){
                    this.grades.add(grade);
                }else{
                    throw new Exception("Invalid grade range! Must be between 0 and 10.");
                }
            }catch (Exception error){
               this.grades.clear();
               System.out.println(error);
            }
        }
    }

    public ArrayList<Float> getGrades(){
        return this.grades;
    }

    public float getAverage(){

        if(this.grades.size() == 0){
            return 0f;
        }

        float sum = 0;

        for (float grade: this.grades) {
            sum += grade;
        }

        float average = sum / this.grades.size();

        return average;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "grades=" + grades +
                '}';
    }
}

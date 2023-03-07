package exercise01;

public class Grade {
    private float grade1;
    private float grade2;

    public Grade(float grade1, float grade2){
        setGrade1(grade1);
        setGrade2(grade2);
    }

    public void setGrade1(float grade){
        try {
            if(grade >= 0 && grade <= 10){
                this.grade1 = grade;
            }else {
                this.grade1 = 0f;
                throw new Exception("Grade must be between 0 and 10.");
            }
        }catch (Exception error){
            System.out.println(error);
        }
    }

    public float getGrade1(){
        return this.grade1;
    }

    public void setGrade2(float grade){
        try {
            if(grade >= 0 && grade <= 10){
                this.grade2 = grade;
            }else {
                this.grade2 = 0f;
                throw new Exception("Grade must be between 0 and 10.");
            }
        }catch (Exception error){
            System.out.println(error);
        }
    }

    public float getGrade2(){
        return this.grade2;
    }

    public void result(){
        float average = (getGrade1() + getGrade2()) / 2f;
        String msg = average >= 7f ? "passed" : average >= 4f ? "exam" : "failed";

        System.out.printf("The student average is %.2f. Status: %s.", average, msg);

        if(msg == "exam"){
            System.out.println();
            System.out.printf("The student needs a grade of %.2f in the final exam to pass.", 7f - average);
        }

    }
}

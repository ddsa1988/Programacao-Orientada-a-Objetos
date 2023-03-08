package concepts;

public class Student extends Person{
    private int id;
    private String course;
    public Student(String name, int birthYear, int id, String course) {
        super(name, birthYear);
        setId(id);
        setCourse(course);
    }

    public void setId(int id){
        if(id > 0){
            this.id = id;
        }
    }

    public int getId(){
        return this.id;

    }

    public void setCourse(String course){
        if (!course.isBlank() && !course.isEmpty()){
            this.course = course;
        }
    }

    public String getCourse(){
        return this.course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + super.getName() + '\'' +
                ", birthYear=" + super.getBirthYear() +
                ", id=" + id +
                ", course='" + course + '\'' +
                '}';
    }
}

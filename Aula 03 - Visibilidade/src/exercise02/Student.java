package exercise02;

public class Student {
    private String name;
    private int id;
    private double discount;
    private Course course;

    public Student(String studentName, int id, double discount, String courseName, double courseMonthFee){
        setName(studentName);
        setId(id);
        setDiscount(discount);
        setCourse(courseName, courseMonthFee);
    }

    public void setName(String name){
        String auxName = name.trim();

        if (!auxName.isEmpty()){
            this.name = auxName;
        }else{
            System.out.println("Invalid student name!");
        }
    }

    public void setId(int id){
        if(id > 0){
            this.id = id;
        }else {
            System.out.println("Invalid Id!");
        }
    }

    public void setDiscount(double discount){
        if(discount > 0){
            this.discount = discount;
        }else{
            System.out.println("Invalid course discount!");
        }
    }

    public void setCourse(String name, double monthFee){
        this.course = new Course(name, monthFee);
    }

    public double payment(){
        double total = course.getMonthFee() - discount;
        total =  total > 0 ? total : 0;

        return total;
    }

    public String info() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", discount=" + discount +
                ", course=" + course.info() +
                '}';
    }
}

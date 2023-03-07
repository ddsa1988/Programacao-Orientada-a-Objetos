package exercise02;

public class Course {
    private String name;
    private double monthFee;

    public Course(String name, double monthFee){
        setName(name);
        setMonthFee(monthFee);
    }

    public void setName(String name){
        String auxName = name.trim();
        if(!auxName.isEmpty()){
            this.name = auxName;
        }else {
            System.out.println("Invalid course name!");
        }
    }

    public String getName(){
        return this.name;
    }

    public void setMonthFee(double monthFee){
        if(monthFee > 0){
            this.monthFee = monthFee;
        }else{
            System.out.println("Invalid course month fee!");
        }
    }

    public double getMonthFee(){
        return this.monthFee;
    }

    public String info() {
        return "Course{" +
                "name='" + name + '\'' +
                ", monthFee=" + monthFee +
                '}';
    }
}

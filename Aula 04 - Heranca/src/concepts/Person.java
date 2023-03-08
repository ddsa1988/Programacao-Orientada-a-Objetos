package concepts;

public class Person {
    private String name;
    private int birthYear;

    public Person(String name, int birthYear){
        setName(name);
        setBirthYear(birthYear);
    }

    public void setName(String name){
        if (!name.isBlank() && !name.isEmpty()){
            this.name = name;
        }
    }

    public String getName(){
        return this.name;
    }

    public void setBirthYear(int birthYear){
        if (birthYear > 0){
            this.birthYear = birthYear;
        }
    }

    public int getBirthYear(){
        return this.birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}

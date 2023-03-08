package exercise01;

public class Author {
    private String name;
    private String email;
    private String country;

    public Author(String name, String email, String country){
        setName(name);
        setEmail(email);
        setCountry(country);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(!name.isEmpty() && !name.isBlank()){
            this.name = name.trim();
        }
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        if(!email.isEmpty() && !email.isBlank()){
            this.email = email.trim();
        }
    }

    public String getCountry(){
        return country;
    }

    public void setCountry(String country){
        if(!country.isEmpty() && !country.isBlank()){
            this.country = country.trim();
        }
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}



public class Author {

    private String name;
    private String email;
    private char gender;

    public String getName () {
        return name;
    }

    public String toString() {
        return getName() + " (" + getGender() + ") " + "at " + getEmail();
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String email){
        this.email = email;
    }

    public char getGender () {
        return gender;
    }

    public void setGender ( char gender){
        this.gender = gender;
    }


    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

}
package generics.example;

public class Student {
    private int id;
    private String name;
    private String surname;
    private String grade;
    private String school;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }


    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Student(int id, String name, String surname, String school) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.school = school;
    }
}

package generics.example;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        ArrayList<Teacher> teacherList = new ArrayList<>();
        Student std1 = new Student(1,"Ahmet","bey", "cumhuriyet");
        Student std2 = new Student(2,"Mehmet","Can", "sezgi");
        Student std3 = new Student(3,"Ali","Han", "ezgi");

        Teacher tch1 = new Teacher(1,"Ali","Zan", "Math", "ezgi");
        Teacher tch2 = new Teacher(2,"Veli","Can", "Chem", "cum");
        Teacher tch3 = new Teacher(3,"Aslı","Han", "Science", "sezgi");
        System.out.println(studentList);
        Methods.add(std1, studentList);
        Methods.add(std2, studentList);
        Methods.add(std3, studentList);
        studentList.stream().forEach(t->System.out.println(t.getName()));
        System.out.println(teacherList);
        Methods.add(tch1, teacherList);
        Methods.add(tch2, teacherList);
        Methods.add(tch3, teacherList);
        teacherList.stream().forEach(t->System.out.println(t.getName()));

    }




}

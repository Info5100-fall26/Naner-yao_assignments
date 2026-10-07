package com.example;
import java.util.ArrayList;
class Student{
    int id;
    String firstName;
    String lastName;
    Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

class EngClass{
    ArrayList<Student> students = new ArrayList<Student>();
    void add(Student s) {
        students.add(s);
    }
    void delete(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).id == id) {
                students.remove(i);
                return;
            }
        }
    }
    void print() {
        for (Student s : students) {
            System.out.println("ID: " + s.id + ", First Name: " + s.firstName + ", Last Name: " + s.lastName);
        }
    }
}

public class App 
{
    public static void main( String[] args )
    {
        EngClass myClass = new EngClass();
        myClass.add(new Student(16, "Will", "Smith"));
        myClass.add(new Student(17, "Shohei", "Ohtani"));
        myClass.print();
        myClass.delete(17);
        System.out.println("After deleting student with ID 17:");
        myClass.print();
    }
}

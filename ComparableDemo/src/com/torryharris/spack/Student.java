package com.torryharris.spack;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student s) {
        if (marks<s.marks){
            return 1;
        }
        else
        if (marks==s.marks){
            if (id>s.id){
                return 1;
            }
            else
                if (id==s.id){
                    return 0;
                }
                else
                    return -1;
        }
        else return -1;
    }
}

package org.example.lombokMavenProject;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("shine", 10);
        Subject subject = new Subject();

        subject.setSubjectName("History");
        subject.setStd(10);

        System.out.println(student.getName());
        System.out.println(student.getStd());

        System.out.println(subject.getSubjectName());
        System.out.println(subject.getStd());
    }
}
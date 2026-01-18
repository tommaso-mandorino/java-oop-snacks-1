package org.lessons.java.oop_snacks_1;

public class StudentRegister {

    private Student[] students;

    public StudentRegister() {
        this.students =  new Student[0];
    }

    public Student[] getStudents() {
        return this.students;
    }
    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void addStudent(Student student) {

        Student[] increasedArray = new Student[students.length + 1];
        System.arraycopy(students, 0, increasedArray, 0, students.length);
        increasedArray[students.length] = student;
        students = increasedArray;
    }

    public void listStudents() {

        if (this.students.length > 0) {
            for (int i = 0; i < this.students.length; i++) {
            System.out.println(this.students[i].getFullInformation());
        }
        } else {
            System.out.println("There are no students.");
        }
    }
}
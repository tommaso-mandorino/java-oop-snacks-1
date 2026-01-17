package org.lessons.java.oop_snacks_1;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Mario", "Rossi", 25);
        System.out.println(student1.getFullInformation());

        System.out.println("");

        BankAccount bankAccount1 = new BankAccount(new BigDecimal(5000));
        System.out.println(bankAccount1.getBalance());
        bankAccount1.depositMoney(new BigDecimal(1000));
        System.out.println(bankAccount1.getBalance());
        bankAccount1.withDrawMoney(new BigDecimal(5000));
        bankAccount1.withDrawMoney(new BigDecimal(500));
        System.out.println(bankAccount1.getBalance());

        System.out.println("");

        StudentRegister studentRegister1 = new StudentRegister();
        studentRegister1.listStudents();
        studentRegister1.addStudent(student1);
        studentRegister1.listStudents();
        Student student2 = new Student("Luca", "Bianchi", 30);
        studentRegister1.addStudent(student2);
        System.out.println("");
        studentRegister1.listStudents();
    }

}
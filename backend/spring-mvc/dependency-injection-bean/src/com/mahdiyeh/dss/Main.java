package com.mahdiyeh.dss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new FileSystemXmlApplicationContext("src/bean.xml");
//        Student student = (Student) context.getBean("Student");
//        System.out.println(student);
//        --------------------------------------------------------------------------------------------------

        ApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigApplication.class);
        Student student = (Student) context.getBean(Student.class);
        student.setNameOfStudent("mmd");
        student.setPhoneNumber("999");
        System.out.println(student);
    }
}

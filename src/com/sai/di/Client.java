package com.sai.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
//        Student student = new Student();
//        MathCheat cheat = new MathCheat();
//        student.setMathCheat(cheat);

        ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");

        System.out.println("");
        Student stu = context.getBean("saiStudent",Student.class);
        stu.cheating();

        Student stu1 = context.getBean("scienceStudent",Student.class);
        stu1.cheating();

    }
}


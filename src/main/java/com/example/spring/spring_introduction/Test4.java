package com.example.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog muDog = context.getBean("myPet", Dog.class);
        muDog.setName("Bars");

        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.setName("Cooper");

        System.out.println(muDog.getName());
        System.out.println(yourDog.getName());
    }

}

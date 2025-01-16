package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Alien alien = context.getBean("alien", Alien.class);
        alien.code();

        Alien alien2 = context.getBean("alien", Alien.class);
        alien2.code();
        alien2.getComputer().compile();

        Desktop desktop = context.getBean(Desktop.class); // It searches by type.
        desktop.compile();


        System.out.println("Alien's Age: " + alien2.getAge());
    }
}

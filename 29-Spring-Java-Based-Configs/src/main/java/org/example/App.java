package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Desktop desktop2 = context.getBean(Desktop.class);
        System.out.println(desktop2.getRam());

        Alien alien = context.getBean(Alien.class);
        alien.getComputer().compile();
    }
}

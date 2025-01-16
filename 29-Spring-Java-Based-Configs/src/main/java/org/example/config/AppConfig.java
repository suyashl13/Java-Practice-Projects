package org.example.config;

import org.example.Alien;
import org.example.Computer;
//import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
//import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

//    @Bean(name = {"desktop1", "comp1"})
//    @Scope(scopeName = "prototype")
//    public Desktop desktop() {
//        return new Desktop();
//    }

    @Bean
    public Alien alien(
            @Qualifier("desktop")
            @Autowired
            Computer computer
    ) {
        Alien alien = new Alien();
        alien.setComputer(computer);
        return alien;
    }

    @Bean
    @Primary
    public Laptop laptop(){
        return new Laptop();
    }

}

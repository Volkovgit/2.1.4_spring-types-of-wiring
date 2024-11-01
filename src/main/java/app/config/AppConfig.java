package app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import app.model.Animal;
import app.model.Dog;
import app.model.Timer;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {

    @Bean
    public Animal getDog(){
        return new Dog();
    }

    @Bean
    public Timer getTimer(){
        return new Timer();
    }
}

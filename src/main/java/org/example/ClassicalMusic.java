package org.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{

    @PostConstruct
    public void doMyInit(){
        System.out.println("do my init");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("do my destroy");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}

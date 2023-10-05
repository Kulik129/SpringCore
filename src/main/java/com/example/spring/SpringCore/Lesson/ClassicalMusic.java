package com.example.spring.SpringCore.Lesson;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import java.util.ArrayList;
import java.util.List;

public class ClassicalMusic implements Music {
    public List<String> listMusic() {
        List<String> list = new ArrayList<>();
        list.add("Моцард");
        list.add("Бах");
        list.add("Чайковский");
        return list;
    }

    /**
     * Реализация метода воспроизведения классической музыки
     *
     * @return классической музыки
     */
    @Override
    public String getSound() {
        return "классической музыки";
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Do my initi");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("destroy method");
    }
}

package com.example.spring.SpringCore.HW;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContextHW.xml"
//        );
//
//        MusicPlayer musicPlayer = context.getBean("musicPlayerApple", MusicPlayer.class);
//        musicPlayer.play(GenreMusic.RAP);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.play();

    }
}

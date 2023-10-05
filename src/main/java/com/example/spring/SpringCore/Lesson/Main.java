package com.example.spring.SpringCore.Lesson;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContextAlishev.xml"
//        );

//        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
//        RapMusic rapMusic = context.getBean("rapMusic", RapMusic.class);

        MusicPlayerApple musicPlayer = context.getBean("musicPlayerApple", MusicPlayerApple.class);
        musicPlayer.playMusic(Genre.rap);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getValue());

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);


//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();


//        Music music = context.getBean("rapMusic",Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();
//
//        Music music1 = context.getBean("classicalMusic", Music.class);
//        MusicPlayer musicPlayer1 = new MusicPlayer(music1);
//        musicPlayer1.playMusic();


//        TestBean testBean = context.getBean("testBean", TestBean.class);
//        System.out.println(testBean.getName());

//        Music music = context.getBean("musicBean",Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();

//        MusicPlayer musicPlayer = context.getBean("music",MusicPlayer.class);
//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getNamePlayer());
//        System.out.println(musicPlayer.getVolume());

//        Music classical = context.getBean("classical", ClassicalMusic.class);
//        Music rap = context.getBean("rap", RapMusic.class);
//        Music rock = context.getBean("rock", RockMusic.class);
//
//        List<Music> listM = new ArrayList<>();
//        listM.add(classical);
//        listM.add(rap);
//        listM.add(rock);
//
//        MusicPlayer musicPlayer = new MusicPlayer(listM);
//        musicPlayer.playMusic();

//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//        boolean comparison = musicPlayer1 == musicPlayer2;
//        System.out.println(comparison);
//        musicPlayer1.setVolume(3);
//        System.out.println(musicPlayer1.getVolume());
//        System.out.println(musicPlayer2.getVolume());
//        musicPlayer.playMusic();

//        ClassicalMusic classicalMusic = context.getBean("musicBean",ClassicalMusic.class);
//        System.out.println(classicalMusic.getSound());

        context.close();

//        Music music = new RapMusic();
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();


//
//        ClassicalMusic classicalMusic = new ClassicalMusic();
//        RapMusic rapMusic = new RapMusic();
//        RockMusic rockMusic = new RockMusic();
//        List<Music> list = new ArrayList<>();
//        list.add(classicalMusic);
//        list.add(rapMusic);
//        list.add(rockMusic);
//        MusicPlayer musicPlayer1 = new MusicPlayer(list);
//
//        musicPlayer1.playMusic();
    }
}

package com.example.spring.SpringCore.Lesson;

import org.springframework.beans.factory.annotation.Value;

import java.util.Random;

public class MusicPlayerApple {
    @Value("${musicPlayer.namePlayer}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int value;
    private ClassicalMusic classicalMusic;
    private RapMusic rapMusic;

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public MusicPlayerApple(ClassicalMusic classicalMusic, RapMusic rapMusic) {
        this.classicalMusic = classicalMusic;
        this.rapMusic = rapMusic;
    }

    public void playMusic(Genre genre) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        if (genre == Genre.classical) {
            for (int i = 0; i < classicalMusic.listMusic().size(); i++) {
                System.out.println(classicalMusic.listMusic().get(randomNumber));
                break;
            }
        } else {
            for (int i = 0; i < rapMusic.listMusicRap().size(); i++) {
                System.out.println(rapMusic.listMusicRap().get(randomNumber));
                break;
            }
        }
    }

    /*
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rapMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public void playMusic() {
        System.out.println("Воспроизведение: " + music1.getSound());
        System.out.println("Воспроизведение: " + music2.getSound());
    }
**/
}

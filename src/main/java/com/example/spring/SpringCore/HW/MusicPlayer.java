package com.example.spring.SpringCore.HW;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;


public class MusicPlayer {

    private List<MusicInerf> musicList;

    public MusicPlayer(List<MusicInerf> musicList) {
        this.musicList = musicList;
    }
    //    private RockMusicInerf rockMusic;
//
//    private RapMusicInerf rapMusic;
//
//
//    public MusicPlayer(RockMusicInerf rockMusic, RapMusicInerf rapMusic) {
//        this.rockMusic = rockMusic;
//        this.rapMusic = rapMusic;
//    }

    public void play() {
        Random random = new Random();
        int randomGenre = random.nextInt(musicList.size());
        MusicInerf music = musicList.get(randomGenre);
        int randomMusic = random.nextInt(music.getSound().size());

        System.out.println("Музыка из плейлиста: " + music.toString() + "\n" + "◯ "+music.getSound().get(randomMusic));
    }
}

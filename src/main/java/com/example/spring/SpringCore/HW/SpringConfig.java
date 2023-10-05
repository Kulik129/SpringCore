package com.example.spring.SpringCore.HW;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SpringConfig {
    @Bean
    public RapMusicInerf rapMusicInerf(){
        return new RapMusicInerf();
    }
    @Bean
    public RockMusicInerf rockMusicInerf(){
        return new RockMusicInerf();
    }

    @Bean
    public Jazz jazz() {
        return new Jazz();
    }
    public List<MusicInerf> listMusicGenre(){
        List<MusicInerf> list = new ArrayList<>();
        list.add(rockMusicInerf());
        list.add(rapMusicInerf());
        list.add(jazz());
        return list;
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(listMusicGenre());
    }
}

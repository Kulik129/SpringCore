package com.example.spring.SpringCore.HW;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class RockMusicInerf implements MusicInerf {

    @Override
    public List<String> getSound() {
        List<String> list = new ArrayList<>();
        list.add("Nirvana — Smells Like Teen Spirit");
        list.add("Linkin park - In the End");
        list.add("Skillet - Hero");
        list.add("Rammstein - Sonne");
        list.add("Bon Jovi - Livin' On a Prayer");
        list.add("Scorpions — Still Loving You");
        list.add("Metallica — Nothing Else Matters");
        return list;
    }

    @Override
    public String toString() {
        return "RockMusic";
    }
}

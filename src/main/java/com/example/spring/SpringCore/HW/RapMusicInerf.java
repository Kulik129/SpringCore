package com.example.spring.SpringCore.HW;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class RapMusicInerf implements MusicInerf {
    @Override
    public List<String> getSound() {
        List<String> list = new ArrayList<>();
        list.add("GUF - Ice Baby");
        list.add("AK-47 - Тем, кто с нами");
        list.add("Элджей - Розовое вино");
        list.add("Баста - Выпускной");
        list.add("Скриптонит - Ламбада");
        list.add("T-fest - Улети");
        list.add("INSTASAMKA - Mommy");
        return list;
    }
    @Override
    public String toString() {
        return "RapMusic";
    }
}

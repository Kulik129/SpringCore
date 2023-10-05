package com.example.spring.SpringCore.Lesson;

import java.util.ArrayList;
import java.util.List;

public class RapMusic implements Music{
    public List<String> listMusicRap() {
        List<String> list = new ArrayList<>();
        list.add("Guf");
        list.add("AK-47");
        list.add("Элджей");
        return list;
    }
    @Override
    public String getSound() {
        return "репчик";
    }
}

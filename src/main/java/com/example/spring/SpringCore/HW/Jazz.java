package com.example.spring.SpringCore.HW;

import java.util.ArrayList;
import java.util.List;

public class Jazz implements MusicInerf{
    @Override
    public List<String> getSound() {
        List<String> list = new ArrayList<>();
        list.add("Nat King Cole — Route 66");
        list.add("Barry Manilow Marilyn Monroe — I Wanna Be Loved By You");
        list.add("Lisa Ono — Caravan");
        list.add("Stanley Turrentine — Fool On The Hill");
        list.add("CHAMPS — TEQUILLA");
        list.add("Bill Evans — I Love You");
        list.add("Freddy Cole — Waiter, Ask The Man To Play The Blues");
        return list;
    }
    @Override
    public String toString() {
        return "Jazz";
    }
}

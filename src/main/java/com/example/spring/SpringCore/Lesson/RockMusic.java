package com.example.spring.SpringCore.Lesson;

public class RockMusic implements Music{
    /**
     * Реализация метода воспроизведения рок музыки
     * @return рок-музыка
     */
    @Override
    public String getSound() {
        return "рок-музыки";
    }
}

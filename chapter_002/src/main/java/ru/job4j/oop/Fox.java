package ru.job4j.oop;

public class Fox {
    public void tryEat(Ball ball, int position) {
        if (position == 1) {
            System.out.println("Я Fox, Ball я тебя Омномном");
        } else {
            System.out.println("Я Fox, Ball садись ко мне на нос.\nКонец.");
        }
    }
}

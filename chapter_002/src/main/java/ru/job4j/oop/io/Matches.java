package ru.job4j.oop.io;

import java.util.Random;
import java.util.Scanner;

public class Matches {
    Scanner input = new Scanner(System.in);

    public void startGame() {
        boolean run = true;
        while (run) {
            System.out.println("11 !Одинадцать! 11");
            System.out.println("1. Начать игру.");
            System.out.println("2. Выйти.");
            System.out.println("Выберите пункт меню.");
            int startGame = Integer.valueOf(input.nextLine());
            if (startGame == 2) {
                System.out.println("До скорой встречи!");
                run = false;
            } else if (startGame == 1) {
                runGame();
            } else {
                System.out.println("Попробуйте еще раз!.");
            }
        }
    }
    public void runGame() {
        int player = new Random().nextInt(2) + 1;
        int match = 11;
        Matches game = new Matches();
        do {
            player = (player == 1) ? 2 : 1;
            match = match - game.takeGame(match, player);
        } while (match > 0);
        System.out.println("Победил " + player + " игрок.");
        System.out.println("Ещё разок?");
        System.out.println();
    }

    public int takeGame(int match, int player) {
    System.out.println("На столе сейчас " + match + " спичек.");
    System.out.println("Игрок " + player + " выбирите от 1 до 3 спичек.");
    int takeGame;
    do {
        takeGame = Integer.valueOf(input.nextLine());
        if (takeGame > 3 || takeGame < 1 || takeGame > match) {
            System.out.println("Попробуйте еще раз!.");
            }
        } while (takeGame > 3 || takeGame < 1 || takeGame > match);
        return takeGame;
            }
    public static void main(String[]args) {
        Matches matches = new Matches();
        matches.startGame();
    }
}
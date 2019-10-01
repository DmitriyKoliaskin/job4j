package ru.job4j.oop;

public class BallStory {

    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Fox fox = new Fox();
        Wolf wolf = new Wolf();

        hare.tryEat(ball);
        ball.tryEat(ball);
        wolf.tryEat(ball);
        ball.tryEat(ball);
        fox.tryEat(ball, 1);
        ball.tryEat(ball);
        fox.tryEat(ball, 0);
    }
}

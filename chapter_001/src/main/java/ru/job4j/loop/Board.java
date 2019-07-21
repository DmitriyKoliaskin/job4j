package ru.job4j.loop;

/**
 * Чудо шахматная доска построенная в псевдографике.
 * @author Dmitriy Koliaskin (Hipf02@yandex.ru)
 * @version 0.1
 * @since $Id$
 */

public class Board {
    /**
     * @param width ширина
     * @param height высота
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}

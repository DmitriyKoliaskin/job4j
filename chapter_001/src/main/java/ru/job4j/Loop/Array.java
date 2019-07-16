package ru.job4j.Loop;


import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[][] table = new int[5][5];
        int count = 0;
        for (int out = 0; out != 5; out++) {
            for (int inner = 0; inner != 5; inner++) {
                table[out][inner] = count++;
            }
        }
        for (int index = 0; index != 5; index++) {
            System.out.println(Arrays.toString(table[index]));
        }
    }
}

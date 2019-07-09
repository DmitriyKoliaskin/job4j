package ru.job4j.calculate;

public class Size {
    public int add(int left, int right){
        return left + right;
    }

    public void info(int size) {
        System.out.println("Your size is : " + size);
    }

    public static void main(String[] args) {
        Size size = new Size();
        int nike = 10;
        int puma = 50;
        int value = size.add(nike, puma);
        size.info(value);
    }
}


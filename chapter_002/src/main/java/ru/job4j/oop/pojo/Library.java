package ru.job4j.oop.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean Code", 100500);
        Book braveNewWorld = new Book("Brave new world", 450);
        Book island = new Book("Island", 528);
        Book kolobok = new Book("Kolobok", 30);

        Book[] books = new Book[4];

        books[0] = cleanCode;
        books[1] = braveNewWorld;
        books[2] = island;
        books[3] = kolobok;

        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getPage());
        }

        System.out.println("\n" + "Replace 0 to 3" + "\n");
        books[0] = kolobok;
        books[3] = cleanCode;

        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getPage());
        }

        System.out.println("\n" + "Shown only book Clean Code" + "\n");
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if (bk.getName() == "Clean Code") {
                System.out.println(bk.getName() + " - " + bk.getPage());
            }
        }
    }
}
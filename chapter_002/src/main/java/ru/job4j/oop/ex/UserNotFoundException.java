package ru.job4j.oop.ex;

public class UserNotFoundException extends  Exception {
    public UserNotFoundException(String message) {
        super(message);
    }
}

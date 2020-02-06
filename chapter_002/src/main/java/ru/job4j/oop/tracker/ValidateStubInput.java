package ru.job4j.oop.tracker;

public class ValidateStubInput extends  ValidateInput {
    private String[] data;
    private int position;

    public ValidateStubInput(String[] data) {
        this.data = data;
    }

    @Override
    public String askStr(String question) {
        return data[position++];
    }
}

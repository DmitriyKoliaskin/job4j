package ru.job4j.oop.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StartUI {
    private final Input input;
    private final Tracker tracker;
    private final Consumer<String> output;

    public StartUI(Input input, Tracker tracker, Consumer<String> output) {
        this.input = input;
        this.tracker = tracker;
        this.output = output;
    }

    public void init(List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions, output);
            int select = input.askInt("Select: ", actions.size());
            UserAction action = actions.get(select);
            run = action.execute(input, tracker, output);
        }
    }

    private void showMenu(List<UserAction> actions, Consumer<String> output) {
        output.accept("Menu.");
        for (int index = 0; index < actions.size(); index++) {
            output.accept(index + ". " + actions.get(index).name());
        }
    }

    public static void main(String[]args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new CreateAction());
        actions.add(new FindAllAction());
        actions.add(new EditAction());
        actions.add(new DeleteAction());
        actions.add(new FindByIdAction());
        actions.add(new FindByNameAction());
        actions.add(new ExitAction());
        new StartUI(validate, tracker, System.out::println).init(actions);
    }
}
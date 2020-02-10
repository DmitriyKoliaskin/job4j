package ru.job4j.oop.tracker;

import java.util.ArrayList;

public class StartUI {

    public void init(Input input, Tracker tracker, ArrayList<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", actions.size());
            UserAction action = actions.get(select);
        run = action.execute(input, tracker);
        }
    }

        private void showMenu(ArrayList<UserAction> actions) {
            System.out.println("Menu:");
            for (int i = 0; i < actions.size(); i++) {
                System.out.println(i + ". " + actions.get(i).name());
            }
        }

    public static void main(String[]args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        ArrayList<UserAction> actions = new ArrayList<>();
        new CreateAction();
        new FindAllAction();
        new EditAction();
        new DeleteAction();
        new FindByIdAction();
        new FindByNameAction();
        new ExitAction();

        new StartUI().init(validate, tracker, actions);
    }
}
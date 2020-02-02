package ru.job4j.oop.tracker;

public class StartUI {
    private Input input;
    private Tracker tracker;


    public void init(Input input, Tracker tracker,UserAction[] actions) {
        boolean run = true;
        while (run) {
            int select;
            do {
                this.showMenu(actions);
                select = input.askInt("Select: ");
            } while (select < 0 || select > 6);
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

        private void showMenu(UserAction[] actions) {
            System.out.println("Menu:");
            for (int i = 0; i < actions.length; i++) {
                System.out.println(i + ". " + actions[i].name());
            }
        }

    public static void main(String[]args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new FindAllAction(),
                new EditAction(),
                new DeleteAction(),
                new FindByIdAction(),
                new FindByNameAction(),
                new ExitAction()
        };
        new StartUI().init(input, tracker, actions);
    }
}
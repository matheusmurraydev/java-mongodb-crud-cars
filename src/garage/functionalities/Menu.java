package garage.functionalities;

import print.Print;
import print.Colors;
import input.Input;

public class Menu {

    private int userChoice;

    public Menu() {
        showWelcomeMessage();
        showSystemFunctionalities();
        this.captureUserChoice();
        this.executeChosenFunctionality();
    }

    private static void showWelcomeMessage() {
        Print.welcomeMessage(print.Colors.PURPLE);
    }

    private static void showSystemFunctionalities() {
        Print.explanationMessage(Colors.BLUE);
        Print.createMessage(Colors.CYAN);
        Print.readMessage(Colors.CYAN);
        Print.updateMessage(Colors.CYAN);
        Print.destroyMessage(Colors.CYAN);
    }

    private void captureUserChoice() {
        Input input = new Input();
        this.setUserChoice(input.captureInt());
    }

    private void setUserChoice(int userChoice) {
        this.userChoice = userChoice;
    }

    private void executeChosenFunctionality() {
        Functionality.execute(this.userChoice);
    }
}

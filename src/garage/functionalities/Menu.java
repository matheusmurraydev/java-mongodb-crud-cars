package garage.functionalities;

import print.Print;
import print.Colors;
import input.Input;
import org.bson.Document;
import com.mongodb.client.MongoCollection;

public class Menu {

    private int userChoice;

    public Menu(MongoCollection<Document> collectionCars) {
        showWelcomeMessage();
        showSystemFunctionalities();
        this.captureUserChoice();
        this.executeChosenFunctionality(collectionCars);
        showMenuAgain(collectionCars);
    }

    private static void showWelcomeMessage() {
        Print.welcomeMessage(print.Colors.PURPLE);
    }

    private static void showSystemFunctionalities() {
        Print.explanationMessage(Colors.BLUE);
        Print.createMessage(Colors.CYAN);
        Print.readMessage(Colors.CYAN);
        Print.exitMessage(Colors.RED);
    }

    private void captureUserChoice() {
        Input input = new Input();
        this.setUserChoice(input.captureInt());
    }

    private void setUserChoice(int userChoice) {
        this.userChoice = userChoice;
    }

    private void executeChosenFunctionality(MongoCollection<Document> collectionCars) {
        new Functionality(collectionCars).execute(this.userChoice);
    }
    
    private void showMenuAgain(MongoCollection<Document> collectionCars) {
        new Menu(collectionCars);
    }
}

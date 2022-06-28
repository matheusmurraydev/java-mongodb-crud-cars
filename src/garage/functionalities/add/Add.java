package garage.functionalities.add;

import org.bson.Document;
import com.mongodb.client.MongoCollection;
import garage.models.Car;
import input.Input;
import print.Colors;

public class Add
{
    private Car car;
    private String userInput;

    public Add(MongoCollection<Document> collectionCars) {

        this.instantiateCar();

        showInitialMessage();

        askUserForBrand();
        this.captureInformationInputedByUser();
        this.setCarBrand();

        askUserForModel();
        this.captureInformationInputedByUser();
        this.setCarModel();

        askUserForYear();
        this.captureInformationInputedByUser();
        this.setCarYear();

        this.insertCarIntoDatabase(collectionCars);

        showSuccessMessage();

    }

    private void instantiateCar() {
        this.car = new Car();
    }

    private void setCarBrand() {
        this.car.setBrand(this.userInput);
    }

    private void setCarModel() {
        this.car.setModel(this.userInput);
    }

    private void setCarYear() {
        this.car.setYear(this.userInput);
    }
    
    private static void showInitialMessage() {
        Print.initialMessage(Colors.PURPLE);
    }
    
    private static void askUserForBrand() {
        Print.askingForBrand(Colors.BLUE);
    }
    
    private static void askUserForModel() {
        Print.askingForModel(Colors.BLUE);
    }
    
    private static void askUserForYear() {
        Print.askingForYear(Colors.BLUE);
    }
    
    private void captureInformationInputedByUser() {
        String userInput = new Input().captureString();
        this.setUserInput(userInput);
    }

    private void setUserInput(String input) {
        this.userInput = input;
    }
    
    private void insertCarIntoDatabase(MongoCollection<Document> collectionCars) {
        this.car.setDocument();
        collectionCars.insertOne(this.car.getDocument());
    }

    private void showSuccessMessage() {
        Print.succesMessage(this.car.getBrand(), Colors.GREEN);
    }
}

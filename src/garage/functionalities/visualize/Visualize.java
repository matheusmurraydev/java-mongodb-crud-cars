package garage.functionalities.visualize;

import org.bson.Document;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;

import garage.functionalities.Menu;
import garage.models.Car;
import input.Input;
import print.Colors;
import print.Print;

public class Visualize {

    private Car[] cars;
    private int counter;
    private String counterString;

    public Visualize(MongoCollection<Document> collectionCars) {

        setCounterToZero();
        setCounterString();

        FindIterable<Document> allCars = collectionCars.find();


        this.cars = new Car[20];
        for (Document car : allCars) {

            this.cars[this.counter] = new Car(
                this.counterString,
                car.get("_id").toString(),
                car.get("brand").toString(),
                car.get("model").toString(),
                car.get("year").toString()
            );

            this.cars[this.counter].print();
            
            this.increaseCounterByOne();
            setCounterString();
        }

        Print.print("Would you like to update? Type 1", Colors.PURPLE);
        Print.print("Would you like to delete? Type 2", Colors.PURPLE);
        Print.print("Would you like to go back to Menu? Type 0", Colors.PURPLE);

        int choice = new Input().captureInt();
        if (choice == 1) {
            Print.print("Which CarID would you like to update?", Colors.GREEN);
            choice = new Input().captureInt();
            Print.print("Which field would you like to update?", Colors.GREEN);
            String field = new Input().captureString();
            Print.print("To what value?", Colors.GREEN);
            String value = new Input().captureString();
            this.cars[choice].update(collectionCars, field, value);
            Print.print("Updated Successfully!", Colors.GREEN);

        } else if (choice == 2) {
            Print.print("Which CarID would you like to delete?", Colors.RED);
            choice = new Input().captureInt();
            this.cars[choice].delete(collectionCars);
            Print.print("Deleted Successfully!", Colors.GREEN);
        } else {
            new Menu(collectionCars);
        }
    }

    private void setCounterToZero() {
        this.counter = 0;
    }

    private void increaseCounterByOne() {
        this.counter++;
    }

    private void setCounterString() {
        this.counterString = toString(this.counter);
    }

    private static String toString(int i) {
        return String.valueOf(i);
    }
}

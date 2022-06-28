package garage.functionalities;

import org.bson.Document;
import com.mongodb.client.MongoCollection;
import garage.functionalities.add.Add;
import garage.functionalities.exit.Exit;
import garage.functionalities.visualize.Visualize;

public class Functionality
 
{
    private MongoCollection<Document> collectionCars;

    public Functionality(MongoCollection<Document> collectionCars) {
        this.setCollectionCars(collectionCars);
    }

    private void setCollectionCars(MongoCollection<Document> collectionCars) {
        this.collectionCars = collectionCars;
    }

    public void execute(int option) {
        switch (option) {
            case 1:
                this.addACarToYourGarage();
                break;
            case 2:
                this.seeCarsInYourGarage();
                break;
            case 0:
                this.exit();
                break;
        }
    }

    private void addACarToYourGarage() {
        new Add(this.collectionCars);
    }

    private void seeCarsInYourGarage() {
        // new Check();
        new Visualize(this.collectionCars);
    }

    private void exit() {
        new Exit();
    }

}

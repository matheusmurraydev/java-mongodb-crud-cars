package garage;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import garage.functionalities.Menu;

public class Garage {

    private MongoDatabase databaseMongo;
    private MongoCollection<Document> collectionCars;

    public Garage() {
        this.prepareDatabaseToBeAccessed();
        this.showMenu();
    }

    private void prepareDatabaseToBeAccessed() {
        this.setDatabaseMongo();
        this.setCollectionCars();
    }

    private void setDatabaseMongo() {
        this.databaseMongo = new Database(true).getMongoDatabase();
    }

    private void setCollectionCars() {
        this.collectionCars = this.databaseMongo.getCollection("cars");
    }

    private void showMenu() {
        new Menu(this.collectionCars);
    }
}

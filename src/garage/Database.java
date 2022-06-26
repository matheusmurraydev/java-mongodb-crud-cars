package garage;

import java.util.logging.Level;
import java.util.logging.Logger;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class Database {

    private MongoClient mongoClient;
    private MongoDatabase mongoDatabase;

    public Database() {
        this.setMongoClient();
        this.setMongoDatabase();
    }

    public Database(boolean suppressMongoConsoleLogging) {
        supressMongoConsoleLogging();
        this.setMongoClient();
        this.setMongoDatabase();
    }

    public static void supressMongoConsoleLogging() {
        Logger.getLogger("org.mongodb.driver").setLevel(Level.OFF);;
    }

    private void setMongoClient() {
        this.mongoClient = new MongoClient(new MongoClientURI("<removed-while-dot-env-is-not-implemented>"));
    }
    
    private void setMongoDatabase() {
        this.mongoDatabase = this.mongoClient.getDatabase("digitalgarage");
    }

    public MongoDatabase getMongoDatabase() {
        return this.mongoDatabase;
    }
}

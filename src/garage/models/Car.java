package garage.models;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;

import garage.functionalities.visualize.Print;
import print.Colors;

public class Car {

    private String id;

    private String carId;

    private String brand;

    private String model;

    private String year;

    private Document document;

    public Car() {}

    public Car(String id, String carId, String brand, String model, String string) {
        this.id = id;
        this.carId = carId;
        this.brand = brand; 
        this.model = model;
        this.year = string;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getId() {
        return this.id;
    }

    public String getCarId() {
        return this.carId;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public String getYear() {
        return this.year;
    }

    public void setDocument() {
        this.document = new Document()
                .append("_id", new ObjectId())
                .append("brand", this.brand)
                .append("model", this.model)
                .append("year", this.year);
    }

    public Document getDocument() {
        return this.document;
    }

    public void print() {
        Print.car(this.id, this.brand, this.model, this.year, Colors.WHITE);
    }

    public void update(MongoCollection<Document> collection, String field, String value) {
        ObjectId objId = new ObjectId(this.carId);
        collection.updateOne(Filters.eq("_id", objId), new Document("$set", new Document(field, value)));
    }

    public void delete(MongoCollection<Document> collection) {
        ObjectId objId = new ObjectId(this.carId);
        collection.deleteOne(Filters.eq("_id", objId));
    }
}

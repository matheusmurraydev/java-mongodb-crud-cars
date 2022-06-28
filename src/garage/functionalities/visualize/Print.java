package garage.functionalities.visualize;

import print.Colors;

public class Print {

    public static void initialMessage() {
        print("These are your cars:", Colors.PURPLE);
    }

    public static void updateOrDeleteMessage() {
        print("Would you like to Update? Type 1", Colors.PURPLE);
        print("Would you like to Delete? Type 2", Colors.PURPLE);
    }

    public static void car(String carId, String brand, String model, String year, String color) {
        print(generateText(carId, brand, model, year), color);
    }

    private static String generateText(String id, String brand, String model, String year) {
        return "Car ID: " + id + " " + brand + " " + model + " " + year;
    }

    public static void print(String text, String color) {
        System.out.println(color + text + Colors.RESET);
    }
}

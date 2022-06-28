package garage.functionalities.add;

import print.Colors;

public class Print
{
    public static void allMessages() {
        initialMessage(Colors.PURPLE);
        askingForBrand(Colors.BLUE);
        askingForModel(Colors.BLUE);
        askingForYear(Colors.BLUE);
    }

    public static void initialMessage(String color) {
        print("Let's add a new car to your @digitalgarage.", color);
    }

    public static void askingForBrand(String color) {
        print("Type your car Brand...", color);
    }

    public static void askingForModel(String color) {
        print("Type your car Model...", color);
    }

    public static void askingForYear(String color) {
        print("Type your car Year...", color);
    }

    public static void succesMessage(String carBrand, String color) {
        print("Your " + carBrand + " was successfully added to your @digitalgarage", color);
    }
    
    public static void print(String text, String color) {
        System.out.println(color + text + Colors.RESET);
    }
}

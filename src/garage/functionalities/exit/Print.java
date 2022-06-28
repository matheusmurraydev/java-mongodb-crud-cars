package garage.functionalities.exit;

import print.Colors;

public class Print {

    public static void exitingMessage() {
        print("See you soon! Bye, @digitalgarage", Colors.RED);
    }

    public static void print(String text, String color) {
        System.out.println(color + text + Colors.RESET);
    }
}

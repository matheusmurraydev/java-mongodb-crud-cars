package print;

public class Print 
{
    public static void allMessages() {
        welcomeMessage(Colors.PURPLE);
        explanationMessage(Colors.BLUE);
        createMessage(Colors.CYAN);
        readMessage(Colors.CYAN);
        updateMessage(Colors.CYAN);
        destroyMessage(Colors.CYAN);
        exitMessage(Colors.RED);
    }
    
    public static void welcomeMessage(String color) {
        print("Welcome to @digitalgarage. The hub for car enthusiasts.", color);
    }
    
    public static void explanationMessage(String color) {
        print("This is your garage! What you wish to do?", color);
    }
    
    public static void createMessage(String color) {
        print("Add a new car to your garage? Type 1.", color);
    }
    
    public static void readMessage(String color) {
        print("Visualize the cars in your garage? Type 2.", color);
    }
    
    public static void updateMessage(String color) {
        print("Exclude a car from your garage? Type 3.", color);
    }
    
    public static void destroyMessage(String color) {
        print("Update a car from your garage? Type 4", color);
    }
    
    public static void exitMessage(String color) {
        print("Exit? Type 0", color);
    }
    
    public static void print(String text, String color) {
        System.out.println(color + text + Colors.RESET);
    }
    
    public static void printInt(int integer, String color) {
        System.out.println(color + integer + Colors.RESET);
    }
    
    public static void printIntGreen(int integer) {
        System.out.println(Colors.GREEN + integer + Colors.RESET);
    }
}

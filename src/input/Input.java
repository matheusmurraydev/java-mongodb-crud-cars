package input;
import java.util.Scanner;

public class Input {
    
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public int captureInt() {
        return this.scanner.nextInt();
    }

    public String captureString() {
        return this.scanner.nextLine();
    }
}

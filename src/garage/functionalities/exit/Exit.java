package garage.functionalities.exit;

public class Exit
{
    public Exit() {
        showExitMessage();
        exit();
    }

    private void showExitMessage() {
        Print.exitingMessage();
    }

    private void exit() {
        System.exit(0);
    }
}

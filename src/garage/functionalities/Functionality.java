package garage.functionalities;

import garage.functionalities.add.Add;

public class Functionality 
{
    public static void execute(int option) {
        switch (option) {
            case 1:
                addACarToYourGarage();
                break;
            case 2:
                seeCarsInYourGarage();
                break;
            case 3:
                updateCarsInYourGarage();
                break;
            case 4:
                deleteCarsFromYourGarage();
                break;
        }
    }

    private static void addACarToYourGarage() {
        new Add();
    }

    private static void seeCarsInYourGarage() {
        // new Check();
        new Add();
    }

    private static void updateCarsInYourGarage() {
        // new Update();
        new Add();
    }

    private static void deleteCarsFromYourGarage() {
        // new Delete();
        new Add();
    }
}

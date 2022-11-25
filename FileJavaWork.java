
import java.util.EnumMap;
import java.util.Scanner;

enum Extras {
    NAVIGATION(500), Automatic(3000), AirConditional(850);

    private final double price;

    public double getPrice() {
        return price;
    }


    Extras(double price) {
        this.price = price;
    }

}

public class FileJavaWork {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EnumMap<Extras, String> map = new EnumMap<Extras, String>(Extras.class);
        int countOptions = 0;
        int countNavigation = 0;
        int countAutomatic = 0;
        int countAirCondition = 0;
        map.put(Extras.NAVIGATION, "1");
        map.put(Extras.Automatic, "2");
        map.put(Extras.AirConditional, "3");

        int option = 0;
        System.out.println("You are welcome in our car extras menu!");
        printExtrasCatalog();
        double carPriceBasicModel = 25000;

        while (option != 4 && countOptions < 3) {
            System.out.println("Please select an option: ");
            option = scanner.nextInt();
            countOptions++;
            if (option == 1 && countNavigation < 1) {
                countNavigation++;
                carPriceBasicModel = carPriceBasicModel + 500;
                selectExtra(Extras.NAVIGATION);
                map.remove(Extras.NAVIGATION);
                System.out.println("There left only options" + map + " and for exit from the menu=4");
            } else if (option == 2 && countAutomatic < 1) {
                countAutomatic++;
                carPriceBasicModel = carPriceBasicModel + 3000;
                selectExtra(Extras.Automatic);
                map.remove(Extras.Automatic);
                System.out.println("There are only  options" + map + " and for exit from the menu=4");
            } else if (option == 3 && countAirCondition < 1) {

                carPriceBasicModel = carPriceBasicModel + 850;
                selectExtra(Extras.AirConditional);
                map.remove(Extras.AirConditional);
                countAirCondition++;
                System.out.println("There are only options" + map + " and for exit from the menu=4");
            } else if (option == 4) {
                System.out.println("Thank you!");
            } else {
                System.out.println("Invalid option, please select again!");
                countOptions--;
                if (countOptions < 0) {
                    countOptions = 0;
                }

            }

        }

        System.out.println("The price with added extras will be: " + carPriceBasicModel + "lv.");
    }

    public static void printExtrasCatalog() {

        System.out.println("For Navigation press option 1.");
        System.out.println("For Automatic press option 2.");
        System.out.println("For Air conditional press option 3.");
        System.out.println("For exit from menu , please press option 4.");


    }


    public static void selectExtra(Extras extra) {
        switch (extra) {
            case Automatic:
                System.out.println("You choose automatic gear box. ");
                System.out.print("The price for this is: " + extra.getPrice() + " lv.\n");
                break;
            case NAVIGATION:
                System.out.println("You choose navigation map.");
                System.out.print("The price for this is: " + extra.getPrice() + " lv.\n");
                break;
            case AirConditional:
                System.out.print("You choose extra air condition. ");
                System.out.println("The price for this is: " + extra.getPrice() + " lv.\n");
                break;
        }

    }

}



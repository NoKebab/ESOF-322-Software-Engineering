import java.util.Scanner;

/*
 * TODO: ADD COMMENTS
 * 
 */
public class Client {
    
    /*
     * TODO: ADD COMMENTS
     */
//    public static Inventory inventory;
//    public static Scanner console = new Scanner(System.in);

    /*
     * TODO: ADD COMMENTS
     * 
     */
    public static void main(String[] args) {
//
//        // Inventory0
//        System.out.println("Create Inventory0");
//        inventory = new Inventory0();
//        run();
//
//        // Inventory1
//        System.out.println("Create Inventory1");
//        inventory = new Inventory1();
//        run();
//
//        // Inventory2
//        System.out.println("Create Inventory2");
//        inventory = new Inventory2();
//        run();
        revisedRun();
    }

//    /**
//     * Use this function as a helper to test a Client interaction with the chosen inventory module
//     */
//    public static void run() {
//        // request selection of sort
//        System.out.print("Sorting Options:\n1 for BubbleSort\n2 for MergeSort\n3 for QuickSort: ");
//        int option = console.nextInt();
//
//        // call default sorting strategy
//        System.out.println("\nCall preformSort() - (i.e. default sorting behavior)");
//        inventory.preformSort(); // Run default sorting method
//
//        // dynamically switch sorting strategies and execute it
//        System.out.println("\nSet sorting_method dynamically");
//        switch (option) {
//            case 1 -> inventory.setSortMethod(new BubbleSort());
//            case 2 -> inventory.setSortMethod(new MergeSort());
//            case 3 -> inventory.setSortMethod(new QuickSort());
//        }
//        System.out.println("Call preformSort()");
//        inventory.preformSort(); // Run default sorting method
//    }

    /**
     * Generate a new inventory for an indefinite amount of times and perform a default sort
     * and pick a new default sort
     */
    public static void revisedRun() {
        Inventory inventory = new Inventory();
        Scanner console = new Scanner(System.in);

        do {
            // request selection of sort
            System.out.println("Please pick a new sorting option");
            System.out.print("Sorting Options:\n1 for BubbleSort\n2 for MergeSort\n3 for QuickSort\n4 for exit: ");
            int option = console.nextInt();
            // call default sorting strategy
            System.out.println("\nSort using default method: ");
            inventory.preformSort(); // Run default sorting method
            // dynamically switch sorting strategies and execute it
            switch (option) {
                case 1 -> inventory.setSortMethod(new BubbleSort());
                case 2 -> inventory.setSortMethod(new MergeSort());
                case 3 -> inventory.setSortMethod(new QuickSort());
                default -> {
                    return;
                }
            }
            System.out.println("\nPerform the new default sort: ");
            inventory.preformSort(); // Run new default sorting method
            System.out.println();
        } while(true);
    }
}

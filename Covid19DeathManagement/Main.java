import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Country> countryMap = new HashMap<>(); // HashMap to store countries

        // Pre-populating the map with initial countries
        countryMap.put("USA", new DevelopedCountry("USA"));
        countryMap.put("India", new DevelopingCountry("India"));

        while (true) {
            System.out.println("1. Add COVID Case");
            System.out.println("2. Display All Info");
            System.out.println("3. Add New Country");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            // Input validation for menu choice
            int choice;
            while (true) {
                try {
                    choice = Integer.parseInt(scanner.nextLine()); // Read user input
                    break; // Exit loop if input is valid
                } catch (NumberFormatException e) {
                    System.out.print("Invalid input. Please enter a number: ");
                }
            }

            switch (choice) {
                case 1: // Add COVID case
                    System.out.print("Enter country name: ");
                    String countryName = scanner.nextLine();
                    System.out.print("Enter total cases: ");
                    int totalCases = getValidInteger(scanner, "total cases");
                    System.out.print("Enter total deaths: ");
                    int totalDeaths = getValidInteger(scanner, "total deaths");

                    Country country = countryMap.get(countryName); // Retrieve country using HashMap
                    if (country != null) {
                        DeathCase deathCase = new DeathCase(countryName, totalCases, totalDeaths);
                        country.addDeathCase(deathCase);
                        System.out.println("COVID case added.");
                    } else {
                        System.out.println("Country not found.");
                    }
                    break;

                case 2: // Display all info
                    for (Country c : countryMap.values()) {
                        c.displayInfo();
                    }
                    break;

                case 3: // Add new country
                    System.out.print("Enter new country name: ");
                    String newCountryName = scanner.nextLine();
                    System.out.print("Is it a developed or developing country? (d/dev / n/dev): ");
                    String type = scanner.nextLine().trim().toLowerCase();

                    if (type.equals("d") || type.equals("dev")) {
                        countryMap.put(newCountryName, new DevelopedCountry(newCountryName));
                        System.out.println("Developed country added.");
                    } else if (type.equals("n") || type.equals("dev")) {
                        countryMap.put(newCountryName, new DevelopingCountry(newCountryName));
                        System.out.println("Developing country added.");
                    } else {
                        System.out.println("Invalid type. Country not added.");
                    }
                    break;

                case 4: // Exit
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default: // Invalid option handling
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Method to get a valid integer input from the user
    private static int getValidInteger(Scanner scanner, String prompt) {
        while (true) {
            System.out.print("Enter " + prompt + ": ");
            try {
                return Integer.parseInt(scanner.nextLine()); // Attempt to parse input as an integer
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid integer. ");
            }
        }
    }
}






# COVID-19 Death Management System

## Project Overview
This Java console application simulates a COVID-19 death management system. It allows users to add COVID-19 death cases for different countries, display all information about countries and their respective cases, and manage this data using object-oriented programming principles, including inheritance, polymorphism, and exception handling.

## Features
- Add COVID-19 death cases for specific countries.
- Display information about all countries and their associated death cases.
- Utilize Java Collections (ArrayList and HashMap) for efficient data management.
- Handle user input and exceptions gracefully.

## Classes
### 1. `Country` (Abstract Class)
- **Attributes:**
  - `String name`: Name of the country.
  - `List<DeathCase> deathCases`: List to store death cases associated with the country.
- **Methods:**
  - `addDeathCase(DeathCase deathCase)`: Adds a death case to the country.
  - `abstract void displayInfo()`: Abstract method to display country-specific information.
  - `void displayAllDeathCases()`: Displays all death cases for the country.

### 2. `DevelopedCountry` (Subclass of Country)
- Overrides the `displayInfo()` method to provide specific details for developed countries.

### 3. `DevelopingCountry` (Subclass of Country)
- Overrides the `displayInfo()` method to provide specific details for developing countries.

### 4. `DeathCase`
- **Attributes:**
  - `String countryName`: Name of the country where the case occurred.
  - `int totalCases`: Total number of COVID-19 cases.
  - `int totalDeaths`: Total number of COVID-19 deaths.
- **Methods:**
  - `toString()`: Returns a string representation of the death case details.

### 5. `Main`
- Contains the main method that drives the application.
- Implements the console-based user interface, allowing users to interact with the system.

## How to Run the Application
1. Ensure you have Java Development Kit (JDK) installed on your machine.
2. Clone the repository or download the project files.
3. Open the project in your preferred IDE (e.g., Visual Studio Code).
4. Compile and run the `Main` class.
5. Follow the on-screen prompts to add COVID-19 death cases and display information.

## Example Interaction
Add COVID Case
Display All Info
Exit Choose an option: 1 Enter country name: USA Enter total cases: 500000 Enter total deaths: 10000 COVID case added.
Choose an option: 2 USA: Total Cases - 500000, Total Deaths - 10000



## Exception Handling
The application includes exception handling to manage potential runtime errors, such as invalid user input or when a country is not found.

## Future Improvements
- Implement data persistence (e.g., saving data to a file).
- Enhance the user interface with more features.
- Add reporting capabilities for detailed statistics.

## License
This project is open-source and available under the MIT License.


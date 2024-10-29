public class DevelopedCountry extends Country {
    public DevelopedCountry(String name) {
        super(name);
    }

    @Override
    public void displayInfo() {
        System.out.println("Country: " + name);
        System.out.println("Death Cases:");
        for (DeathCase deathCase : deathCases) {
            System.out.println("  - " + deathCase);
        }
    }
}


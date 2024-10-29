public class DevelopingCountry extends Country {
    public DevelopingCountry(String name) {
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

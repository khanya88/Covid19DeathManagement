import java.util.ArrayList;
import java.util.List;

public abstract class Country {
    protected String name;
    protected List<DeathCase> deathCases = new ArrayList<>();

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addDeathCase(DeathCase deathCase) {
        deathCases.add(deathCase);
    }

    public abstract void displayInfo(); // Abstract method to be overridden
}



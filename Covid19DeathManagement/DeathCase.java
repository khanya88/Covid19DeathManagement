public class DeathCase {
    private String countryName;
    private int totalCases;
    private int totalDeaths;

    public DeathCase(String countryName, int totalCases, int totalDeaths) {
        this.countryName = countryName;
        this.totalCases = totalCases;
        this.totalDeaths = totalDeaths;
    }

    @Override
    public String toString() {
        return "Country: " + countryName + ", Total Cases: " + totalCases + ", Total Deaths: " + totalDeaths;
    }
}


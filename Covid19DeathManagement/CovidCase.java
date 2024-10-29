public class CovidCase {
    protected String country;
    protected int totalCases;

    public CovidCase(String country, int totalCases) {
        this.country = country;
        this.totalCases = totalCases;
    }

    public void displayInfo() {
        System.out.println("Country: " + country + ", Total Cases: " + totalCases);
    }
}

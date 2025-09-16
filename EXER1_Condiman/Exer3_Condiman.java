class City {
    private String name;
    private String country;

    public void setName(String name) {
        this.name = name;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }
}
public class CityInfo {
    public static void main(String[] args) {
        City city1 = new City();

        city1.setName("Mati");
        city1.setCountry("Philippines");

        System.out.println("City: " + city1.getName());
        System.out.println("Country: " + city1.getCountry());
    }
}
package ENUM;

public class MainCountries {
    public static void main(String[] args) {
        ECountries.Countries Belarus = ECountries.Countries.valueOf("BELARUS");
        System.out.println(ECountries.Countries.BELARUS==Belarus);
        System.out.println(Belarus.getArea());
        System.out.println(Belarus.getPopulation());
    }
}

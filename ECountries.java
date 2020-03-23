package ENUM;

public class ECountries {
    enum Countries implements ICountries {
        AUSTRALIA (7700,20.1),
        BELARUS (207,10.3),
        BRAZIL (8500,186.1),
        CANADA (9900,32.8),
        CHINA (9590,1306.3),
        GERMANY (357,82.4),
        INDIA (3300,1080.3),
        ITALY (300,58.1),
        RUSSIA (17000,143.4),
        USA (9600,295.7);
        public int area;
        public double population;

        Countries (int area,double population) {
            this.area = area;
            this.population = population;

        }


        @Override
        public int getArea(){
            return area;}

        @Override
        public double getPopulation(){
            return population;}
        }
    }

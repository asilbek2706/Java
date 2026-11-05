public class Main {
    public static void main(String[] args) {

        CompanyManagement companyManager = new CompanyManagement();

        companyManager.addPermanentEmployee("Ali", "Aliyev", 1000d, "Aparatchi", "1a");
        companyManager.addPermanentEmployee("Vali", "Valiyev", 700d, "Choychi", "2c");

        companyManager.addSeasonalEmployee("Eshmat", "Eshmatov", 500.0, "Temir kesuvchi", "spring");
        companyManager.addSeasonalEmployee("Toshmat", "Toshmatov", 400.0, "Svarchik", "winter");

        companyManager.addTemporaryEmployee("Aziz", "Azizov", 100.0, "Wifi tuzatovchi", 12);

        companyManager.printAllEmployeeDetail();
    }
}
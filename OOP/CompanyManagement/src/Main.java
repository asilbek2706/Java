public class Main {
    public static void main(String[] args) {

        CompanyManagement companyManager = new CompanyManagement();

        companyManager.addPermanentEmployee("Ali", "Aliyev", 1000d, "Aparatchi", "1a");
        companyManager.addPermanentEmployee("Vali", "Valiyev", 700d, "Choychi", "2c");

        companyManager.addSeasonalEmployee("Eshmat", "Eshmatov", 500.0, "Temir kesuvchi", "spring");
        companyManager.addSeasonalEmployee("Toshmat", "Toshmatov", 400.0, "Svarchik", "winter");

        companyManager.addTemporaryEmployee("Aziz", "Azizov", 100.0, "Wifi tuzatovchi", 12);

        companyManager.addPartnerEmployee("Alibek", "Aliyev", 50.0, "Changchi", "Changchung");
        companyManager.addEarEmployee("Quloq", "Quloqov", 80.0, "Quloq");

//        companyManager.printAllEmployeeDetail();
        companyManager.printAllEmployeeType();
//        companyManager.showAllSalaryAfterAllTaxes();
    }
}
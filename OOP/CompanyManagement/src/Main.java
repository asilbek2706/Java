public class Main {
    public static void main(String[] args) {

        CompanyManagement companyManager = new CompanyManagement();

        companyManager.addPermanentEmployee("Ali", "Aliyev", 1000d, "Aparatchi", "1a");
        companyManager.addPermanentEmployee("Vali", "Valiyev", 700d, "Choychi", "1d");

        companyManager.addSeasonalEmployee("Toshmat", "Toshmatov", 1000d, "Aparatchi", "winter");
        companyManager.addSeasonalEmployee("Eshmat", "Eshmatov", 700d, "Choychi", "spring");

        companyManager.addTemporaryEmployee("Ali", "Aliyev", 1000d, "Aparatchi", 12);
    }
}
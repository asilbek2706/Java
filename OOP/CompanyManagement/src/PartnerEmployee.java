public class PartnerEmployee extends Employee {
    private String companyName;

    public PartnerEmployee() {
    }

    public PartnerEmployee(String name, String surname, Double salary, String work, String companyName) {
        super(name, surname, salary, work);
        this.companyName = companyName;
    }

    @Override
    public String getEmployeeType() {
        return "Partner";
    }

    public Double getOneTimeBonus(){
        return getSalary() * 0.75;
    }

    @Override
    public Double calculateInsuranceTax() {
        return 0.0;
    }

    public Double calculatePensionTax(){
        return getSalary() * 0.05;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}

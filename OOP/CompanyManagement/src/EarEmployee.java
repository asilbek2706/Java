public class EarEmployee extends Employee {

    public EarEmployee() {
    }

    public EarEmployee(String name, String surname, Double salary, String work) {
        super(name, surname, salary, work);
    }

    @Override
    public String getEmployeeType() {
        return "Ear";
    }

    @Override
    public Double calculatePensionTax() {
        return getSalary() * 0.01;
    }

    @Override
    public Double getOneTimeBonus() {
        return getSalary() * 0.01;
    }

    @Override
    public Double calculateInsuranceTax() {
        return getSalary() * 0.01;
    }


}

public class EarEmployee extends Employee {

    public EarEmployee() {
    }

    public EarEmployee(String name, String surname, Double salary, String work) {
        super(name, surname, salary, work);
    }

    @Override
    public Double calculatePensionTax() {
        return 1.0;
    }

    @Override
    public Double getOneTimeBonus() {
        return getSalary() * 0.01;
    }

    @Override
    public Double calculateInsuranceTax() {
        return 0.0;
    }


}

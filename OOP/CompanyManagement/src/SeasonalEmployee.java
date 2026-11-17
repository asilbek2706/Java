public class SeasonalEmployee extends Employee {

    private String season;


    public SeasonalEmployee() {
    }

    public SeasonalEmployee(String name, String surname, Double salary, String work, String season) {
        super(name, surname, salary, work);
        this.season = season;
    }

    @Override
    public String getDetail() {
        return super.getDetail() + ", " + season;
    }

    @Override
    public String getEmployeeType() {
        return "Seasonal";
    }

    @Override
    public Double calculatePensionTax() {
        return getSalary()  * 0.065;
    }

    @Override
    public Double getOneTimeBonus() {
        return super.getSalary() * 0.2;
    }

    @Override
    public Double calculateInsuranceTax() {
        return getSalary() * 0.005;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

}

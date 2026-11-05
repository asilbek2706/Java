public class TemporaryEmployee extends Employee {

    private Integer workingHours;

    public TemporaryEmployee(String name, String surname, Double salary, String work, Integer workingHours) {
        super(name, surname, salary, work);
        this.workingHours = workingHours;
    }

    @Override
    public String getDetail() {
        return super.getDetail() + ", " + workingHours;
    }

    public Integer getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(Integer workingHours) {
        this.workingHours = workingHours;
    }
}

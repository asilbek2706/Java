public class PermanentEmployee extends Employee {

    private String room;

    public PermanentEmployee() {
    }

    public PermanentEmployee(String name, String surname, Double salary, String work, String room) {
        super(name, surname, salary, work);
        this.room = room;
    }

    @Override
    public String getDetail() {
        return super.getDetail() + ", " + room;
    }

    public String getEmployeeType(){
        return "Permanent";
    }

    public Double getOneTimeBonus(){
        return getSalary() * 0.5;
    }

    public Double calculatePensionTax(){
        return getSalary() * 0.075;
    }

    public Double calculateInsuranceTax(){
        return getSalary() * 0.01;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
}

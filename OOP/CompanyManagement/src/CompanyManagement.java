public class CompanyManagement {

    private Employee[] employeeArray = new Employee[10];
    private int arrayIndex = 0;

    public PermanentEmployee addPermanentEmployee(String name, String surname, Double salary, String work, String room) {
        PermanentEmployee employee = new PermanentEmployee(name, surname, salary, work, room);

        employeeArray[arrayIndex++] = employee;
        return employee;
    }

    public SeasonalEmployee addSeasonalEmployee(String name, String surname, Double salary, String work, String season) {
        SeasonalEmployee employee = new SeasonalEmployee(name, surname, salary, work, season);

        employeeArray[arrayIndex++] = employee;
        return employee;
    }

    public TemporaryEmployee addTemporaryEmployee(String name, String surname, Double salary, String work, Integer workingHours) {
        TemporaryEmployee employee = new TemporaryEmployee(name, surname, salary, work, workingHours);

        employeeArray[arrayIndex++] = employee;
        return employee;
    }

    public void printAllEmployeeDetail() {

        for (Employee employee : employeeArray) {
            if (employee != null) {
                System.out.println(employee.getDetail());
            }
        }

    }
}

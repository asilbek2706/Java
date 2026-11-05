public class CompanyManagement {

    private PermanentEmployee[] permanentEmployeeArray = new PermanentEmployee[10];
    private int permanentIndex = 0;

    private SeasonalEmployee[] seasonalEmployeeArray = new SeasonalEmployee[10];
    private int seasonalIndex = 0;

    private TemporaryEmployee[] temporaryEmployeeArray = new TemporaryEmployee[10];
    private int temporaryIndex = 0;

    public PermanentEmployee addPermanentEmployee(String name, String surname, Double salary, String work, String room) {
        PermanentEmployee employee = new PermanentEmployee(name, surname, salary, work, room);
//        employee.setName(name);
//        employee.setSurname(surname);
//        employee.setRoom(room);
//        employee.setSalary(salary);
//        employee.setWork(work);

        permanentEmployeeArray[permanentIndex++] = employee;

        return employee;
    }

    public SeasonalEmployee addSeasonalEmployee(String name, String surname, Double salary, String work, String season) {
        SeasonalEmployee employee = new SeasonalEmployee(name, surname, salary, work, season);
//        employee.setName(name);
//        employee.setSurname(surname);
//        employee.setSalary(salary);
//        employee.setWork(work);
//        employee.setSeason(season);

        seasonalEmployeeArray[seasonalIndex] = employee;

        return employee;
    }

    public TemporaryEmployee addTemporaryEmployee(String name, String surname, Double salary, String work, Integer workingHours) {
        TemporaryEmployee employee = new TemporaryEmployee(name, surname, salary, work, workingHours);
//        employee.setName(name);
//        employee.setSurname(surname);
//        employee.setSalary(salary);
//        employee.setWork(work);
//        employee.setWorkingHours(workingHours);

        temporaryEmployeeArray[temporaryIndex] = employee;

        return employee;
    }

    public void printAllEmployeeDetail() {

        for (PermanentEmployee employee : permanentEmployeeArray) {
            if (employee != null) {
                System.out.println(employee.getDetail());
            }
        }

        for (SeasonalEmployee employee : seasonalEmployeeArray) {
            if (employee != null) {
                System.out.println(employee.getDetail());
            }
        }

        for (TemporaryEmployee employee : temporaryEmployeeArray) {
            if (employee != null) {
                System.out.println(employee.getDetail());
            }
        }

    }
}

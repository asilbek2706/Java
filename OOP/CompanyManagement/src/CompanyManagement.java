public class CompanyManagement {

    private PermanentEmployee[] permanentEmployeeArray = new PermanentEmployee[10];
    private int permanentIndex = 0;

    public PermanentEmployee addPermanentEmployee(String name, String surname, Double salary, String work, String room){
        PermanentEmployee employee = new PermanentEmployee();
        employee.setName(name);
        employee.setSurname(surname);
        employee.setRoom(room);
        employee.setSalary(salary);
        employee.setWork(work);

        permanentEmployeeArray[permanentIndex++] = employee;

        return employee;
    }
}

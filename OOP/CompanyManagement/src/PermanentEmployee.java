public class PermanentEmployee extends Employee {

    private String room;

    public PermanentEmployee(String name, String surname, Double salary, String work, String room) {
        super(name, surname, salary, work);
        this.room = room;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
}

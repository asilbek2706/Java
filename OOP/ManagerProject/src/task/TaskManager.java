package task;

import java.util.Scanner;

public class TaskManager {

    public Task[] taskArr = new Task[10];

    public int currentIndex = 0;

    public void start() {
        boolean b = true;

        while (b) {
            menu();
            int n = getMenuNumber():
            switch (n) {
                case 1:
                    Task task = addTask();
                    addToArray(task);
                case 2:

            }
        }
    }

    public void menu() {

        System.out.println("--- Menu ---");
        System.out.println("1 - Add Task");
        System.out.println("2 - Task List");
        System.out.println("3 - Change status by name");
        System.out.println("4 - Change status by id");
        System.out.println("5 - Active task-list");
        System.out.println("0 - EXIT");

    }

    public int getMenuNumber() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose Menu: ");

        return scanner.nextInt();

    }

    public Task addTask() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter title: ");
        String title = scanner.next();

        System.out.println("Enter content: ");
        String content = scanner.next();

        Task task = new Task();
        task.setTitle(title);
        task.setContent(content);
        task.setStatus("ACTIVE");

        return task;
    }

    public void addToArray(Task task) {
        if (taskArr.length == currentIndex){
            Task[] newArr = new Task[taskArr.length * 2];
            System.arraycopy(taskArr, 0, newArr, 0, taskArr.length);
            taskArr = newArr;
        }
        taskArr[currentIndex] = task;
        currentIndex++;
    }
}
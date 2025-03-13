public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(new Task(101, "Submit Assignment", 3));
        manager.addTask(new Task(102, "Complete JavaFX Project", 5));
        manager.addTask(new Task(103, "Prepare for Mid-Term", 4));
        manager.addTask(new Task(104, "Fix Git Issues", 2));

        System.out.println("All Tasks:");
        manager.displayAllTasks();

        System.out.println("\nPrioritizing one task...");
        manager.prioritizeTask();

        System.out.println("\nProcessing Task:");
        manager.processTask();

        System.out.println("\nRemaining Tasks:");
        manager.displayAllTasks();
    }
}


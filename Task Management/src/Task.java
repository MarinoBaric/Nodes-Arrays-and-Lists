public class Task implements Comparable<Task> {

    String taskName;
    int priorityLevel;
    int taskId;

    public Task(int taskId, String taskName, int priorityLevel){
        this.taskName = taskName;
        this.priorityLevel = priorityLevel;
        this.taskId = taskId;
    }


    public String getTaskName() {
        return taskName;
    }


    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }


    public int getPriorityLevel() {
        return priorityLevel;
    }


    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }


    public int getTaskId() {
        return taskId;
    }


    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }



    @Override
    public int compareTo(Task o) {
        if(this.getPriorityLevel() > o.getPriorityLevel()){
            return -1;
        } else if(this.getPriorityLevel() < o.getPriorityLevel()){
            return 1;
        } else{
            if(this.getTaskId() < o.getTaskId()){
                return -1;
            } else{
                return 1;
            }
        }
    }

    @Override
    public String toString() {
        return "Task ID: " + getTaskId() + ", Name: " + getTaskName() + ", Priority: " + getPriorityLevel();
    }

    public static void main(String[] args) {
        Task task1 = new Task(1, "Marin Solo radionica", 4);

        System.out.println(task1);
    }
    
}

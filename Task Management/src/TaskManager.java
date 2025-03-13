public class TaskManager {
    
    private TaskQueue taskQueue;
    private TaskStack taskStack;

    public TaskManager(){
        taskQueue = new TaskQueue();
        taskStack = new TaskStack();
    }

    public void addTask(Task task){
        taskQueue.enqueue(task);
    }

    public void prioritizeTask(){
        taskStack.push(taskQueue.dequeue());
    }

    public void processTask(){
        if(!taskStack.isEmpty()){
            taskStack.pop();
        } else{
            taskQueue.dequeue();
        }
    }

    public void displayAllTasks(){
        // Printing all from queue
        /*for(Task task : taskQueue.getQueue()){
            System.out.println(task);
        }

        for(Task task : taskStack.getStack()){
            System.out.println(task);
        }*/

        System.out.println("Queue taks: " + taskQueue);
        System.out.println("Stack tasks: " + taskStack);
    }
     


}

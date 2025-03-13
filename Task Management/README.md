### **Mid-Term Exam Assignment: Advanced Data Structures in Java**
#### **Topics Covered**:  
Stacks, Queues, Enqueue, Dequeue, Comparisons, `toString()`, Arrays, LinkedLists, Iterators  

---

### **Assignment Title:**  
🚀 **Implementing a Custom Data Structure for Task Management Using Stacks and Queues**  

### **Problem Statement:**  
You are required to implement a **task management system** using a **combination of Stacks and Queues**. The system will allow users to:  
- **Add tasks** to a queue (FIFO - First In, First Out).  
- **Prioritize tasks** by moving them to a stack (LIFO - Last In, First Out).  
- **Process tasks** either in the order they were added (queue) or in the order of priority (stack).  
- **Compare tasks** based on their priority.  
- **Print all tasks using `toString()`** for debugging.  

To complete this assignment, you will need to **extend and implement** multiple classes.  

---

## **📌 Requirements**
### **1. Implement the `Task` class (Comparable)**
The `Task` class should:  
- Store **task name**, **priority level (int, 1-5, 5 is highest)**, and **task ID**.  
- Implement the `Comparable<Task>` interface to compare tasks **based on priority** (higher priority first).  
- Implement a `toString()` method that returns task details in the format:
  ```
  Task ID: 102, Name: Complete JavaFX Project, Priority: 5
  ```

---

### **2. Implement the `TaskQueue` class (Queue Functionality)**
- Store tasks in a **FIFO (First In, First Out) order** using a `LinkedList<Task>`.  
- Implement methods:  
  - `enqueue(Task task)`: Adds a task to the queue.  
  - `dequeue()`: Removes and returns the **oldest** task in the queue.  
  - `peek()`: Returns the **next** task without removing it.  
  - `isEmpty()`: Returns `true` if the queue is empty.  
  - `size()`: Returns the number of tasks.  
  - `toString()`: Returns all tasks in the queue.

---

### **3. Implement the `TaskStack` class (Stack Functionality)**
- Store tasks in a **LIFO (Last In, First Out) order** using a `LinkedList<Task>`.  
- Implement methods:  
  - `push(Task task)`: Adds a task to the stack.  
  - `pop()`: Removes and returns the **most recently added** task.  
  - `peek()`: Returns the **top task** without removing it.  
  - `isEmpty()`: Returns `true` if the stack is empty.  
  - `size()`: Returns the number of tasks.  
  - `toString()`: Returns all tasks in the stack.

---

### **4. Implement the `TaskManager` class**
- Maintain **one `TaskQueue` and one `TaskStack`**.  
- Implement methods:  
  - `addTask(Task task)`: Adds a new task to the queue.  
  - `prioritizeTask()`: Moves the **next task from the queue to the stack** for immediate attention.  
  - `processTask()`: Removes and processes a **task from the stack first** (if available), otherwise from the queue.  
  - `displayAllTasks()`: Prints all tasks in **both the queue and the stack**.  

---

## **Starter Code Provided by Professor**
Your professor has provided **only `Main.java`**, and you need to **implement the missing classes**.

### **Starter Code (`Main.java`)**
```java
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
```

---

## **💯 Grading Criteria**
✅ **Task Class Implementation (15 pts)**  
✅ **TaskQueue Implementation (20 pts)**  
✅ **TaskStack Implementation (20 pts)**  
✅ **TaskManager Implementation (25 pts)**  
✅ **Proper Use of Comparable & Data Structures (10 pts)**  
✅ **Code Structure & Readability (10 pts)**  

---

### **📌 Hints**
- **Use `LinkedList<Task>` for both stack and queue.**  
- **Think about how to prioritize tasks in `TaskManager`.**  
- **Follow proper encapsulation and best coding practices.**  
- **Test your methods properly to ensure correct output.**  

---


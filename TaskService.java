package TestUnits;

import java.util.HashMap;
import java.util.Map;
// TaskService class to manage tasks
public class TaskService {
    private final Map<String, Task> task = new HashMap<>();

    public void addTask(Task newTask) {
        if (task.containsKey(newTask.getTaskID())) {
            throw new IllegalArgumentException("Enter a unique Task ID."); //exception message for duplicate task id
        }
        task.put(newTask.getTaskID(), newTask);
    }

    public void deleteTask(String taskID) {
        if (!task.containsKey(taskID)) {
            throw new IllegalArgumentException("Task ID not found."); //exception message for task id not found
        }
        task.remove(taskID);
    }

    public void updateTaskName(String taskID, String newName, String newDescription) {
      Task taskToUpdate = task.get(taskID);
        if (taskToUpdate == null) {
            throw new IllegalArgumentException("Task ID not found."); //exception message for task id not found
        }
        taskToUpdate.setName(newName);
        taskToUpdate.setDescription(newDescription);
    }
}

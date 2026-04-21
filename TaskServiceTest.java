package TestUnits;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test; 

class TaskServiceTest {
    private TaskService taskService;

    @BeforeEach
    void setUp() {
        taskService = new TaskService();
    }

    @Test
    void testAddTask() {
        Task task = new Task("12345", "Test Task", "This is a test task.");
        taskService.addTask(task);
    
    }


    @Test
    void testAddDuplicateTaskID() {
        Task task1 = new Task("12345", "Test Task 1", "This is the first test task.");{
            
            taskService.addTask(task1);

            Task task2 = new Task("12345", "Second", "Description");
            assertThrows(IllegalArgumentException.class, () -> {
                taskService.addTask(task2);
            }); 

        }
        
    }

    @Test
    void testUpdateTask() { 
        Task task = new Task("12345", "Old Name", "This is a test task.");
        taskService.addTask(task);

        taskService.updateTaskName("12345", "New Name", "This is an updated test task.");   
    }


    @Test
    void testDeleteTask() {
        Task task = new Task("12345", "Test Task", "This is a test task.");
        taskService.addTask(task);

        taskService.deleteTask("12345");

        //extra proof that taks is delted.
        assertThrows(IllegalArgumentException.class, () -> {
            taskService.deleteTask("12345");
        });
    }   
}
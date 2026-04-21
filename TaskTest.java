package TestUnits;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;







public class TaskTest {


    @Test
    void testTaskCreation() {
        Task task = new Task("12345", "New Name", "This is a test task description.");
        assertEquals("12345", task.getTaskID());
        assertEquals("New Name", task.getName());
        assertEquals("This is a test task description.", task.getDescription());
    }

    @Test
    void testTaskCreationWithInvalidID() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Task("1234545667812345678890", "Name", "Description");
        });
    }}

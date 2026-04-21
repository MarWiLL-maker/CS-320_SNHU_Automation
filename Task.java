package TestUnits;

public class Task { 
    private final String taskID; // max 10 characters, not null, unique
    private String name; // max 20 characters, not null
    private String description; // ma 50 characters, not null

    public Task(String taskID, String name, String description) {
        if (taskID == null || taskID.length() > 10) {
            throw new IllegalArgumentException("Task ID must be non-null and at most 10 characters.");
        }
        if (name == null || name.length() > 20) {
            throw new IllegalArgumentException("Name must be non-null and at most 20 characters.");
        }
        if (description == null || description.length() > 50) {
            throw new IllegalArgumentException("Description must be non-null and at most 50 characters.");
        }
        this.taskID = taskID;
        this.name = name;
        this.description = description;
    }

    public String getTaskID() {
        return taskID;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        if (name == null || name.length() > 20) {
            throw new IllegalArgumentException("Name must be non-null and at most 20 characters.");
        }
        this.name = name;
    }
    public void setDescription(String description) {
        if (description == null || description.length() > 50) {
            throw new IllegalArgumentException("Description must be non-null and at most 50 characters.");
        }
        this.description = description;
    }
    
}

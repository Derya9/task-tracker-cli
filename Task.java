import java.time.LocalDateTime;

public class Task {
    private int id;
    private static int lastId;
    private String description;
    private Status status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    /**
     * Task Constructor
     * @param description
     */
    public Task(String description) {
        this.id = ++lastId;
        this.description = description;
        this.status = Status.TO_DO;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    /**
     * Mark Task As In Progress
     */
    public void markTaskInProgress() {
        this.status = Status.IN_PROGRESS;
        this.updatedAt = LocalDateTime.now();
    }

    /**
     * Mark Task As Done
     */
    public void markTaskDone() {
        this.status = Status.DONE;
        this.updatedAt = LocalDateTime.now();
    }

    /**
     * Updates Description From User Input
     * @param description
     */
    public void updateTaskDescription(String description) {
        this.description = description;
        this.updatedAt = LocalDateTime.now();
    }

}

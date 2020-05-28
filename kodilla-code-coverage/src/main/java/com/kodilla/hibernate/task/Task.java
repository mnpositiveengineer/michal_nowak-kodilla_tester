package com.kodilla.hibernate.task;

import com.kodilla.hibernate.tasklist.TaskList;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table  (name = "TASKS")
public class Task {

    @Id
    @Column(name="task_id", unique = true)
    @NotNull
    @GeneratedValue
    private int id;
    @Column(name="description")
    private String description;
    @Column(name="creation_date")
    private LocalDate created;
    @Column(name="duration", nullable = false)
    private int duration;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "task_financial_details_id")
    private TaskFinancialDetails taskFinancialDetails;
    @ManyToOne
    @JoinColumn (name = "task_list_id")
    private TaskList taskList;

    public Task() {
    }

    public Task(String description, int duration) {
        this.description = description;
        this.created = LocalDate.now();
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getCreated() {
        return created;
    }

    public int getDuration() {
        return duration;
    }

    public TaskFinancialDetails getTaskFinancialDetails() {
        return taskFinancialDetails;
    }

    public void setTaskFinancialDetails(TaskFinancialDetails taskFinancialDetails) {
        this.taskFinancialDetails = taskFinancialDetails;
    }

    public TaskList getTaskList() {
        return taskList;
    }

    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }
}

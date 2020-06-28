package com.kodilla.hibernate.tasklist;

import com.kodilla.hibernate.task.Task;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "TASK_LISTS")
public class TaskList {

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "list_id")
    private int id;
    @NotNull
    @Column(name = "list_name")
    private String listName;
    @Column(name = "description")
    private String description;
    @OneToMany (cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn (name = "task_list_id")
    private List<Task> tasks = new ArrayList<>();

    public TaskList() {

    }

    public TaskList(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getListName() {
        return listName;
    }

    public String getDescription() {
        return description;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}

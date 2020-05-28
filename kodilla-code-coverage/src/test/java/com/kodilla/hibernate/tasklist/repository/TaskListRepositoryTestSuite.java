package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.task.repository.TaskFinancialDetailsRepository;
import com.kodilla.hibernate.task.repository.TaskRepository;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class TaskListRepositoryTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;
    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private TaskFinancialDetailsRepository taskFinancialDetailsRepository;

    @Test
    public void testFindByListName() {
        //GIVEN
        TaskList homeDuties = new TaskList("Home duties", "The list presents tasks regarding home duties.");
        TaskList workDuties = new TaskList("Work duties", "The list presents tasks regarding work duties");
        TaskList learning = new TaskList("Learning", "The list present tasks related to learning");
        taskListRepository.save(homeDuties);
        taskListRepository.save(workDuties);
        taskListRepository.save(learning);
        //WHEN
        List<TaskList> listOfTaskByNameHomeDuties = taskListRepository.findByListName(homeDuties.getListName());
        List<TaskList> listOfTaskByNameWorkDuties = taskListRepository.findByListName(workDuties.getListName());
        List<TaskList> listOfTaskByLearning = taskListRepository.findByListName(learning.getListName());
        //THEN
        Assertions.assertEquals(1, listOfTaskByNameHomeDuties.size());
        Assertions.assertEquals(1, listOfTaskByNameWorkDuties.size());
        Assertions.assertEquals(1, listOfTaskByLearning.size());
        //CLEANUP
        taskListRepository.delete(homeDuties);
        taskListRepository.delete(workDuties);
        taskListRepository.delete(learning);
    }

    @Test
    public void testTaskListRepositorySaveWithTasks() {
        //GIVEN
        Task task1 = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task1.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList("New List", "To Do Tasks");
        taskList.getTasks().add(task1);
        taskList.getTasks().add(task2);
        task1.setTaskList(taskList);
        task2.setTaskList(taskList);
        //WHEN
        taskListRepository.save(taskList);
        //THEN
        Assertions.assertEquals(1, taskListRepository.count());
        Assertions.assertEquals(2, taskRepository.count());
        Assertions.assertEquals(2, taskFinancialDetailsRepository.count());
        //CLEANUP
        taskListRepository.delete(taskList);
        //THEN
        Assertions.assertEquals(0, taskListRepository.count());
        Assertions.assertEquals(0, taskRepository.count());
        Assertions.assertEquals(0, taskFinancialDetailsRepository.count());
    }

}
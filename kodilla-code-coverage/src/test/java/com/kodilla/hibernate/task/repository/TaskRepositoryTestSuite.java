package com.kodilla.hibernate.task.repository;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
class TaskRepositoryTestSuite {

    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private TaskFinancialDetailsRepository taskFinancialDetailsRepository;

    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    public void testTaskRepositorySave() {
        //Given
        Task task = new Task(DESCRIPTION, 7);
        //When
        taskRepository.save(task);
        int id = task.getId();
        Optional<Task> readTask = taskRepository.findById(id);
        //Then
        Assertions.assertTrue(readTask.isPresent());
        //CleanUp
        taskRepository.deleteById(id);

    }

    @Test
    public void testFindByDuration() {
        //Given
        Task task = new Task(DESCRIPTION, 7);
        taskRepository.save(task);
        int duration = task.getDuration();
        //When
        List<Task> tasks = taskRepository.findByDuration(duration);
        //Then
        Assertions.assertEquals(1, tasks.size());
        //CleanUp
        int id = task.getId();
        taskRepository.deleteById(id);
    }

    @Test
    public void testTaskRepositorySaveWithFinancialDetails() {
        //GIVEN
        Task task = new Task(DESCRIPTION, 30);
        TaskFinancialDetails taskFinancialDetails = new TaskFinancialDetails(new BigDecimal(120), false);
        task.setTaskFinancialDetails(taskFinancialDetails);
        //WHEN
        taskRepository.save(task);
        //THEN
        List<TaskFinancialDetails> listOfFinancialDetails = taskFinancialDetailsRepository.findByPaid(false);
        Assertions.assertEquals(1, listOfFinancialDetails.size());
        //CLEANUP
        taskRepository.delete(task);
        //THEN
        Assertions.assertEquals(0, taskFinancialDetailsRepository.count());
    }


}
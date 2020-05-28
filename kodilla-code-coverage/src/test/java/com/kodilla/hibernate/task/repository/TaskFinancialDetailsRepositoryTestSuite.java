package com.kodilla.hibernate.task.repository;

import com.kodilla.hibernate.task.TaskFinancialDetails;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class TaskFinancialDetailsRepositoryTestSuite {

    @Autowired
    private TaskFinancialDetailsRepository taskFinancialDetailsRepository;

    @Test
    public void testFindByPaid() {
        //GIVEN
        TaskFinancialDetails taskFinancialDetails = new TaskFinancialDetails(new BigDecimal(115), false);
        taskFinancialDetailsRepository.save(taskFinancialDetails);
        //WHEN
        List<TaskFinancialDetails> actualList = taskFinancialDetailsRepository.findByPaid(false);
        //THEN
        Assertions.assertEquals(1, actualList.size());
        //CLEANUP
        taskFinancialDetailsRepository.delete(taskFinancialDetails);

    }

}
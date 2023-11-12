package com.example.board;

import com.example.board.question.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DataBoardApplicationTests {

    @Autowired
    private QuestionService questionService;
    
    @Test
    void testJpa() {
        for (int i = 1; i <= 300; i++){
            String subject = String.format("test data : [%03d]", i);
            String content = "nothing";
            this.questionService.create(subject, content);
        }
    }
}

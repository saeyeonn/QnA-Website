package com.example.board;

import com.example.board.question.Question;
import com.example.board.question.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class EnrollBoardApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;

	@Test
	void testJpa() {
		Question question1 = new Question();
		question1.setSubject("what is spring?");
		question1.setContent("i want to learn about spring");
		question1.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(question1);

		Question question2 = new Question();
		question2.setSubject("what is model?");
		question2.setContent("i want to learn about model");
		question2.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(question2);
	}

}

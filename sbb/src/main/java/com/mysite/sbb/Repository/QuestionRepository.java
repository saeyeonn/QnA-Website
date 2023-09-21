package com.mysite.sbb.Repository;

import com.mysite.sbb.Domain.Answer;
import com.mysite.sbb.Domain.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository <Question, Answer> {
    Question findBySubject(String subject);
    Question findBySubjectAndContent(String subject, String content);
    List<Question> findBySubjectLike(String subject);
}

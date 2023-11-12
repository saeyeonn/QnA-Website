package com.example.board.question;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionForm {
    @NotEmpty(message = "Title is essential.")
    @Size(max = 200)
    private String subject;

    @NotEmpty(message = "Content is essential.")
    private String content;
}

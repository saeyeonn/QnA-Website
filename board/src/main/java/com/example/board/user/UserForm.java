package com.example.board.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserForm {
    @Size(min = 2, max = 25)
    @NotEmpty(message = "User ID is essential.")
    private String username;

    @NotEmpty(message = "Password ID is essential.")
    private String password1;

    @NotEmpty(message = "Identifying Password is essential.")
    private String password2;

    @NotEmpty(message = "Email is essential.")
    @Email
    private String email;
}

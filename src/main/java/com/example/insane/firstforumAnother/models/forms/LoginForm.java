package com.example.insane.firstforumAnother.models.forms;

import lombok.Data;

@Data
public class LoginForm {

    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}

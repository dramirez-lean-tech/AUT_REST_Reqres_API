package models;

import models.builders.TokenModelBuilder;

public class Token {

    private final String email;
    private final String password;

    public Token(TokenModelBuilder builder){
        this.email = builder.getEmailBuild();
        this.password = builder.getPasswordBuild();
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

}

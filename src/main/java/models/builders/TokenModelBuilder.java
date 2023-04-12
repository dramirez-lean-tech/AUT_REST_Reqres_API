package models.builders;

import javafx.util.Builder;
import models.Token;

public class TokenModelBuilder implements Builder<Token> {


    private String emailBuild;
    private String passwordBuild;

    public TokenModelBuilder() { }

    public TokenModelBuilder registerSuccessful() {
        this.emailBuild = System.getProperty("email");
        this.passwordBuild = System.getProperty("password");
        return this;
    }

    public TokenModelBuilder registerUnsuccessful() {
        this.emailBuild = System.getProperty("email");
        return this;
    }

    public String getEmailBuild() {
        return emailBuild;
    }

    public String getPasswordBuild() {
        return passwordBuild;
    }

    public static TokenModelBuilder newToken() {
        return new TokenModelBuilder();
    }

    @Override
    public Token build() {
        return new Token(this);
    }
}

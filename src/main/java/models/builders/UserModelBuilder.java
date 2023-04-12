package models.builders;

import javafx.util.Builder;
import models.Users;
import utils.DataFakeGenerate;

public class UserModelBuilder implements Builder<Users> {


    private String nameBuild;
    private String jobBuild;

    public UserModelBuilder(){}

    public UserModelBuilder user() {
        this.nameBuild = DataFakeGenerate.contacName();
        this.jobBuild = DataFakeGenerate.jobName();
        return this;
    }

    public String getNameBuild() {
        return nameBuild;
    }

    public String getJobBuild() {
        return jobBuild;
    }

    public UserModelBuilder name(String nameBuild){
        this.nameBuild = nameBuild;
        return this;
    }

    public UserModelBuilder job(String jobBuild){
        this.jobBuild = jobBuild;
        return this;
    }

    public static UserModelBuilder userCreated() {
        return new UserModelBuilder();
    }

    @Override
    public Users build() {
        return new Users(this);
    }
}

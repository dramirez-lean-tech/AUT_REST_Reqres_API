package models;

import models.builders.UserModelBuilder;

public class Users {

    private String name;
    private String job;

    public Users(UserModelBuilder builder){
        this.name = builder.getNameBuild();
        this.job = builder.getJobBuild();
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }





}

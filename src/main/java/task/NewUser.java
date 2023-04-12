package task;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;


import static models.builders.UserModelBuilder.userCreated;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NewUser implements Task {


    public NewUser(){}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Post.to("/api/users")
                .with(request->request
                        .header("Content-Type","application/json")
                        .body(userCreated().user().build())));
        String response = SerenityRest.lastResponse().asString();
        System.out.println(response);
        System.out.println("------------");
    }

    public static NewUser newUser(){
        return instrumented(NewUser.class);
}
}

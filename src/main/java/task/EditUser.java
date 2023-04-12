package task;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Patch;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static models.builders.UserModelBuilder.userCreated;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EditUser implements Task {


    public EditUser(){}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Patch.to("/api/users/2")
                .with(request->request
                        .header("Content-Type","application/json")
                        .body(userCreated().user().build())));
        String response = SerenityRest.lastResponse().asString();
        System.out.println(response);
        System.out.println("------------");
    }

    public static EditUser userEdited(){
        return instrumented(EditUser.class);
}
}

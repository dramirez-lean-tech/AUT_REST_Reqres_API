package task;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Delete;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static models.builders.UserModelBuilder.userCreated;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DeleteUser implements Task {


    public DeleteUser(){}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Delete.from("/api/users/5")
                .with(request->request
                        .header("Content-Type","application/json")
                        .body("")));
    }

    public static DeleteUser userDeleted(){
        return instrumented(DeleteUser.class);
}
}

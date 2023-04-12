package task;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static models.builders.UserModelBuilder.userCreated;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SummaryUser implements Task {


    public SummaryUser(){}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Get.resource("/api/users/2")
                .with(request->request
                        .header("Content-Type","application/json")
                        .body("")));

        String response = SerenityRest.lastResponse().asString();
        System.out.println(response);
        System.out.println("------------");
    }

    public static SummaryUser summaryUser(){
        return instrumented(SummaryUser.class);
}
}

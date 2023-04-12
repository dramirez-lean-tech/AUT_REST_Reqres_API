package task;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static models.builders.TokenModelBuilder.newToken;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static utils.Constans.TOKEN;


public class RegisterUnsuccessful implements Task {

        public RegisterUnsuccessful() {
        }

        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(Post.to("/api/login")
                    .with(request->request
                            .header("Content-Type","application/json")
                            .body(newToken().registerUnsuccessful().build())));

            String temp = SerenityRest.lastResponse().jsonPath().getString("error");
            System.out.println(temp);
            System.out.println("------------");
        }

        public static RegisterUnsuccessful unsuccessful(){
            return instrumented(RegisterUnsuccessful.class);
        }


}


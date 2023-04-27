package task;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;
import utils.DataFakeGenerate;

import static models.builders.UserModelBuilder.userCreated;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NewUserTwo implements Task {


    public NewUserTwo(){}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Post.to("/api/users")
                .with(request->request
                        .header("Content-Type","application/json")
                        .body("{" + "\n" +
                                "\"name\""+": \""+ DataFakeGenerate.contacName() + "\""+ "\n" +
                                "\"job\""+": \""+ DataFakeGenerate.jobName() + "\""+ "\n" +
                                "}")));
        String response = SerenityRest.lastResponse().asString();
        System.out.println(response);
        System.out.println("------------");
    }

    public static NewUserTwo newUserTwo(){
        return instrumented(NewUserTwo.class);
}
}

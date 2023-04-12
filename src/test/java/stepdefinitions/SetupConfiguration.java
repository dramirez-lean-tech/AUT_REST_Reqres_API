package stepdefinitions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import cucumber.api.java.Before;


public class SetupConfiguration {

    public static Actor AdminApi;

    @Before
    public void prepareStage() {
        String theRestApiBaseUrl = "https://reqres.in";
        AdminApi = Actor.named("admin")
                .whoCan(CallAnApi.at(theRestApiBaseUrl));
        OnStage.setTheStage(new OnlineCast());

    }

}

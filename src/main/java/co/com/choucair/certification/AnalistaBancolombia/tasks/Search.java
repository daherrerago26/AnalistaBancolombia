package co.com.choucair.certification.AnalistaBancolombia.tasks;

import co.com.choucair.certification.AnalistaBancolombia.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Search implements Task {

    private String course;
    private SearchCoursePage searchCoursePage;
    public static Search the(String course) {
        return Tasks.instrumented(Search.class);
    }

    public Search(String course) {
        this.course = course;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SearchCoursePage.SEARCH_COURSE));
    }
}

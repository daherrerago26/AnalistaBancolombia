package co.com.choucair.certification.AnalistaBancolombia.questions;

import co.com.choucair.certification.AnalistaBancolombia.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String querstion;

    public  Answer(String question) {
        this.querstion = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameCourse = Text.of(SearchCoursePage.NAME_COURSE).viewedBy(actor).asString();
        if (querstion.equals(nameCourse)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}

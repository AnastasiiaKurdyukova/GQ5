package JUnit;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class WebTests {

    @DisplayName("Поиск")
    @Test
    void selenideSearchTest() {
// Предусловия
        Selenide.open("https://ya.ru/");
 //Шаги
        $("#text").setValue("Selenide");
        $("button[type='submit']").click();

//  Ожидаемый результат:
        $$(".serp-item").find(Condition.text("Selenide")).shouldBe(visible);
    }

}

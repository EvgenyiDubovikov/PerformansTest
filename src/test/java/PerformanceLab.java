import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class PerformanceLab {

    @Test

    public void searchWithGoogle (){
        open("https://google.com");
        $(By.name("q")).setValue("performance-lab").pressEnter();
        $("#rso > div:nth-child(1) > div > div > div > div > div > div.yuRUbf > a > h3").click();
        $("#page-wrapper > div:nth-child(3) > div:nth-child(3) > div > div.row > div:nth-child(3) > div > div > a > span")
                .hover().shouldHave(Condition.cssValue("color","rgba(255, 255, 255, 1)"));


}


    }




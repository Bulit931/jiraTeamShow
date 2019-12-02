package tww;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void init(){
        Selenide.open("https://yandex.ru/");
    }

}

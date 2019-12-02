package tww;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import page.MainPage;

public class JiraTeamGodTest extends BaseTest {

    @Test
    public void q(){
        int size =
        new MainPage().inputTextInSearchField("jira team")
                .clickBtnSearch()

                .getSize();

     Matchers.greaterThan(0);
    }

}

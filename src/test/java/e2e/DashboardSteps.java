package e2e;


import e2e.pages.DashboardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

public class DashboardSteps extends SpringIntegrationTest {

  @Autowired
  private DashboardPage dashboardPage;

  @Given("ダッシュボード画面を表示する")
  public void ダッシュボード画面を表示する() {
    dashboardPage.goToContactPage();
  }

  @Then("一覧リンクが表示される")
  public void 一覧リンクが表示される() {
    String actual = dashboardPage.getListText();
    assertEquals("どうぶつ一覧", actual);
  }

  @And("登録リンクが表示される")
  public void 登録リンクが表示される() {
    String actual = dashboardPage.getRegisterText();
    assertEquals("どうぶつ登録", actual);
  }
}

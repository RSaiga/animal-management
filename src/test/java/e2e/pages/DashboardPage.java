package e2e.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class DashboardPage extends BasePage {

  @FindBy(id = "list")
  private WebElement list;

  @FindBy(id = "register")
  private WebElement register;

  DashboardPage(WebDriver driver, Environment environment) {
    super(driver, environment);
  }

  public void goToContactPage() {
    this.goToPage("/animal-management");
  }

  public String getListText() {
    return list.getText();
  }

  public String getRegisterText() {
    return register.getText();
  }

}

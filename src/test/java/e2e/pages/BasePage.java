package e2e.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.springframework.core.env.Environment;

public abstract class BasePage {

  WebDriver driver;
  Environment environment;

  BasePage(WebDriver driver, Environment environment) {
    this.driver = driver;
    this.environment = environment;

    PageFactory.initElements(driver, this);
  }

  public String getCurrentUrl() {
    return driver.getCurrentUrl();
  }

  String getPort() {
    return environment.getProperty("local.server.port");
  }

  void goToPage(String url) {
    driver.get("http://localhost:" + getPort() + url);
  }

  void removeReadOnly(WebElement element) {
    ((JavascriptExecutor) driver).executeScript(
        "arguments[0].removeAttribute('readonly','readonly')", element);
  }
}

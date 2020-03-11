package e2e.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ListPage extends BasePage{

  @FindBy(id = "animals")
  private WebElement animals;


  ListPage(WebDriver driver, Environment environment) {
    super(driver, environment);
  }

  public void goToPage() {
    goToPage("/animal-management/animals");
  }

  public int size() {
    List<WebElement> rows = animals.findElements(By.tagName("tr"));
    return rows.size();
  }

  public String name(int index) {
    return null;
  }
}

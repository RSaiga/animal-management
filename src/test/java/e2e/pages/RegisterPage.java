package e2e.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class RegisterPage extends BasePage {

  @FindBy(id = "name")
  private WebElement name;

  @FindBy(id = "animal_type")
  private WebElement animalType;

  @FindBy(id = "birthday")
  private WebElement birthday;

  @FindBy(id = "gender")
  private WebElement gender;

  @FindBy(id = "feeding_fee")
  private WebElement feedingFee;

  @FindBy(id = "register")
  private WebElement registerBtn;

  RegisterPage(WebDriver driver, Environment environment) {
    super(driver, environment);
  }

  public void goToPage() {
    this.goToPage("/animal-management/animal");
  }

  public void inputName(String input) {
    name.sendKeys(input);
  }

  public void inputAnimalType(String input) {
    animalType.sendKeys(input);
  }

  public void inputBirthday(String input) {
    removeReadOnly(birthday);
    birthday.sendKeys(input);
  }

  public void inputGender(String input) {
    gender.sendKeys(input);
  }

  public void inputFeedingFee(String input) {
    feedingFee.sendKeys(input);
  }

  public void register() {
    registerBtn.click();
  }
}

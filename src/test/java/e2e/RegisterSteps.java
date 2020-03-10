package e2e;

import com.lib.training.application.repository.animal.AnimalRepository;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import e2e.pages.ListPage;
import e2e.pages.RegisterPage;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Qualifier;

import static org.junit.Assert.assertEquals;

public class RegisterSteps {

  private AnimalRepository repository;

  private RegisterPage registerPage;

  private ListPage listPage;

  public RegisterSteps(@Qualifier("animalRepositoryDataSource") AnimalRepository repository, RegisterPage registerPage, ListPage listPage) {
    this.repository = repository;
    this.registerPage = registerPage;
    this.listPage = listPage;
  }

  @Given("どうぶつ登録画面を表示する")
  public void どうぶつ登録画面を表示する() {
    registerPage.goToPage();
  }

  @When("なまえを入力する")
  public void なまえを入力する() {
    registerPage.inputName("らいおんきんぐ");
  }

  @And("種別を入力する")
  public void 種別を入力する() {
    registerPage.inputAnimalType("1");
  }

  @And("誕生日を入力する")
  public void 誕生日を入力する() {
    registerPage.inputBirthday("1999/01/01");
  }

  @And("性別を入力する")
  public void 性別を入力する() {
    registerPage.inputGender("1");
  }

  @And("エサ代を入力する")
  public void エサ代を入力する() {
    registerPage.inputFeedingFee("1000");
  }

  @When("登録する")
  public void 登録する() {
    registerPage.register();
  }

  @Then("一覧画面へ遷移する")
  public void 一覧画面へ遷移する() {
    listPage.goToPage();
  }

  @And("どうぶつが１件登録されている")
  public void どうぶつが１件登録されている() {
    assertEquals(2, listPage.size());
  }

  @cucumber.api.java.en.Given("クリーニング")
  public void クリーニング() {
    repository.clear();
  }
}

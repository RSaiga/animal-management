package e2e;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.PreDestroy;

@ComponentScan(basePackages = {"e2e"})
public class TestConfig {
  private WebDriver driver;

  public TestConfig() {
    WebDriverManager.chromedriver().setup();
  }

  @Bean
  public WebDriver getDriver() {
    if (driver == null) {
      driver = new ChromeDriver();
    }
    return driver;
  }

  @PreDestroy
  public void onApplicationShutdown() {
    driver.quit();
  }
}

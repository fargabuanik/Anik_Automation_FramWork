package gobaltek.ny.stepdefintion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepdefintion {
	WebDriver driver;

	@Given("User is able to open any browser")
	public void user_is_able_to_open_any_browser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();

	}

	@Given("User is able to enter the URL")
	public void user_is_able_to_enter_the_url() {
		driver.navigate().to("https://magento.softwaretestingboard.com/");
	}

	@When("User is able to click on sign in BTN")
	public void user_is_able_to_click_on_sign_in_btn() {
		driver.findElement(By.partialLinkText("Sign In")).click();

	}

	@When("User is able to enter the user name")
	public void user_is_able_to_enter_the_user_name() {
		driver.findElement(By.id("email")).sendKeys("tanvirpatwary16@gmail.com");

	}

	@When("User is able to enter the password")
	public void user_is_able_to_enter_the_password() {
		driver.findElement(By.id("pass")).sendKeys("Tester01");

	}

	@When("User is able to click on log in BTN")
	public void user_is_able_to_click_on_log_in_btn() {
		driver.findElement(By.name("send")).click();
		driver.quit();

	}

}

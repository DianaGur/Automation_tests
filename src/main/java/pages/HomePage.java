package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    private By signInButton = By.linkText("Sign In / Sign Up");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToHomePage() {
        driver.get("https://www.ticketor.com/demo/default");
    }

    public boolean isSignInVisible() {
        return driver.findElement(signInButton).isDisplayed();
    }
}


package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class SanityTest extends BaseTest {
	
    @Test
    public void sanityTest_siteLoads() {
        HomePage homePage = new HomePage(driver);
        homePage.goToHomePage();

        Assert.assertTrue(homePage.isSignInVisible(), "Sign In button should be visible");
        System.out.println("✅ האתר עלה בהצלחה");
    }
}

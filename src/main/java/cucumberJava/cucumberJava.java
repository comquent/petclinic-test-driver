package cucumberJava; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class cucumberJava { 
   WebDriver driver = null; 
   @Given("^I have open the browser$") 
   public void openBrowser() {
//	 System.setProperty("webdriver.chrome.driver", "C:\\workspaces\\cucumber\\webdriver\\chromedriver.exe");
      driver = new FirefoxDriver(); 
   } 
   @When("^I open Facebook website$") 
   public void goToFacebook() { 
      driver.navigate().to("https://www.facebook.com/"); 
   } 

   @When("^I open Comquent website$") 
   public void goToComquent() { 
      driver.navigate().to("https://www.comquent.com/"); 
   } System.getProperty("os.name")

   @When("^I open Petclinic website$") 
   public void goToPetclinic() { 
      driver.navigate().to(System.getProperty("petclinic.url")); 
   }

   @Then("^Login button should exits$") 
   public void loginButton() { 
      if(driver.findElement(By.id("u_0815_v")).isEnabled()) { 
         System.out.println("Test 1 Pass"); 
      } else { 
         System.out.println("Test 1 Fail"); 
      } 
      driver.close(); 
   } 
}

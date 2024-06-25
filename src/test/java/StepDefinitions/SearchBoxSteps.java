package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class SearchBoxSteps {

    WebDriver driver = null;

    @Given("The user is on Wikipedia")
    public void the_user_is_on_wikipedia() {
        String ChromePath = "C:\\Users\\sofia.buitrago\\Documents\\Wiki\\src\\test\\resources\\Drivers\\msedgedriver.exe";
        System.setProperty("webdriver.edge.driver", ChromePath);
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://es.wikipedia.org/wiki/Wikipedia:Portada");
       // System.out.println("probando 123");
    }

    @And("The user types Microsoft on the search box")
    public void the_user_types_microsoft_on_the_search_box() {
        System.out.println("Microsoft on the search box");

        driver.findElement(By.name("search")).sendKeys("Microsoft");


    }

    @When("The user clicks the Search button")
    public void the_user_clicks_the_search_button() {
        System.out.println("Search button");
        driver.findElement(By.className("cdx-search-input__end-button")).click();

    }

    @Then("The teacher is redirected to the search")
    public void the_teacher_is_redirected_to_the_search() throws InterruptedException {
        System.out.println("Este es el título de la página "+ "'" +  driver.getTitle() + "'");

        if (driver.getTitle().contains("Microsoft")){
            System.out.println("El anterior título contiene la palabra Microsoft");
        }

        Thread.sleep(15000);//15 sgs
        driver.close();
        driver.quit();
    }

}

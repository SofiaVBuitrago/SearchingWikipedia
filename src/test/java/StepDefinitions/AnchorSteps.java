package StepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class AnchorSteps {

    WebDriver driver = null;

    @Given("the user searched for Microsoft on wikipedia")
    public void the_user_searched_for_microsoft_on_wikipedia() {
        String ChromePath = "C:\\Users\\sofia.buitrago\\Documents\\Wiki\\src\\test\\resources\\Drivers\\msedgedriver.exe";
        System.setProperty("webdriver.edge.driver", ChromePath);
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://es.wikipedia.org/wiki/Microsoft");
    }
    @When("the user search for all the anchor links")
    public void the_user_search_for_all_the_anchor_links() {
        System.out.println("Buscanding jajaajaj");


    }
    @Then("the anchor links are printed with its respective text")
    public void the_anchor_links_are_printed_with_its_respective_text() throws InterruptedException {

        /* Acá es lo mismo de abajo pero hecho con una lista
       List<WebElement> anchors = driver.findElements(By.tagName("a"));
       */
        /*Acá es con un array*/
        WebElement[] anchors = driver.findElements(By.tagName("a")).toArray(new WebElement[0]);
        // for each loop (tipo variable nombre variable : coleccion)
        for (WebElement anchorLinks : anchors) {
            System.out.println(anchorLinks.getText());
        }

        System.out.println(anchors.length);

        Thread.sleep(15000);//15 sgs
        driver.close();
        driver.quit();
    }

}

package AddToCart;

import CheckOut.CheckOutPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage {
    private WebDriver driver;
    private By addItem = By.xpath("//*[@id=\"mainContent\"]/section[2]/section/section/section/section/ul/li[2]/div/div/div[2]/form/div[4]/button");
    private By checkOutButton = By.xpath("//div[@class='_2aac2_3bwnD  _841f1_1RZK9']");

    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
    }

    //Click on check out button
    public CheckOutPage clickCheckOut() throws InterruptedException {
        driver.findElement(checkOutButton).click();
        //Wait for the checkout page to load
        Thread.sleep(3000);
        return new CheckOutPage(driver);
    }
}
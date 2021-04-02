package Search;

import AddToCart.AddToCartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    private WebDriver driver;
    private By AddToCartButton = By.xpath("//*[@id=\"mainContent\"]/section[2]/section/section/section/section/ul/li[7]/div/div/div[2]/form/div[4]/button");
    private By MyCartButton= By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/nav/div[2]/div/div/a[2]");

    public SearchPage(WebDriver driver)
    {
        this.driver = driver;
    }

    //Click the first Add to cart button
    public void clickOnAddToCart(int index) throws InterruptedException
    {
        driver.findElements(AddToCartButton).get(index - 1).click();
        Thread.sleep(3000);
    }

    //Click My Cart Button
    public AddToCartPage clickMyCartButton() throws InterruptedException
    {
        driver.findElement(MyCartButton).click();
        Thread.sleep(3000);
        return new AddToCartPage(driver);

    }
}
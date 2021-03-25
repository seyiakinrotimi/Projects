package Setup;

import Welcome.WelcomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class SetupTest {
    private WebDriver driver;
    public WelcomePage welcomePage;

    //Initialize WebDriver, open the browser  & go to the URL before conducting the test
    @BeforeTest
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\TestCodeCamp_Programme\\Submission\\SeleniumWebdrivertests\\PageObjectModel_Tasks\\KongaProject\\resources\\chromedriver.exe");
        //Initializing WebDriver
        driver = new ChromeDriver();

        //Maximize web browser
        driver.manage().window().maximize();
        //Open URL on browser
        driver.get("https://www.konga.com/");
        welcomePage = new WelcomePage(driver);
    }

    //Close WebDriver and browser after completing the test
    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }
}


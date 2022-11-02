import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String [] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//div[@class='category-cards']//div[1]//div[1]//div[1]"));
        element.click();
        WebElement webTables = driver.findElement(By.cssSelector("div[class='element-list collapse show'] li[id='item-3'] span[class='text']"));
       webTables.click();
       WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
       addButton.click();

       try{
           Thread.sleep(10);
       } catch (InterruptedException e){
           throw new RuntimeException(e);
       }

       WebElement firstName = driver.findElement(By.cssSelector("#firstName"));
       firstName.click();
       firstName.sendKeys("Hüseyin");

        WebElement lastName = driver.findElement(By.cssSelector("#lastName"));
        lastName.click();
        lastName.sendKeys("Günaydin");

        WebElement userEmail = driver.findElement(By.cssSelector("#userEmail"));
        userEmail.click();
        userEmail.sendKeys("gunaydinhuseyin1453@gmail.com");

        WebElement age= driver.findElement(By.cssSelector("#age"));
        age.click();
        age.sendKeys("37");


        WebElement salary = driver.findElement(By.cssSelector("#salary"));
        salary.clear();
        salary.sendKeys("3000");

        WebElement department = driver.findElement(By.cssSelector("#department"));
        department.click();
        department.sendKeys("IT");

        WebElement submit = driver.findElement(By.cssSelector("#submit"));
        submit.click();

        driver.quit();
    }
}

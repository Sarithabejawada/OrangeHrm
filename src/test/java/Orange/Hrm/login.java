package Orange.Hrm;


	
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {

    @Test
    public void loginMethod() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Saritha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(500);

        WebElement usernameinput = driver.findElement(By.xpath("//input[@name = 'username']"));
        
        WebElement passwordinput = driver.findElement(By.xpath("//input[@name = 'password']"));
        
        WebElement loginbutton = driver.findElement(By.xpath("//button[@type = 'submit']"));
        
        usernameinput.sendKeys("Admin");
        
        Thread.sleep(500);
        
        passwordinput.sendKeys("admin123");
        
        Thread.sleep(500);
        
        loginbutton.click();
        
        Thread.sleep(500);

    }
}
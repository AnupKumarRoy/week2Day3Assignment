package WeekDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2Day2Assignment1 {
public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
    driver.findElement(By.id("password")).sendKeys("crmsfa");
    driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
    driver.findElement(By.linkText("CRM/SFA")).click();
    driver.findElement(By.linkText("Contacts")).click();
    driver.findElement(By.linkText("Create Contact")).click();

}
}

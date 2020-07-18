package Automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\Project\\div\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://www.goindigo.in/");
Thread.sleep(40000);
List<WebElement> from=driver.findElements(By.name("or-srt"));
/*
from.click();
from.sendKeys("Mumbai");
Robot r=new Robot();
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
/*
driver.switchTo().alert().accept();

WebElement to=driver.findElement(By.name("or-dest"));
to.click();
to.sendKeys("Chennai");
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
*/
	}

}

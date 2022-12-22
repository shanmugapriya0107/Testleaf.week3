package week3.day2.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchAjioApp_Using_Map {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions ch = new ChromeOptions();
        ch.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(ch);
        driver.manage().window().maximize();
        driver.get("https://www.ajio.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("bags",Keys.ENTER);
        driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
        Thread.sleep(3000);
        String text = driver.findElement(By.className("length")).getText();
        System.out.println(text);
        
		List<WebElement> brandList = driver.findElements(By.className("brand"));
		System.out.println("List of brands available :" + brandList.size());

		for (WebElement webElement : brandList) {
			String text1 = webElement.getText();
			System.out.println(text1);
		}
		
		List<WebElement> findElements = driver.findElements(By.className("nameCls"));
		System.out.println("Names of the bags:");
		for (WebElement webElement : findElements) {
			String text2 = webElement.getText();
			System.out.println(text2);
			
		}
		
	}
}
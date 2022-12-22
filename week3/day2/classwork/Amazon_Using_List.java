package week3.day2.classwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon_Using_List {

	public static void main(String[] args) {
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones", Keys.ENTER);
		List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		System.out.println(findElements.size());
		List<Integer> li = new ArrayList<Integer>(); 

		for (int i = 0; i < findElements.size(); i++) {
			System.out.println(findElements.get(i).getText());
			String price = findElements.get(i).getText().replaceAll(",", "");
			if(!price.trim().equals("")) {
				int finalprice = Integer.parseInt(price);
				if(finalprice>0)
				{
					li.add(finalprice);
				}
			}
		}
		Collections.sort(li);
		System.out.println("Minimum Price is " +li.get(0));

	}
}

package GuviTask22;

import java.io.File;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Ans_1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://phptravels.com/demo/");
		//driver.manage().window().maximize(); 
		FluentWait <WebDriver> wait = new FluentWait<>(driver)
		.withTimeout(Duration.ofSeconds(20))
		.pollingEvery(Duration.ofMillis(50))
		.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("first_name"))).sendKeys("El");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("last_name"))).sendKeys("Dustin");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("business_name"))).sendKeys("Tester");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("email"))).sendKeys("Dustin015@gmail.com");
		WebElement element1 = driver.findElement(By.id("numb1"));
		WebElement element2 = driver.findElement(By.id("numb2"));

		String a=element1.getText();
		String b=element2.getText();
		System.out.println(a);
		System.out.println(b);
		
		int i=Integer.parseInt(a);
		System.out.println(i);
		
		int i1=Integer.parseInt(b);
		System.out.println(i1);
		
		int x=i+i1;
		System.out.println(x);
		
		String s=Integer.toString(x);
		WebElement Total=driver.findElement(By.id("number"));
		Total.sendKeys(s);
		driver.findElement(By.id("demo")).click();
		
		Thread.sleep(1000);
		WebElement sc=driver.findElement(By.id("swup"));
		
		File src=sc.getScreenshotAs(OutputType.FILE);
		
		String path =System.getProperty("user.dir");
		
        File dest=new File(path+"/Screenshot/.png");
		
		
	    FileHandler.copy(src, dest);
	   
		
		

	}

}

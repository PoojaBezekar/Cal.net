package flip;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Calculator {
	
	WebDriver driver;
	
	 @BeforeTest
	  public void beforeTest() {
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 driver.get("https://www.calculator.net/");
			 driver.manage().window().maximize();
	  }
  @Test (priority=0)
  public void Mul() {
	  
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();  //4
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();  //2
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();  //3
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[4]")).click();  //*
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();  //5
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();  //2
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();  //5
	  
	  String Result = driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]")).getText();
		String preview = driver.findElement(By.xpath("//*[@id=\"sciInPut\"]")).getText();
		System.out.println("Multiplication : "+preview+Result);
	  
	  driver.navigate().refresh();
	  }

  @Test  (priority=1)
  public void Div()  {
	  
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();  //4
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();  //0
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();  //0
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();  //0
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[4]")).click();  //Div
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();  //2
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();  //0
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();  //0
	  
	  String Result = driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]")).getText();
		String preview = driver.findElement(By.xpath("//*[@id=\"sciInPut\"]")).getText();
		System.out.println("Division :"+preview+Result);
	 
	  driver.navigate().refresh();
	  }

  @Test  (priority=2)
  public void Add()  {
	  
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click();  //-
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();  //2
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();  //3
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();  //4
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();  //2
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();  //3
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();  //4
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[4]")).click();  //sub
	  
	  driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();  //3
	  driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();  //4
	  driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();  //5 
	  driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();  //3
	  driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();  //4
	  driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();  //5
	  
	  String Result = driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]")).getText();
		String preview = driver.findElement(By.xpath("//*[@id=\"sciInPut\"]")).getText();
		System.out.println("Addition :"+preview+Result);
	  
	  driver.navigate().refresh();
	  }
  
  @Test  (priority=3)
  public void Sub()  {
	  
	  driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();  //2
	  driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();  //3
	  driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();  //4
	  driver.findElement(By.xpath("//span[@onclick='r(8)']")).click();  //8
	  driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();  //2
	  driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();  //3
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click(); //sub
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click();  //-
	  driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();  //2
	  driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();  //3
	  driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();  //0
	  driver.findElement(By.xpath("//span[@onclick='r(9)']")).click();  //9
	  driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();  //4
	  driver.findElement(By.xpath("//span[@onclick='r(8)']")).click();  //8
	  driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();  //2
	  driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();  //3
	  
	  String Result = driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]")).getText();
	  String preview = driver.findElement(By.xpath("//*[@id=\"sciInPut\"]")).getText();
	  System.out.println("Subtraction :"+preview+Result);
  
  }
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}

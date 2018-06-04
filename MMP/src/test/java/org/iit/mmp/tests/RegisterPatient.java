package org.iit.mmp.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPatient {
	public static void main(String[] args) {

		String PatientUrl="http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php";
		String AdminUrl="http://96.84.175.78/MMP-Release2-Admin-Build.2.1.000/login.php";

		WebDriver driver = new ChromeDriver();
		//enter patient login url
		driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//click on the register button
		driver.findElement(By.xpath("//input[@value='Register']")).click();


	}
}
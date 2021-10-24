package org.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class SelenideGoogleTest {
	
	
	@Test
	public void googleSearchTest() {
	
		open("https://www.google.com");
		$(By.name("q")).setValue("MakeMytrip");
		$(By.name("btnK")).click();
		$(By.id("logo")).shouldHave(Condition.appear);
		String header = $(By.xpath("//h3[contains(text(),'MakeMyTrip')]")).getText();
	   System.out.println(header);
	   int headerCount = $$(By.xpath("//h3[contains(text(),'MakeMyTrip')]")).size();
	   System.err.println(headerCount);
	   $$(By.xpath("//h3[contains(text(),'MakeMyTrip')]")).shouldHave(CollectionCondition.size(5));
	   
	}

}

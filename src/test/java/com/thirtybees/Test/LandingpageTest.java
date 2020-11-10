package com.thirtybees.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import org.testng.asserts.SoftAssert;


import com.thirtybees.resources.Base;

public class LandingpageTest extends Base {
	public WebDriver driver;
	public static Logger log= LogManager.getLogger(LandingpageTest.class.getName());
	SoftAssert sa = new SoftAssert();

	
}

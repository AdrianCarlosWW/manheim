package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Story1 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://shoestore-manheim.rhcloud.com/r";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testStory1() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [openWindow | http://shoestore-manheim.rhcloud.com  | ]]
    driver.findElement(By.linkText("January")).click();
    try {
      assertTrue(isElementPresent(By.cssSelector("img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("td.shoe_result_value.shoe_price")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("td.shoe_result_value.shoe_description")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("February")).click();
    try {
      assertTrue(isElementPresent(By.cssSelector("img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("td.shoe_result_value.shoe_price")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("td.shoe_result_value.shoe_description")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("March")).click();
    try {
      assertTrue(isElementPresent(By.cssSelector("img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("td.shoe_result_value.shoe_price")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("td.shoe_result_value.shoe_description")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("April")).click();
    try {
      assertTrue(isElementPresent(By.cssSelector("img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("td.shoe_result_value.shoe_price")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("td.shoe_result_value.shoe_description")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("May")).click();
    try {
      assertTrue(isElementPresent(By.cssSelector("img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("td.shoe_result_value.shoe_price")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("td.shoe_result_value.shoe_description")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("June")).click();
    try {
      assertTrue(isElementPresent(By.cssSelector("img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("td.shoe_result_value.shoe_price")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("td.shoe_result_value.shoe_description")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("July")).click();
    try {
      assertTrue(isElementPresent(By.cssSelector("img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("td.shoe_result_value.shoe_price")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("td.shoe_result_value.shoe_description")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("August")).click();
    try {
      assertTrue(isElementPresent(By.cssSelector("img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("td.shoe_result_value.shoe_price")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("td.shoe_result_value.shoe_description")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("September")).click();
    try {
      assertTrue(isElementPresent(By.cssSelector("img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("td.shoe_result_value.shoe_price")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("td.shoe_result_value.shoe_description")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("October")).click();
    try {
      assertTrue(isElementPresent(By.cssSelector("img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("td.shoe_result_value.shoe_price")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("td.shoe_result_value.shoe_description")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("November")).click();
    try {
      assertTrue(isElementPresent(By.cssSelector("img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("td.shoe_result_value.shoe_price")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("td.shoe_result_value.shoe_description")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("December")).click();
    try {
      assertTrue(isElementPresent(By.cssSelector("img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("td.shoe_result_value.shoe_price")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("td.shoe_result_value.shoe_description")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

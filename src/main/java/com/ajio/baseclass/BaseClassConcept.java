package com.ajio.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClassConcept {
	
	public static WebDriver driver;
	
	public static WebDriver get_Browser(String browser) {
		
		try {
			if (browser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", 
						System.getProperty("user.dir") + ("\\Driver\\chromedriver.exe"));
				driver = new ChromeDriver();
			}
				
			else if (browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", 
						System.getProperty("user.dir") + ("\\Driver\\msedgedriver.exe"));
					driver = new EdgeDriver();
			}
			
			else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", 
						System.getProperty("user.dir") + ("\\Driver\\geckodriver.exe"));
						driver = new FirefoxDriver();
			}
					else {
						System.out.println("invalid_browser");
					}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		driver.manage().window().maximize();
		return driver;
			}	
	
	public static void get_URL(String path) {
		try {
			driver.get(path);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void dropDown(WebElement element , String Options, String value) {
		Select s = new Select(element);
		
		try {
			if (Options.equalsIgnoreCase("byIndex")) {
				int parseInt = Integer.parseInt(value);
				s.selectByIndex(parseInt);
			}
			else if (Options.equalsIgnoreCase("byValue")) {
				s.selectByValue(value);
			}
			else if (Options.equalsIgnoreCase("byVisibleText")) {
				s.selectByVisibleText(value);
			}
			else {
				System.out.println("Invalid Selection");
			}
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}	
		
		}

	public static void get_Title() {
		try {
			driver.getTitle();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void getCurrent_URL() {
		try {
			driver.getCurrentUrl();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void close() {
		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void quit() {
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void navigate(String url) {
		try {
			driver.navigate().to(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void forward() {
		try {
			driver.navigate().forward();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void backward() {
		try {
			driver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void refresh() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void InputValueElement(WebElement element, String Value) {
		try {
			element.sendKeys(Value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void SelectElement(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void Clear(WebElement element) {
		try {
			element.clear();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void enabled(WebElement element) {
		try {
			element.isEnabled();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void selected(WebElement element) {
		try {
			element.isSelected();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void displayed(WebElement element) {
		try {
			element.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void getAtt(WebElement element, String Value) {
		try {
			element.getAttribute(Value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
		public static void robotClass() throws AWTException {
			Robot rb = new Robot();
			rb.keyPress(KeyEvent.VK_DOWN);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_DOWN);
			rb.keyRelease(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_A);
			rb.keyRelease(KeyEvent.VK_B);
			rb.keyRelease(KeyEvent.VK_C);
			rb.keyRelease(KeyEvent.VK_D);
			rb.keyRelease(KeyEvent.VK_E);
			rb.keyRelease(KeyEvent.VK_F);
			rb.keyRelease(KeyEvent.VK_G);
			rb.keyRelease(KeyEvent.VK_H);
			rb.keyRelease(KeyEvent.VK_I);
			rb.keyRelease(KeyEvent.VK_J);
			rb.keyRelease(KeyEvent.VK_K);
			rb.keyRelease(KeyEvent.VK_L);
			rb.keyRelease(KeyEvent.VK_M);
			rb.keyRelease(KeyEvent.VK_N);
			rb.keyRelease(KeyEvent.VK_O);
			rb.keyRelease(KeyEvent.VK_P);
			rb.keyRelease(KeyEvent.VK_Q);
			rb.keyRelease(KeyEvent.VK_R);
			rb.keyRelease(KeyEvent.VK_S);
			rb.keyRelease(KeyEvent.VK_T);
			rb.keyRelease(KeyEvent.VK_U);
			rb.keyRelease(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_W);
			rb.keyRelease(KeyEvent.VK_X);
			rb.keyRelease(KeyEvent.VK_Y);
			rb.keyRelease(KeyEvent.VK_Z);
			rb.keyRelease(KeyEvent.VK_0);
			rb.keyRelease(KeyEvent.VK_1);
			rb.keyRelease(KeyEvent.VK_2);
			rb.keyRelease(KeyEvent.VK_3);
			rb.keyRelease(KeyEvent.VK_4);
			rb.keyRelease(KeyEvent.VK_5);
			rb.keyRelease(KeyEvent.VK_6);
			rb.keyRelease(KeyEvent.VK_7);
			rb.keyRelease(KeyEvent.VK_8);
			rb.keyRelease(KeyEvent.VK_9);
		}
		
	

	}

	
	
	


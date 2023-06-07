import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase {

	String TheUrl = "https://magento.softwaretestingboard.com/";
	static WebDriver driver = new ChromeDriver();
	String Signin = "https://magento.softwaretestingboard.com/customer/account/create/";
	String Signout = "https://magento.softwaretestingboard.com/customer/account/logout/";
	String login = "https://magento.softwaretestingboard.com/customer/account/login/";
	Random rand = new Random();
	String[] firstNamelist = { "ahmed", "Reem", "toqa", "mohmd", "anas" };
	String[] lastNamelist = { "bahaa", "faisel", "hussien", "mohmd", "yazan" };
	int Randomindex = rand.nextInt(0, 5);
	int RandomInd = rand.nextInt(0, 100);
	String emailUser = "user";
	String emailComplete = "@gmail.com";
	String PassUsers = "Leen123#$";
	String emailLogin;

	@BeforeTest
	public void MyBeforeTest() {
		driver.get(TheUrl);
		driver.manage().window().maximize();
	}

	/*
	 * @Test(priority = 1) public void Signup() throws InterruptedException {
	 * driver.get(Signin); WebElement firstName =
	 * driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
	 * firstName.sendKeys(firstNamelist[Randomindex]);
	 * 
	 * WebElement lastName = driver.findElement(By.xpath("//*[@id=\"lastname\"]"));
	 * lastName.sendKeys(lastNamelist[Randomindex]);
	 * 
	 * WebElement Email =
	 * driver.findElement(By.xpath("//*[@id=\"email_address\"]"));
	 * Email.sendKeys(emailUser + RandomInd + emailComplete); emailLogin = emailUser
	 * + RandomInd + emailComplete;
	 * 
	 * WebElement passWord = driver.findElement(By.xpath("//*[@id=\"password\"]"));
	 * passWord.sendKeys(PassUsers);
	 * 
	 * WebElement ConfirmPass =
	 * driver.findElement(By.xpath("//*[@id=\"password-confirmation\"]"));
	 * ConfirmPass.sendKeys(PassUsers); WebElement CreateAccount =
	 * driver.findElement(By.xpath(
	 * "//*[@id=\"form-validate\"]/div/div[1]/button/span")); CreateAccount.click();
	 * Thread.sleep(5000); driver.get(Signout);
	 * 
	 * }
	 * 
	 * @Test(priority = 2) public void Login() { driver.get(login); WebElement
	 * Emaillog = driver.findElement(By.xpath("//*[@id=\"email\"]\r\n"));
	 * Emaillog.sendKeys(emailLogin); WebElement Pass =
	 * driver.findElement(By.xpath("//*[@id=\"pass\"]")); Pass.sendKeys(PassUsers);
	 * 
	 * WebElement logBtn = driver.findElement(By.xpath("//*[@id=\"send2\"]/span"));
	 * logBtn.click(); }
	 */
	@Test()
	public void Items() throws InterruptedException {
		String[] itemsPage = { "https://magento.softwaretestingboard.com/radiant-tee.html",
				"https://magento.softwaretestingboard.com/breathe-easy-tank.html",
				"https://magento.softwaretestingboard.com/argus-all-weather-tank.html",
				"https://magento.softwaretestingboard.com/hero-hoodie.html",
				"https://magento.softwaretestingboard.com/fusion-backpack.html" };

		for (int i = 0; i < itemsPage.length; i++) {
			driver.get(itemsPage[i]);
			Thread.sleep(3000);
			if (driver.getCurrentUrl().contains("radiant")) {

				WebElement colors = driver
						.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div"));
				List<WebElement> colorsBox = colors.findElements(By.tagName("div"));
				rand.nextInt(0, colorsBox.size());
				colorsBox.get(Randomindex).click();
			
				WebElement sizesBox = driver
						.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]/div"));
				List<WebElement> Sizes = sizesBox.findElements(By.tagName("div"));
				rand.nextInt(0, Sizes.size());
				Sizes.get(Randomindex).click();
			}

			else if (driver.getCurrentUrl().contains("breathe")) {
				WebElement colors = driver
						.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div"));
				List<WebElement> colorsBox = colors.findElements(By.tagName("div"));
				rand.nextInt(0, colorsBox.size());
				colorsBox.get(Randomindex).click();
				
	

				WebElement sizesBox = driver
						.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]/div"));
				List<WebElement> Sizes = sizesBox.findElements(By.tagName("div"));
				rand.nextInt(0, Sizes.size());
				Sizes.get(Randomindex).click();
			
				
			} else if (driver.getCurrentUrl().contains("argus")) {
				WebElement colors = driver
						.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div"));
				List<WebElement> colorsBox = colors.findElements(By.tagName("div"));
				rand.nextInt(0, colorsBox.size());
				colorsBox.get(Randomindex).click();
			

				WebElement sizesBox = driver
						.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]/div"));
				List<WebElement> Sizes = sizesBox.findElements(By.tagName("div"));
				rand.nextInt(0, Sizes.size());
				Sizes.get(Randomindex).click();
				

				
			} else if (driver.getCurrentUrl().contains("hero")) {
				WebElement colors = driver
						.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div"));
				List<WebElement> colorsBox = colors.findElements(By.tagName("div"));
				rand.nextInt(0, colorsBox.size());
				colorsBox.get(Randomindex).click();

				WebElement sizesBox = driver
						.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]/div"));
				List<WebElement> Sizes = sizesBox.findElements(By.tagName("div"));
				rand.nextInt(0, Sizes.size());
				Sizes.get(Randomindex).click();
		
			}

			else if (driver.getCurrentUrl().contains("fusion")) {
			
				
			}
		}
	}
}

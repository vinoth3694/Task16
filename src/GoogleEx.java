


	import static org.testng.Assert.assertEquals;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class GoogleEx {

		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			
	
			WebDriver d = new ChromeDriver();
			
		
			d.get("https://www.google.co.in/");
			
		
			if(d.getTitle().equals("Google")) {
				System.out.println("Browser Landed in correct page");
		
				d.findElement(By.id("APjFqb")).sendKeys("Selenium Browser Driver");
				
				Thread.sleep(2000);
				
				d.findElement(By.className("gNO89b")).click();
			}
			else {
				System.out.println("Page title did not matched");
			}
			
			Thread.sleep(5000);
			d.quit();
		}
	}



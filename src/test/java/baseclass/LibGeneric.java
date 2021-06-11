package baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LibGeneric {

	public static WebDriver driver;

	// to launch the browser
	public WebDriver browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vignesh\\eclipse-workspace\\SeleniumDemo\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	// Javascript executor
			public static void enterTextByJs(WebElement ele, String data ) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].setAttribute('value','"+ data + "')", ele);
			}
			
			

	// to close the browser
	public void browserClose() {
		driver.close();
	}

	// to launch the url
	public void launchUrl(String url) {
		driver.get(url);
	}

	// to get current url
	public String currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	// to get title
	public String title() {
		String title = driver.getTitle();
		return title;
	}

	// to enter send keys
	public void sendKeys(WebElement ele, String val) {
		ele.sendKeys(val);
	}

	// to get text
	public String getText(WebElement ele) {
		String text = ele.getText();
		return text;
	}

	// to click the button
	public void btnClick(WebElement ele) {
		ele.click();
	}

	// to select by value
	public void selectByValue(WebElement ele, String option) {
		Select obj = new Select(ele);
		obj.selectByValue(option);
	}

	// to select by visible text
	public void selectByVisibleText(WebElement ele, String txt) {
		Select obj = new Select(ele);
		obj.selectByValue(txt);
	}

	// to select by index
	public void selectByIndex(WebElement ele, int i) {
		Select obj = new Select(ele);
		obj.selectByIndex(i);
	}

	// to deselect by value
	public void deselectByValue(WebElement ele, String option) {
		Select obj = new Select(ele);
		obj.deselectByValue(option);
	}

	// to deselect by visible text
	public void deselectByVisibleText(WebElement ele, String txt) {
		Select obj = new Select(ele);
		obj.deselectByValue(txt);
	}

	// to deselect by index
	public void deselectByIndex(WebElement ele, int i) {
		Select obj = new Select(ele);
		obj.deselectByIndex(i);
	}

	// to deselect all
	public void deselectAll(WebElement ele) {
		Select obj = new Select(ele);
		obj.deselectAll();
	}

	// Is Multiple
	public boolean IsMultiple(WebElement ele) {
		Select obj = new Select(ele);
		return obj.isMultiple();
	}

	// to getAllSelectedOptions
	public void getAllSelectedOptions(WebElement ele) {
		Select obj = new Select(ele);
		obj.getAllSelectedOptions();
	}

	// mouse action move to element
	public void mouseAct(WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
	}

	// mouse action double click
	public void doubleClick(WebElement ele) {
		Actions act = new Actions(driver);
		act.doubleClick(ele).build().perform();
	}
	
	// Drag and drop
		public void dragAndDrop(WebElement source, WebElement destiny) {
			Actions act = new Actions(driver);
			act.dragAndDrop(source,destiny).build().perform();
		}

		
		
		
		
	// to get output stream
	// public void fileOutput() throws FileNotFoundException {

	// File f = new
	// File("C:\\Users\\vignesh\\eclipse-workspace\\Maven_Login\\Excel\\OutputData.xlsx");

	// FileOutputStream fout = new FileOutputStream(f);
	// }

	// to get Attribute
	public String getTextAttribute(WebElement ele) {
		String attribute = ele.getAttribute("val");
		return attribute;
	}

	// To get parent window id
	public String windowHandle() {

		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}

	// To get all window id
	public Set<String> windowHandles() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}

	// To get first selected option
	public void firstSelectedOption(WebElement e) {

	}

	// to read the value from excel
	public String excelRead(int rowNo, int cellNo) throws IOException {

		File f = new File("C:\\Users\\vignesh\\eclipse-workspace\\Maven_Login\\Excel\\InputData.xlsx");

		FileInputStream fin = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fin);

		Sheet s = w.getSheet("Data");

		Row r = s.getRow(rowNo);

		Cell c = r.getCell(cellNo);
		int type = c.getCellType();
		String val;
		if (type == 1) {
			// String
			val = c.getStringCellValue();

		} else if (DateUtil.isCellDateFormatted(c)) {
			// date
			SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
			Date d = c.getDateCellValue();
			val = sim.format(d);

		} else {
			// Number
			double d = c.getNumericCellValue();
			// type casting
			long l = (long) d;
			val = String.valueOf(l);

		}
		return val;
	}

}

package GeoAptekaPackage;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by user on 2/23/17.
 */
public class MethodForAptekaStartPage extends BaseConfig
{
    static WebDriverWait wait = new WebDriverWait(driver,5);
    static int c = 1;

    public MethodForAptekaStartPage(String url) {
        super(url);
    }

    public static WebElement initObject(String xpath){
        WebElement el= wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(xpath))));
        return el;
    }

    public static void click(String xpath){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(xpath)))).click();
    }

    public static void sendDate(String xpath,String mess){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(xpath)))).sendKeys(mess);
    }

    public static void selectFromTheListForTimeDesc(String xpath, String xpath1){
        Select sel = new Select(initObject(xpath));
        sel.selectByVisibleText("Время в пути");
        Select sel1 = new Select(initObject(xpath1));
        sel1.selectByVisibleText("убыванию");
    }

    public static void comparisonCountAptek(String before, String after){
         Assert.assertEquals(before,after);
         Assert.assertTrue("Количество аптек не совпадает после сортировки",before.equals(after));
    }

    public static void selectFromTheListForPriceDesc(String xpath, String xpath1){
        Select sel = new Select(initObject(xpath));
        sel.selectByVisibleText("Цена");
        Select sel1 = new Select(initObject(xpath1));
        sel1.selectByVisibleText("убыванию");
    }

    public static void selectFromTheListForOstatokDesc(String xpath, String xpath1){
        Select sel = new Select(initObject(xpath));
        sel.selectByVisibleText("Остаток");
        Select sel1 = new Select(initObject(xpath1));
        sel1.selectByVisibleText("убыванию");
    }
    public static void selectFromTheListForOstatokAsc(String xpath, String xpath1){
        Select sel = new Select(initObject(xpath));
        sel.selectByVisibleText("Остаток");
        Select sel1 = new Select(initObject(xpath1));
        sel1.selectByVisibleText("возрастанию");
    }
    public static void selectFromTheListForPriceAsc(String xpath, String xpath1){
        Select sel = new Select(initObject(xpath));
        sel.selectByVisibleText("Цена");
        Select sel1 = new Select(initObject(xpath1));
        sel1.selectByVisibleText("возрастанию");
    }
    public static void selectFromTheListForTimeAsc(String xpath, String xpath1){
        Select sel = new Select(initObject(xpath));
        sel.selectByVisibleText("Время в пути");
        Select sel1 = new Select(initObject(xpath1));
        sel1.selectByVisibleText("возрастанию");
    }

    public static void shoot() throws IOException
    {
        String k = "resources/screensh";
        String n = ".png";
        ArrayList<File> arr = new ArrayList<File>();
        for (int i = arr.size(); i == arr.size(); i--)
        {
            k = k + c;
            File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            arr.add(screenshot);
            if(arr.size()==0)
                userLogger.error("Скриншот не осуществлен");
            else FileUtils.copyFile(screenshot, new File(k + n));
            c++;
        }
    }
}

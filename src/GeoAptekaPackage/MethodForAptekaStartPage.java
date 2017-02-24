package GeoAptekaPackage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by user on 2/23/17.
 */
public class MethodForAptekaStartPage extends BaseConfig
{
    static WebDriverWait wait = new WebDriverWait(driver,5);

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

    public static void selectFromTheListForTime(String xpath, String xpath1){
        Select sel = new Select(initObject(xpath));
        sel.selectByVisibleText("Время в пути");
        Select sel1 = new Select(initObject(xpath1));
        sel1.selectByVisibleText("убыванию");
    }

    public static void comparisonCountAptek(String before, String after){
         Assert.assertEquals(before,after);
         Assert.assertTrue("Количество аптек не совпадает после сортировки",before.equals(after));
    }

}

package GeoAptekaPackage;

import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by user on 2/23/17.
 */
public class GeoAptekaStartPage extends BaseConfig
{
    String xpathForTabApteka = "//a[@href = \"#table\"]";
    String xpathForSelectOption = ".//*[@id='order_field']";
    String xpathForSelectDirection = ".//*[@id='order_way']";
    String countAptek = "//div[@class = \"summary\"]";
    String countAptek1 = "//div[@class = \"summary\"]";

    public GeoAptekaStartPage(String url) {
        super(url);
    }

    @Test
    public void sortForTimeDescending() throws InterruptedException {
        MethodForAptekaStartPage.click(xpathForTabApteka);
        System.out.print(MethodForAptekaStartPage.initObject(countAptek).getText());
        MethodForAptekaStartPage.selectFromTheListForTimeDesc(xpathForSelectOption, xpathForSelectDirection);
        System.out.print(MethodForAptekaStartPage.initObject(countAptek1).getText());
        MethodForAptekaStartPage.comparisonCountAptek(countAptek,countAptek1);
    }

    @Test
    public void sortForOstatokDescending() throws InterruptedException {
        MethodForAptekaStartPage.click(xpathForTabApteka);
        System.out.print(MethodForAptekaStartPage.initObject(countAptek).getText());
        MethodForAptekaStartPage.selectFromTheListForOstatokDesc(xpathForSelectOption, xpathForSelectDirection);
        System.out.print(MethodForAptekaStartPage.initObject(countAptek1).getText());
        MethodForAptekaStartPage.comparisonCountAptek(countAptek,countAptek1);

    }

    @Test
    public void sortForPriceDescending() throws InterruptedException {
        MethodForAptekaStartPage.click(xpathForTabApteka);
        System.out.print(MethodForAptekaStartPage.initObject(countAptek).getText());
        MethodForAptekaStartPage.selectFromTheListForPriceDesc(xpathForSelectOption, xpathForSelectDirection);
        System.out.print(MethodForAptekaStartPage.initObject(countAptek1).getText());
        MethodForAptekaStartPage.comparisonCountAptek(countAptek,countAptek1);
    }

    @Test
    public void sortForPriceAscending() throws InterruptedException {
        MethodForAptekaStartPage.click(xpathForTabApteka);
        System.out.print(MethodForAptekaStartPage.initObject(countAptek).getText());
        MethodForAptekaStartPage.selectFromTheListForPriceAsc(xpathForSelectOption, xpathForSelectDirection);
        System.out.print(MethodForAptekaStartPage.initObject(countAptek1).getText());
        MethodForAptekaStartPage.comparisonCountAptek(countAptek,countAptek1);
    }

    @Test
    public void sortForOstatokAscending() throws InterruptedException {
        MethodForAptekaStartPage.click(xpathForTabApteka);
        System.out.print(MethodForAptekaStartPage.initObject(countAptek).getText());
        MethodForAptekaStartPage.selectFromTheListForOstatokAsc(xpathForSelectOption, xpathForSelectDirection);
        System.out.print(MethodForAptekaStartPage.initObject(countAptek1).getText());
        MethodForAptekaStartPage.comparisonCountAptek(countAptek,countAptek1);
    }

    @Test
    public void sortForTimeAscending() throws InterruptedException {
        MethodForAptekaStartPage.click(xpathForTabApteka);
        System.out.print(MethodForAptekaStartPage.initObject(countAptek).getText());
        MethodForAptekaStartPage.selectFromTheListForTimeAsc(xpathForSelectOption, xpathForSelectDirection);
        System.out.print(MethodForAptekaStartPage.initObject(countAptek1).getText());
        MethodForAptekaStartPage.comparisonCountAptek(countAptek,countAptek1);
    }

    @Test
    public void showWorkHours() throws InterruptedException {
        MethodForAptekaStartPage.click(xpathForTabApteka);
        driver.findElement(By.xpath("//div[@class = \"pharmacy_title_working has-list\"]")).click();
        Thread.sleep(1000);
    }

    @Test
    public void receiveListOfAptek() throws InterruptedException {
        MethodForAptekaStartPage.click(xpathForTabApteka);
        Thread.sleep(1000);
    }

}

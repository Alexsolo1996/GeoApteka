package GeoAptekaPackage;

import org.junit.Test;

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
    public void sortDescending() throws InterruptedException {
        MethodForAptekaStartPage.click(xpathForTabApteka);
        System.out.print(MethodForAptekaStartPage.initObject(countAptek).getText());
        MethodForAptekaStartPage.selectFromTheListForTime(xpathForSelectOption, xpathForSelectDirection);
        System.out.print(MethodForAptekaStartPage.initObject(countAptek1).getText());
        MethodForAptekaStartPage.comparisonCountAptek(countAptek,countAptek1);
        Thread.sleep(2000);
    }

    @Test
    public void receiveListOfAptek() throws InterruptedException {
        MethodForAptekaStartPage.click(xpathForTabApteka);
        Thread.sleep(1000);
    }

}

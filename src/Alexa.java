/**
 * Created by dan on 5/26/15.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class Alexa extends Scrapper{

    public String url;

    public Alexa(String _maternalURL, String _baseURL,
                 String _xpathOfInputField, String browser, String jsonName)
    {
        super(_maternalURL, _baseURL,
                _xpathOfInputField,  browser, jsonName);
    }

    @Override
    boolean check_availability() throws NoSuchElementException {
        String chck = this.driver.findElement(By.xpath("//*[@id=\"no-enough-data\"]/div/div/span[1]/span/strong" )).getText();

        if ((chck.toLowerCase().contains("Sorry, we do not have data on this website".toLowerCase())))
            return false;
        else
            return true;
    }

}

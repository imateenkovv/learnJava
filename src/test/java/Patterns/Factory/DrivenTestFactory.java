package Patterns.Factory;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;

/**
 * @author mateenkov
 */

public class DrivenTestFactory {
    /* У наса есть много классов и их нужно вызывать , но они с разными параметрами и вызывая их ,
    очень легко запутатья.
      Паттерн ФАБРИКА реализует собой один метод в которым можно вызвать логику нескольких объектов

      НАпример можно написать метод который будет в зависимости от входных параметров возвращать нужный веб-драйвер
      Либо веб, либо ios , либо Andriod и задать его настройки

     */

    public static WebDriver getTestDriver(String platform) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        if (platform.equalsIgnoreCase("windows")) {
            Configuration.browserSize = "1920x1080";
            Configuration.screenshots = true;
            return WebDriverRunner.getWebDriver();
        }// else if () {
        // и много много разных платформа и их параметров
        else {
            throw new IllegalArgumentException("Unknown mobile platform");
        }
    }
}

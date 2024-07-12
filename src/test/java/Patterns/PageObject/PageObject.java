package Patterns.PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

/**
 * @author mateenkov
 */

public class PageObject {

    /* Класс с описанием элементов страницы с их действиями, для дальнейшего переиспользования в других тестах   */

    private SelenideElement inputLogin = $x("//input[@class = 'field-login']");
    private SelenideElement inputPassword = $x("//input[@class = 'field-password']");
    private SelenideElement buttonSubmit = $x("//input[@class = 'submit']");

    public PageObject login(String userName, String password) {
        inputLogin.sendKeys(userName);
        inputPassword.sendKeys(password);
        buttonSubmit.click();
        return this;
    }

    public PageObject setLogin(String login) {
        inputLogin.sendKeys(login);
        return this;
    }

    public PageObject isDisplayd() {
        buttonSubmit.isDisplayed();
        return this;
    }

}

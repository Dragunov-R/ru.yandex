package ru.mail.yandex;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class FirstTest extends WebDriverSettings {

    @Test
    public void FirstTest1() {
        driver.get("https://mail.yandex.ru/");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Яндекс.Почта — бесплатная и надежная электронная почта"));

        WebElement input1 = driver.findElement(By.xpath("//a[@class='control button2 button2_view_classic button2_size_mail-big button2_theme_mail-white button2_type_link HeadBanner-Button HeadBanner-Button-Enter with-shadow']"));
        input1.click();

        //Поиск поля и ввод логина
        String title2 = driver.getTitle();
        Assert.assertTrue(title2.equals("Авторизация"));
        WebElement input2 = driver.findElement(By.xpath("//input[@id='passp-field-login']"));
        input2.sendKeys("mr.robot010");

        //Поиск и клик по кнопке далее
        WebElement button1 = driver.findElement(By.xpath("//button[@class='Button2 Button2_size_l Button2_view_action Button2_width_max Button2_type_submit']"));
        button1.click();

        //Ожидание загрузки страницы
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        //Поиск поля и ввод пароля
        WebElement input3 = driver.findElement(By.xpath("//input[@id='passp-field-passwd']"));
        input3.sendKeys("sabrer-qobte1-Woctus");

        //Поиск и клик по кнопке вход
        WebElement button2 = driver.findElement(By.xpath("//div[@class='passp-button passp-sign-in-button']"));
        button2.click();

        //Ожидание загрузки страницы
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        //Поиск и клик по кнопке написать письмо
        String title3 = driver.getTitle();
        WebElement sendmail = driver.findElement(By.xpath("//a[@class='mail-ComposeButton js-main-action-compose']"));
        sendmail.click();

        //Ожидание загрузки страницы
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        //Ввод адреса получателя
        WebElement sendto = driver.findElement(By.xpath("//div[@data-class-bubble='yabble-compose js-yabble']"));
        sendto.sendKeys("funforfun1994@gmail.com");

        //Заполнение тема письма
        WebElement theme = driver.findElement(By.xpath("//input[@class='composeTextField ComposeSubject-TextField']"));
        theme.sendKeys("Письмо отправлено при помощи автоматизированного ПО");

        //Ввод текста письма
        WebElement text = driver.findElement(By.xpath("//div[@placeholder='Напишите что-нибудь']"));
        text.sendKeys("Привет, я автоматизированное ПО =)");

        //Поиск и клик по кнопке "Отправить"
        WebElement sendmail2 = driver.findElement(By.xpath("//button[@class='control button2 button2_view_default button2_tone_default button2_size_l button2_theme_action button2_pin_circle-circle ComposeControlPanelButton-Button ComposeControlPanelButton-Button_action']"));
        sendmail2.click();

    }

}


package pageObjects;

import org.openqa.selenium.By;

public interface CreateWarriorPageObjects
{
    By createWarriorButton = By.id("warrior");
    By warriarUserName=By.id("worrior_username");
    By gameDescription=By.xpath("//*[@class='block border']/p");
    By warriorNameQuestion=By.className("summary");
    By characterLimitLabel =By.id("popup");
    By startJourneyButton = By.id("start");

}

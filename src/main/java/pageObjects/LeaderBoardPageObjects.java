package pageObjects;

import org.openqa.selenium.By;

public interface LeaderBoardPageObjects
{
    By leaderboardText = By.xpath("//p[contains(text(),'LEADERBOARD')]");

    static By userName(String text){return By.xpath("//td[contains(text(),'"+text+"')]");}

    static By userScore(String text){return By.xpath("//td[contains(text(),'"+text+"')]/following-sibling::td");}

    By continueFightingButton = By.xpath("//button[contains(text(),'Continue fighting')]");
}

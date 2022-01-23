package pageObjects;

import org.openqa.selenium.By;

public interface OfficePageObjects
{
    By welcomeText = By.xpath("//*[contains(text(),'entered the office')]");
    By startButton = By.id("start");
    By SocialDistanceAnswer = By.xpath("//*[contains(text(),'Social Distance')]");
    By correctText = By.xpath("//*[contains(text(),'That is correct!')]");
    By leaderBoardLink = By.id("leaderboard_link");
    
}

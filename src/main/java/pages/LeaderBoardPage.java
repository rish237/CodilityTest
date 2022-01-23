package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.LeaderBoardPageObjects;
import testData.pagesData.LeaderBoardPageData;
import utils.ElementUtility;
import utils.GlobalUtility;

public class LeaderBoardPage
{
    LeaderBoardPageObjects leaderBoardPageObjects;

    public int verifyLeaderBoardPage(String Username,WebDriver driver)  {

        ElementUtility.waitForElementToBeVisible(LeaderBoardPageObjects.leaderboardText, 10, driver);
        WebElement leaderBoardText = ElementUtility.fetchElement(LeaderBoardPageObjects.leaderboardText,driver);

        GlobalUtility.printActualExpectedValues(LeaderBoardPageData.leaderBoardText,leaderBoardText.getText());
        Assert.assertEquals(LeaderBoardPageData.leaderBoardText, leaderBoardText.getText());


        By UserNameLocator = LeaderBoardPageObjects.userName(Username);

        ElementUtility.waitForElementToBeVisible(UserNameLocator, 10, driver);
        WebElement userName = ElementUtility.fetchElement(UserNameLocator,driver);

        GlobalUtility.printActualExpectedValues(Username,userName.getText());
        Assert.assertEquals(Username, userName.getText());

        ElementUtility.waitForElementToBeVisible(LeaderBoardPageObjects.userScore(Username), 10, driver);
        WebElement userScore = ElementUtility.fetchElement(LeaderBoardPageObjects.userScore(Username),driver);

        int Score = Integer.parseInt(userScore.getText());

      return Score;
    }


    public void verifyUserScore(String Username,WebDriver driver)
    {

        ElementUtility.waitForElementToBeVisible(LeaderBoardPageObjects.userScore(Username), 10, driver);
        WebElement userScore = ElementUtility.fetchElement(LeaderBoardPageObjects.userScore(Username),driver);

        GlobalUtility.printActualExpectedValues(LeaderBoardPageData.leaderBoardScore,userScore.getText());
        Assert.assertEquals(LeaderBoardPageData.leaderBoardScore, userScore.getText());
    }

    public void backToBattleHomepage(WebDriver driver)
    {
        ElementUtility.waitForElementToBeClickable(LeaderBoardPageObjects.continueFightingButton, 10, driver);

        WebElement continueFightingButton = ElementUtility.fetchElement(LeaderBoardPageObjects.continueFightingButton,driver);
        continueFightingButton.click();
    }


}

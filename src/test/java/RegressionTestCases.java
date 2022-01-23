import org.testng.annotations.*;
import pages.*;
import testData.testCaseData.CreateUserTestCaseData;
import utils.GlobalUtility;

import java.util.Random;

public class RegressionTestCases extends BaseTestCase
{

    @Test
    public String createWarriorAndLogin() {

        CreateWarriorPage createWarriorPage = new CreateWarriorPage();

        GlobalUtility.loadURL(CreateUserTestCaseData.url, driver);

        logger.info("Verifying Home Page");
        createWarriorPage.verifyWarriorPage(driver);
        logger.info("Create Username & Start Journey");
        Random rand = new Random();
        //generate random values to be used under username
        int int_random = rand.nextInt(999999);
        String Username = "User"+int_random;
        createWarriorPage.enterUserNameAndLogin(Username,driver);
        System.out.println("UserName - "+ Username);
        BattlefieldHomePage battlefieldHomePage = new BattlefieldHomePage();
        logger.info("Verify Battlefield Home Page for User "+ Username);
        battlefieldHomePage.verifyBattlefieldHomePage(Username,driver);

        return Username;
    }

    @Test
    public String doSomeChallenges()
    {

        String Username = this.createWarriorAndLogin();

        BattlefieldHomePage battlefieldHomePage = new BattlefieldHomePage();
        logger.info("Entering All Battlefield Home Page");
        battlefieldHomePage.enterAllBattlefields(driver);

        AllBattlefieldPage allBattlefieldPage = new AllBattlefieldPage();
        logger.info("Verifying All Battlefield Home Page");
        allBattlefieldPage.verifyAllBattlefieldHomePage(driver);
        logger.info("Completing All Challenges");
        allBattlefieldPage.completeAllBattlefieldChallenges(driver);

        LeaderBoardPage leaderBoardPage = new LeaderBoardPage();
        logger.info("Verifying Leaderboard Page");
        leaderBoardPage.verifyLeaderBoardPage(Username,driver);

        logger.info("Verifying User Score on Leaderboard Page");
        leaderBoardPage.verifyUserScore(Username,driver);
        return Username;

    }

    @Test
    public void do4000pointsChallenges()
    {
        String Username = this.createWarriorAndLogin();
        BattlefieldHomePage battlefieldHomePage = new BattlefieldHomePage();
        OfficePage officePage = new OfficePage();
        LeaderBoardPage leaderBoardPage = new LeaderBoardPage();

        int userScore =0;
        do {

            logger.info("Verify Battlefield Home Page for User " + Username);
            battlefieldHomePage.verifyBattlefieldHomePage(Username, driver);

            logger.info("Enter Office Page ");
            battlefieldHomePage.enterOfficePage(driver);

            logger.info("Verify Office Page ");
            officePage.verifyAndEnterOfficePage(driver);
            logger.info("Complete Answer of Office Page ");
            officePage.completeAnswerAndCheckLeaderBoard(driver);

            logger.info("Verifying Leaderboard Page");
            userScore = leaderBoardPage.verifyLeaderBoardPage(Username, driver);
            System.out.println("Current User Score " + userScore);

            leaderBoardPage.backToBattleHomepage(driver);
        }while (userScore<=4000);

    }

}

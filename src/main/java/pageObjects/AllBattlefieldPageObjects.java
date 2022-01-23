package pageObjects;

import org.openqa.selenium.By;

public interface AllBattlefieldPageObjects
{
    By noSecondChancesText = By.xpath("//*[contains(text(),'No second chances!')]");
    By startButton = By.id("start");
    By beginningText = By.id("h3_battlefieldh3_battlefield");
    By Answer1=By.id("answer_1");
    By Answer2=By.id("answer_2");
    By correctText=By.xpath("//*[contains(text(),'correct')]");
    By continueButton = By.id("continue");
    By continueReadingAnswer=By.xpath("//*[contains(text(),'Continue reading')]");
    By personalProtectiveAnswer=By.xpath("//*[contains(text(),'personal protective')]");
    By sanitizerAnswer=By.xpath("//*[contains(text(),'sanitizer')]");
    By socialDistancingAnswer=By.xpath("//*[contains(text(),'Social Distancing')]");
    By socialDistanceAnswer=By.xpath("//*[contains(text(),'Social Distance')]");
    By anotherSeatAnswer=By.xpath("//*[contains(text(),'another seat')]");
    By innerElbowAnswer=By.xpath("//*[contains(text(),'inner elbow')]");
    By possibleContaminationAnswer=By.xpath("//*[contains(text(),'possible contamination')]");
    By reasonableLogicAnswer=By.xpath("//*[contains(text(),'reasonable logic')]");
    By iKnowAnswer=By.xpath("//*[contains(text(),'Yes I know')]");
}

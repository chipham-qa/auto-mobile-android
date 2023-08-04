package helpers;

import pageObjects.PageObjectManager;

public class TestContextSetup
{
    public PageObjectManager pageObjectManager;
    public AppDriverManager appDriverManager;
    public TestContextSetup()
    {
        appDriverManager = new AppDriverManager();
        pageObjectManager = new PageObjectManager(appDriverManager.getDriver());
    }
}

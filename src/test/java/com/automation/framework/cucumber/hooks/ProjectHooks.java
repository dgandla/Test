package com.automation.framework.cucumber.hooks;

import com.automation.framework.cucumber.Pages.BasePage;
import com.automation.framework.cucumber.setup.InitializeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class ProjectHooks {
    private WebDriver driver;

    @Before
    public void before(Scenario scenario) {
        System.out.println("BEFORE: THREAD ID : " + Thread.currentThread().getId() + "," +
                "SCENARIO NAME: " + scenario.getName());
        driver = InitializeDriver.initializeDriver("chrome");
    }

    @After
    public void after(Scenario scenario) {
        System.out.println("AFTER: THREAD ID : " + Thread.currentThread().getId() + "," +
                "SCENARIO NAME: " + scenario.getName());
            driver.quit();
    }
}

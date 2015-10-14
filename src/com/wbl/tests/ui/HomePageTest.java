package com.wbl.tests.ui;

import com.wbl.base.BaseWebTest;
import com.wbl.pages.HomePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.*;

/**
 * Created by svelupula on 8/14/2015.
 */
public class HomePageTest extends BaseWebTest {

    private HomePage _hp;

    @BeforeClass
    public void beforeClass() {
        _hp = new HomePage(driver);
    }

    @Test(priority = 1, alwaysRun = true)
    public void testSlidesCount() throws IOException{
    driver.getwScreenshot().takeScreenShot(driver._configuration.TakeScreenShot, driver._configuration.ScreenFolderPath);
    assertEquals(8, _hp.getSliderItemsCount());
    driver.getwScreenshot().takeScreenShot(driver._configuration.TakeScreenShot,driver._configuration.ScreenFolderPath);
}

    @Test(priority = 2)
    public void testFBLink()
    {
        String url = _hp.getFacebookPage();
        assertTrue(url.contains("facebook"));
    }



}

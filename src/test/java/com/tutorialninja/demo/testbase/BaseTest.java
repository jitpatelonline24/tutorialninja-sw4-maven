<<<<<<< HEAD
package com.tutorialninja.demo.testbase;public class BaseTest {
=======
package com.tutorialninja.demo.testbase;

import com.tutorialninja.demo.propertyreader.PropertyReader;
import com.tutorialninja.demo.utilities.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");
    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }
>>>>>>> 55cc270 (Initial commit)
}

package LeanFTCucumberpack;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import unittesting.UnitTestClassBase;

import com.hp.lft.sdk.*;
import com.hp.lft.verifications.*;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber.json"},
                 features = "src/test/java/LeanFTCucumberpack")
public class LeanFtTest extends UnitTestClassBase {

    public LeanFtTest() {
        //Change this constructor to private if you supply your own public constructor
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        instance = new LeanFtTest();
        globalSetup(LeanFtTest.class);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        globalTearDown();
    }

}

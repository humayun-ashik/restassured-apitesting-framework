package apiautomation.BaseTest;

import apiautomation.utilities.PropertiesReader;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;
import io.restassured.response.Response;

public class BaseTest {

    public static Response response;
    protected static PropertiesReader propertiesReader = new PropertiesReader();

    public Logger logger;

    @BeforeClass
    public void setup(){

        logger=Logger.getLogger("REST API TEST");//added Logger
        PropertyConfigurator.configure("log4j.properties"); //added logger
        logger.setLevel(Level.DEBUG);

    }



}

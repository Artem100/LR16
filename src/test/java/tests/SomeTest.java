package tests;

import org.testng.annotations.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SomeTest {

    private static final Logger LOGGER = LogManager.getLogger(SomeTest.class.getName());

    @Test
    public void testOne(){
        LOGGER.info("Info Message Logged !!!");;
        System.out.println("Hello1");
        LOGGER.info("End of test !!!");
    }

    @Test
    public void testTwo(){
        LOGGER.info("Info Message Logged !!!");;
        System.out.println("Hello2");
        LOGGER.info("End of test !!!");
    }


}

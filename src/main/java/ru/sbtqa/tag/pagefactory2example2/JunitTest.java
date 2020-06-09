package ru.sbtqa.tag.pagefactory2example2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.sbtqa.tag.pagefactory.exceptions.PageException;
import ru.sbtqa.tag.pagefactory.junit.CoreSetupSteps;
import ru.sbtqa.tag.pagefactory.web.junit.WebSteps;

public class JunitTest {

    private static WebSteps steps;

    @BeforeClass
    public static void before() {
        steps = WebSteps.getInstance();
    }

    @Test
    public void webTestTitles() throws PageException {
    }

    @AfterClass
    public static void after() {
        CoreSetupSteps.tearDown();
    }
}

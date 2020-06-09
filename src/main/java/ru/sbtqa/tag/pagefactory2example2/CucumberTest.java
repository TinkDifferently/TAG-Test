package ru.sbtqa.tag.pagefactory2example2;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import ru.sbtqa.tag.pagefactory.Tag;

import java.util.ArrayList;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, plugin = {"pretty"},
        glue = {"ru.sbtqa.tag.stepdefs.ru","ru.sbtqa.external.glopdefs",
                "ru.sbtqa.tag.pagefactory2example2.stepdefs","ru.sbtqa.tag.glopdefs.ru"},
        features = {"src/test/resources/en/features/"}
)
public class CucumberTest extends Tag {

}
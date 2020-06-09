package ru.sbtqa.tag.pagefactory2example2.html.pages;

import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.HTMLPage;
import ru.sbtqa.tag.pagefactory.annotations.ActionTitle;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;
import ru.sbtqa.tag.pagefactory2example2.html.blocks.SearchRepositoriesBlock;
import ru.yandex.qatools.htmlelements.element.Link;

@PageEntry(title = "Test Automation Gears HTML 2")
public class MainPage extends HTMLPage {

    @ElementTitle("List of repos 2")
    public SearchRepositoriesBlock searchRepositoriesBlock;

    @ElementTitle("page-factory-2-example 2")
    @FindBy(xpath = "//a[@href='/sbtqa/page-factory-2-example']")
    public Link pageFactory2ExampleLink;

    @ElementTitle("Темная ссылка - одна ты такая")
    @FindBy(xpath = "//a[@href='/sbtqa/page-factory-2-example']")
    public Link darkLink;

    @ActionTitle("выбирает удивительную ветку")
    public void selectTestBranch() {
        System.out.println("потрясающая ветка");
    }
}

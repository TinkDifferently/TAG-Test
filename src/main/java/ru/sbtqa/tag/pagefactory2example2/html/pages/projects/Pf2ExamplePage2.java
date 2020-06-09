package ru.sbtqa.tag.pagefactory2example2.html.pages.projects;

import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.HTMLPage;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;
import ru.sbtqa.tag.pagefactory2example2.html.blocks.BranchMenuBlock;
import ru.yandex.qatools.htmlelements.element.Link;

@PageEntry(title = "Page-factory-2 example HTML 2")
public class Pf2ExamplePage2 extends HTMLPage {

    @ElementTitle("List of branches 2")
    public BranchMenuBlock branchMenuBlock;

    @ElementTitle("example.txt 2")
    @FindBy(xpath = "//a[text()='example.txt']")
    public Link example;
}

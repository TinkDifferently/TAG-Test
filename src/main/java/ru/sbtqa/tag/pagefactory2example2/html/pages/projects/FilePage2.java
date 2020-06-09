package ru.sbtqa.tag.pagefactory2example2.html.pages.projects;

import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.HTMLPage;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;
import ru.yandex.qatools.htmlelements.element.TextBlock;

@PageEntry(title = "Example HTML 2")
public class FilePage2 extends HTMLPage {

    @ElementTitle("Text 2")
    @FindBy(id = "LC1")
    public TextBlock textArea;
}

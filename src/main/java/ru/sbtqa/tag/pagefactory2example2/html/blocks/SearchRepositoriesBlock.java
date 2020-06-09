package ru.sbtqa.tag.pagefactory2example2.html.blocks;

import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.annotations.ActionTitle;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;
import ru.yandex.qatools.htmlelements.element.TextInput;

@FindBy(xpath = "//div[@class='TableObject']")
public class SearchRepositoriesBlock extends HtmlElement {

    @FindBy(xpath = ".//input[@id='your-repos-filter']")
    public TextInput searchInput;

    @FindBy(xpath = ".//div[contains(@class, 'ml-2')]/button")
    public Button type;

    @FindBy(xpath = ".//div[contains(@class, 'ml-1')]/button")
    public Button language;

    @ActionTitle("ищет репозиторий в блоке 2")
    @ActionTitle("search repo")
    public void selectTestBranch(String name) {
        searchInput.sendKeys(name);
    }

    @ElementTitle("page-factory-2-example в блоке 2")
    @FindBy(xpath = "//a[@href='/sbtqa/page-factory-2-example']")
    public Link pageFactory2ExampleLink;

    @ElementTitle("Обыкновенный блок")
    BranchMenuBlock branchMenuBlock;
}

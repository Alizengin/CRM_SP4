package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "logo_24_a")
    public WebElement homebutton;


    @FindBy(xpath = "//a[@href='#like']")
    public WebElement likeButton;

    @FindBy(css = "span[id='feed-post-more-114']")
    public WebElement moreButton;

    @FindBy(xpath = "//span[.='Add to favorites'][1]")
    public WebElement favButton;

    @FindBy(xpath = "//span[.='Remove from favorites'][1]")
    public WebElement RemovefavButton;



    @FindBy(id = "post-menu-807-link-text")
    public WebElement copyButton;

    @FindBy(xpath = "//*[text() = 'Add recipients'][1]")
    public WebElement recipientsButton;


    @FindBy(id = "U693")
    public WebElement h1user;

    @FindBy(id = "sharePostSubmitButton")
    public WebElement addButton;

    @FindBy(xpath = "//*[@id=\"feed-com-text-inner-BLOG_COMMENT-23\"]")
    public WebElement sharedMessage;

    @FindBy(id = "bx-ilike-result-reaction-like-BLOG_POST_115-1614864245")
    public WebElement likeButtonEmoji;

    @FindBy(id = "post-menu-807-link-icon-done")
    public WebElement doneEmoji;

}

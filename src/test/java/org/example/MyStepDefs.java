package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MyStepDefs{
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    ComputerPage computerPage = new ComputerPage();
    DesktopPage desktopPage = new DesktopPage();
    BuildYourOwnComputer buildYourOwnComputer = new BuildYourOwnComputer();
    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();
    NewsCommentPage newsCommentPage = new NewsCommentPage();
    NewsCommentResultPage newsCommentResultPage = new NewsCommentResultPage();
    ReferAFriendResultPage referAFriendResultPage = new ReferAFriendResultPage();

    @Given("user is on registration page")
    public void user_is_on_registration_page() {
        //Click on register
        homePage.clickOnRegistration();
        //verify user is on registration page
        registrationPage.verifyUserIsOnRegistrationPage();
    }
    @When("user enters required registration details")
    public void user_enters_required_registration_details() {
        //Enter registration details
        registrationPage.userEntersRegistrationDetails();
    }
    @When("click on register submit button")
    public void click_on_register_submit_button() {
        //click on register submit button
        registrationPage.clickOnRegisterSubmitButton();
    }
    @Then("user should able to register successfully")
    public void user_should_able_to_register_successfully() {
        //Verify user is on registration successfully page
        registrationResultPage.verifyUserIsOnRegistrationSuccessPage();
        //to verify user is successfully register
        registrationResultPage.userIsSuccessfullyRegister();

    }
    @Given("User is on computers category page")
    public void user_is_on_computers_category_page() {
        homePage.clickOnComputerMenu();
        computerPage.verifyUserIsOnComputerPage();
    }
    @When("User clicks on desktop category")
    public void user_clicks_on_desktop_category() {
        computerPage.userCanClickOnDesktopInComputerPage();
    }
    @Then("user should be able to navigate to desktop category page successfully")
    public void user_should_be_able_to_navigate_to_desktop_category_page_successfully() {
        desktopPage.verifyUserIsOnDesktopPage();
    }

    @When("user clicks on computers category")
    public void user_clicks_on_computers_category() {
       homePage.clickOnComputerMenu();
    }

    @When("user clicks on build your own computer item")
    public void user_clicks_on_build_your_own_computer_item() {
        desktopPage.clickOnBuildYourOwnComputer();
    }
    @And("user clicks on desktop category")
    public void userClicksOnDesktopCategory() {
        computerPage.verifyUserIsOnComputerPage();
        computerPage.userCanClickOnDesktopInComputerPage();
    }
    @When("user clicks on email a friend button")
    public void user_clicks_on_email_a_friend_button() {
        buildYourOwnComputer.verifyUseIsOnBuildYourOwnComputerPage();
        buildYourOwnComputer.clickOnEmailAFriend();
    }
    @When("user enters required detail on email a friend")
    public void user_enters_required_detail_on_email_a_friend() {
        emailAFriendPage.enterDetailsOnFieldForEmailAFriend();
    }
    @When("user clicks on send email button")
    public void user_clicks_on_send_email_button() {
     emailAFriendPage.clickOnSendEmailButton();
    }
    @Then("registered user should be able to refer a product successfully")
    public void registered_user_should_be_able_to_refer_a_product_successfully() {
        referAFriendResultPage.toVerifyUserReferAProductToAFriendSuccessfully();
    }


    @Given("User is on new online store is open page")
    public void user_is_on_new_online_store_is_open_page() {
        homePage.clickOnDetailUnderNews();
    }
    @When("User enters required details on leave your comments")
    public void user_enters_required_details_on_leave_your_comments() {
       newsCommentPage.verifyUserIsOnNewsCommentPage();
       newsCommentPage.userEntersComment();
    }
    @When("User clicks on new comment button")
    public void user_clicks_on_new_comment_button() {
        newsCommentPage.clickOnNewCommentButton();
    }
    @Then("User should be able to add news comment successfully")
    public void user_should_be_able_to_add_news_comment_successfully() {
        newsCommentResultPage.verifyUserIsOnCommentSuccessfullyAddedPage();
        newsCommentResultPage.NewsCommentIsSuccessfullyAdded();
    }
}

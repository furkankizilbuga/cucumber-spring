package com.demo.cucumber_spring.steps;

import com.demo.cucumber_spring.service.UserInfoService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@CucumberContextConfiguration
public class UserInfoSteps {

    @Autowired
    private UserInfoService userInfoService;

    private String username;
    private String password;
    private String message;

    @Given("Username is {string} and password is {string}")
    public void username_and_password(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @When("User tries logging in")
    public void user_tries_logging_in() {
        message = userInfoService.authenticate(username, password);
    }

    @Then("User should see {string} message")
    public void user_should_see_message(String expectedMessage) {
        assertEquals(expectedMessage, message);
    }

}

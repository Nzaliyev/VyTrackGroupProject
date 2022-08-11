package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.BasePage;
import com.cydeo.library.util.ConfigurationReader;
import com.cydeo.library.util.Driver;
import com.mysql.cj.exceptions.DataReadException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

public class B26G5_78_stepDef {

    BasePage basePage = new BasePage();

    @Given("the user log in to home page")
    public void the_user_log_in_to_home_page() {
       basePage.logInTruckDriver();
    }
    @When("the user clicks on Vehicle Service Log")
    public void the_user_clicks_on_vehicle_service_log() {
    }
    @When("the user creates new Vehicle Service Log")
    public void the_user_creates_new_vehicle_service_log() {
    }
    @Then("then user should see the new created Vehicle Service Log in the table")
    public void then_user_should_see_the_new_created_vehicle_service_log_in_the_table() {
    }

}

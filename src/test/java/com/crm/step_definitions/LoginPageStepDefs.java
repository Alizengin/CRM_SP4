package com.crm.step_definitions;

import com.crm.pages.LoginPage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class LoginPageStepDefs {

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {

        //go to login page
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();
        //based on input enter that user information
        String username =null;
        String password =null;

        if(userType.equals("HR")){
            username = ConfigurationReader.get("HR_username");
            password = ConfigurationReader.get("HR_password");
        }else if(userType.equals("Helpdesk")){
            username = ConfigurationReader.get("Helpdesk_username");
            password = ConfigurationReader.get("Helpdesk_password");
        }else if(userType.equals("Marketing")){
            username = ConfigurationReader.get("Marketing_username");
            password = ConfigurationReader.get("Marketing_password");
        }


        BrowserUtils.waitFor(1);
        //send username and password and login
        new LoginPage().login(username,password);

        System.out.println("When usertype is "+userType+" then PageTitle  = " + Driver.get().getTitle());

        Assert.assertTrue(Driver.get().getTitle().contains("Portal"));

    }


    @Given("the user can not logged in as {string}")
    public void the_user_can_not_logged_in_as(String Invalid_userType) {

        //go to login page
        Driver.get().get(ConfigurationReader.get("url"));
        //based on input enter that user information
        String username =null;
        String password =null;

        if(Invalid_userType.equals("invalid")){
            username = ConfigurationReader.get("invalid_username");
            password = ConfigurationReader.get("invalid_password");
        }else if(Invalid_userType.equals("")){
            username = ConfigurationReader.get("blank_username");
            password = ConfigurationReader.get("blank_password");
        }


        BrowserUtils.waitFor(1);
        //send username and password and login
        new LoginPage().login(username,password);

        System.out.println("When usertype is "+Invalid_userType+" then PageTitle  = " + Driver.get().getTitle());

        Assert.assertFalse(Driver.get().getTitle().contains("Portal"));

    }



}
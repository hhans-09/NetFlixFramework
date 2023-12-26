package com.tem.stepdefinitions;

import com.tem.app.Login;

import io.cucumber.java.en.Given;

public class CommonSteps {
	
	Login login;
	String userName = "heena";
	String password = "Password123";
	
	@Given("I have signed in NetFlix")
	public void i_have_signed_in_net_flix() {
		login = new Login(userName, password);
		System.out.println("Signing in .. "+ login.getUserName() + "-" + login.getPassword());
	    
	}

}

package com.tem.hooks;

import com.tem.utils.DependencyUtil;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {
	
	DependencyUtil service;
	
	public Hooks(DependencyUtil service) {
		this.service = service;
	}
	
	

	@Before
	public void beforeScenario(Scenario scenario) {
		service.scenario = scenario;
		System.out.println("Scenario starts here.." + service.scenario.getName());
	

	}

	@After
	public void afterScenario(Scenario scenario) {
		service.scenario = scenario;
		System.out.println("Scenario ends here.." + service.scenario.getName());

	}

}

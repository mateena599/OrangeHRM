package com.StepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="OrangeHRM",glue= {"com.OHRMApplicationTest"})

public class TestRunner 
{

}
 
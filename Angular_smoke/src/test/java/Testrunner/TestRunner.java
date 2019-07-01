package Testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features_smoketest",
//glue={"stepDefinition_HierarchySelection","stepDefinition_Login","stepDefinition_ResellerCreation","stepDefinition_MerchantAccount","stepDefinition_MerchantAccountConfigure","stepDefinition_MerchantGroup","stepDefinition_SalesAgentCreation"},
glue={"stepDefinition_MerchantBoarding","stepDefinition_Login"},
tags={"@Reseller"}
//,dryRun=true
)
public class TestRunner {

}
